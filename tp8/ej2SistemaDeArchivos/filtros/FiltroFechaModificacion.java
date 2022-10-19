package tp8.ej2SistemaDeArchivos.filtros;

import tp8.ej2SistemaDeArchivos.ElementoFS;

import java.time.LocalDate;

public class FiltroFechaModificacion extends Filtro{

    private LocalDate fechaDesde;

    public FiltroFechaModificacion(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    @Override
    public boolean cumple(ElementoFS e) {
        return this.fechaDesde.compareTo(e.getFechaModif()) < 0;
    }
}
