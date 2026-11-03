package co.hospiencasa.servlet;

import co.hospiencasa.repository.CitaRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/citas")
public class CitaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("citas", CitaRepository.listar());
        request.getRequestDispatcher("/WEB-INF/vistas/citas.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String propietario = request.getParameter("propietario");
        String mascota = request.getParameter("mascota");
        String especie = request.getParameter("especie");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        String motivo = request.getParameter("motivo");

        if (vacio(propietario) || vacio(mascota) || vacio(especie)
                || vacio(fecha) || vacio(hora) || vacio(motivo)) {
            request.setAttribute("error", "Todos los campos son obligatorios.");
            request.setAttribute("citas", CitaRepository.listar());
            request.getRequestDispatcher("/WEB-INF/vistas/citas.jsp").forward(request, response);
            return;
        }
        CitaRepository.guardar(propietario.trim(), mascota.trim(), especie,
                               fecha, hora, motivo.trim());
        response.sendRedirect(request.getContextPath() + "/citas?guardada=1");
    }

    private boolean vacio(String valor) {
        return valor == null || valor.trim().isEmpty();
    }
}
