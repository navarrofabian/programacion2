package tp9.ej5;

import java.time.LocalDate;

public class Notificacion {

    private String mensaje;
    private Empleado remitente;
    private LocalDate fecha;

    public Notificacion(String mensaje, Empleado remitente, LocalDate fecha){
        this.mensaje = mensaje;
        this.remitente = remitente;
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Empleado getRemitente() {
        return remitente;
    }

    public void setRemitente(Empleado remitente) {
        this.remitente = remitente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Notificacion otro = (Notificacion) obj;
            return this.getMensaje().equals(otro.getMensaje()) && this.getRemitente().equals(otro.getRemitente()) && this.getFecha().equals(otro.getFecha());
        }
        catch (Exception e) {
            return false;
        }
    }



}
