package tp9.ej3.filtros;

import tp9.ej3.Tarea;

public class FiltroExclusivo extends Filtro{

    @Override
    public boolean cumple(Tarea tarea) {
        return false;
    }
}
