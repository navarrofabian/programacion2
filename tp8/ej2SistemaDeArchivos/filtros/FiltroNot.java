package tp8.ej2SistemaDeArchivos.filtros;

import tp8.ej2SistemaDeArchivos.ElementoFS;

public class FiltroNot extends Filtro{

    private Filtro filtroANegar;

    public FiltroNot(Filtro filtroANegar) {
        this.filtroANegar = filtroANegar;
    }

    @Override
    public boolean cumple(ElementoFS e) {
        return !filtroANegar.cumple(e);
    }
}
