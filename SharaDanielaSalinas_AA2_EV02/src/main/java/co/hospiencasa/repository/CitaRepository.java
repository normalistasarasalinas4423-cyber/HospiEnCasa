package co.hospiencasa.repository;

import co.hospiencasa.model.Cita;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class CitaRepository {
    private static final List<Cita> CITAS = new CopyOnWriteArrayList<>();
    private static final AtomicInteger SECUENCIA = new AtomicInteger(1);

    public static void guardar(String propietario, String mascota, String especie,
                               String fecha, String hora, String motivo) {
        CITAS.add(new Cita(SECUENCIA.getAndIncrement(), propietario, mascota,
                           especie, fecha, hora, motivo));
    }
    public static List<Cita> listar() {
        return Collections.unmodifiableList(new ArrayList<>(CITAS));
    }
}
