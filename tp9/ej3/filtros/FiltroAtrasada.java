package tp9.ej3.filtros;

import tp9.ej3.Tarea;

import java.time.LocalDate;

public class FiltroAtrasada extends Filtro{
    @Override
    public boolean cumple(Tarea tarea) {
        return tarea.getFechaFin().isAfter(LocalDate.now());
    }
}
