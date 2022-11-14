package tp9.ej3;

import tp9.ej3.filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;

public class TareaCompuesta extends Tarea {

    private ArrayList<Tarea> tareas;

    public TareaCompuesta() {
        this.tareas = new ArrayList<Tarea>();
    }

    @Override
    public LocalDate getFechaInicio(){
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaInicioActual;
        for(Tarea t : tareas){
            fechaInicioActual = t.getFechaInicio();
            if(fechaInicioActual.isBefore(fechaInicio)){
                fechaInicio = fechaInicioActual;
            }
        }
        return fechaInicio;
    }

    @Override
    public LocalDate getFechaFin(){
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaInicioActual;
        for(Tarea t : tareas){
            fechaInicioActual = t.getFechaFin();
            if(fechaInicioActual.isAfter(fechaInicio)){
                fechaInicio = fechaInicioActual;
            }
        }
        return fechaInicio;
    }

    @Override
    public ArrayList<Tarea> buscar(Filtro filtro){

        ArrayList<Tarea> resultado = new ArrayList<>();
        for(Tarea tarea : tareas){
            resultado.addAll(tarea.buscar(filtro));
        }
        return resultado;
    }

    @Override
    public ArrayList<Recurso> getRecursos() {
        return null;
    }

    @Override
    public boolean usaRecurso(Recurso recurso) {

        for(Tarea tarea : tareas){
            if(tarea.usaRecurso(recurso)){
                return true;
            }
        }
        return false;

    }
}
