<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List,co.hospiencasa.model.Cita" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Hospiencasa | Gestión de citas</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css">
</head>
<body>
<header><h1>Hospiencasa</h1><p>Sistema web de gestión de citas veterinarias</p></header>
<main>
  <section class="panel">
    <h2>Registrar una cita</h2>
    <% if (request.getAttribute("error") != null) { %>
      <p class="alerta"><%= request.getAttribute("error") %></p>
    <% } %>
    <% if ("1".equals(request.getParameter("guardada"))) { %>
      <p class="exito">La cita fue registrada correctamente.</p>
    <% } %>
    <form action="${pageContext.request.contextPath}/citas" method="post">
      <label>Nombre del propietario<input name="propietario" type="text" maxlength="80" required></label>
      <label>Nombre de la mascota<input name="mascota" type="text" maxlength="60" required></label>
      <label>Especie
        <select name="especie" required><option value="">Seleccione</option><option>Canino</option><option>Felino</option><option>Otro</option></select>
      </label>
      <label>Fecha<input name="fecha" type="date" required></label>
      <label>Hora<input name="hora" type="time" required></label>
      <label>Motivo de la consulta<textarea name="motivo" rows="3" maxlength="250" required></textarea></label>
      <button type="submit">Guardar cita</button>
    </form>
  </section>
  <section class="panel">
    <h2>Citas registradas</h2>
    <div class="tabla">
    <table>
      <thead><tr><th>ID</th><th>Propietario</th><th>Mascota</th><th>Especie</th><th>Fecha</th><th>Hora</th><th>Motivo</th></tr></thead>
      <tbody>
      <% List<Cita> citas = (List<Cita>) request.getAttribute("citas");
         if (citas == null || citas.isEmpty()) { %>
        <tr><td colspan="7">Todavía no hay citas registradas.</td></tr>
      <% } else { for (Cita cita : citas) { %>
        <tr><td><%= cita.getId() %></td><td><%= cita.getPropietario() %></td>
        <td><%= cita.getMascota() %></td><td><%= cita.getEspecie() %></td>
        <td><%= cita.getFecha() %></td><td><%= cita.getHora() %></td><td><%= cita.getMotivo() %></td></tr>
      <% }} %>
      </tbody>
    </table>
    </div>
  </section>
</main>
<footer>Proyecto académico SENA · Análisis y Desarrollo de Software</footer>
</body></html>
