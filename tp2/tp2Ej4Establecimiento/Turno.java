package tp2.tp2Ej4Establecimiento;

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {

    private LocalDate fecha;
    private LocalTime horario;
    private double ValorTurno;
    private Usuario usuario;





    public Turno(LocalDate fecha, LocalTime horario,Usuario usuario) {
        setFecha(fecha);
        setHorario(horario);
        setUsuario(usuario);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getValorTurno() {
        return ValorTurno;
    }

    public void setValorTurno(double valorTurno) {
        ValorTurno = valorTurno;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Usuario getUsuario() {
        return usuario;

    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;

    }

}
