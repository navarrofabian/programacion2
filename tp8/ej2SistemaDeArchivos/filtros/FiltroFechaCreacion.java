package tp8.ej2SistemaDeArchivos.filtros;

import tp8.ej2SistemaDeArchivos.ElementoFS;

import java.time.LocalDate;

public class FiltroFechaCreacion extends Filtro{

    private LocalDate fechaLimite;

    public FiltroFechaCreacion(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public boolean cumple(ElementoFS e) {
        return e.getFechaCreac().compareTo(fechaLimite) < 0;
    }
}
