package tp2.tp2Ej5Peluqueria;

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {

    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Cliente cliente;
    private Peluquero peluquero;
    private double precio;

    public Turno(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Cliente cliente, Peluquero peluquero, double precio) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.cliente = cliente;
        this.peluquero = peluquero;
        this.precio = precio;
    }


    public boolean noHayConflicto(Turno turno) {
        return (this.horaInicio != turno.getHoraInicio() && this.horaFin != turno.getHoraFin());
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
    }

    public double getPrecio(double porcentaje, boolean esFrecuente) {
        if(esFrecuente){
            precio = precio - (precio * porcentaje);
        }
        return precio;
    }
}
