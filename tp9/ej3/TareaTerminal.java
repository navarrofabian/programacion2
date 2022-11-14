package tp9.ej3;

import tp9.ej3.comportamiento.Estado;
import tp9.ej3.filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaTerminal extends Tarea {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaInicioReal;
    private LocalDate fechaFinReal;
    private ArrayList<Recurso> recursos;
    private Estado estado;

    public TareaTerminal(LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaInicioReal, LocalDate fechaFinReal, Estado estado) {
        this.setFechaInicio(fechaInicio);
        this.setFechaFin(fechaFin);
        this.setFechaInicioReal(fechaInicioReal);
        this.setFechaFinReal(fechaFinReal);
        this.estado = estado;
        this.recursos = new ArrayList<Recurso>();

    }

    public ArrayList<Recurso> getRecursos(){
        return new ArrayList<Recurso>(recursos);
    }

    @Override
    public boolean usaRecurso(Recurso recurso) {
        return getRecursos().contains(recurso);
    }

    public void addRecurso(Recurso recurso){
        if(!recursos.contains(recurso)){
            recursos.add(recurso);
        }
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    @Override
    public ArrayList<Tarea> buscar(Filtro filtro) {
        ArrayList<Tarea> ret = new ArrayList<Tarea>();
        if (filtro.cumple(this)){
            ret.add(this);
        }
        return ret;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(LocalDate fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    public LocalDate getFechaFinReal() {
        return fechaFinReal;
    }

    public void setFechaFinReal(LocalDate fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }

}
