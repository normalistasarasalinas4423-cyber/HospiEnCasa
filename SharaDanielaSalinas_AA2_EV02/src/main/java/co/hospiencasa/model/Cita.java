package co.hospiencasa.model;

public class Cita {
    private final int id;
    private final String propietario, mascota, especie, fecha, hora, motivo;

    public Cita(int id, String propietario, String mascota, String especie,
                String fecha, String hora, String motivo) {
        this.id = id; this.propietario = propietario; this.mascota = mascota;
        this.especie = especie; this.fecha = fecha; this.hora = hora; this.motivo = motivo;
    }
    public int getId() { return id; }
    public String getPropietario() { return propietario; }
    public String getMascota() { return mascota; }
    public String getEspecie() { return especie; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getMotivo() { return motivo; }
}
