package tp9.ej3.filtros;

import tp9.ej3.Recurso;
import tp9.ej3.Tarea;

public class FiltroRecurso extends Filtro{

    private Recurso recBuscado;

    @Override
    public boolean cumple(Tarea tarea) {
        return tarea.getRecursos().contains(recBuscado);
    }
}
