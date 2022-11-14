package tp9.ej3;

import tp9.ej3.filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Tarea {

    public abstract LocalDate getFechaInicio();
    public abstract LocalDate getFechaFin();

    public abstract ArrayList<Tarea> buscar(Filtro filtro);

    public abstract ArrayList<Recurso>getRecursos();

    public abstract boolean usaRecurso(Recurso recurso);
}
