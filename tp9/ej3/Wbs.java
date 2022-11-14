package tp9.ej3;

import tp9.ej3.filtros.Filtro;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Wbs {

    private ArrayList<Tarea> tareas;

    public Wbs() {
        this.tareas = new ArrayList<Tarea>();
    }



    public ArrayList<Tarea> getTareas(Filtro filtro){
        ArrayList<Tarea> result = new ArrayList<Tarea>();

        for(Tarea tarea : tareas){
            result.addAll(tarea.buscar(filtro));
        }
        return result;
    }

    public Period getDuracion(Tarea tarea){
       return Period.between(tarea.getFechaInicio(), tarea.getFechaFin());
    }

    public boolean sePuedeAsignar(Tarea tarea, Recurso recurso){

        for(Tarea t: tareas){
            if(t.usaRecurso(recurso) && !recurso.isExclusivo()){
                if(tarea.usaRecurso(recurso)){
                    return true;
                }
            }
        }
        return false;
    }
}
