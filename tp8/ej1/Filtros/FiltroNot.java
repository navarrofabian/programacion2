package tp8.ej1.Filtros;

import tp8.ej1.Socio;

public class FiltroNot extends Filtro {

    private Filtro filtroANegar;

    public FiltroNot(Filtro filtroANegar) {

        this.filtroANegar = filtroANegar;

    }

    @Override
    public boolean cumple(Socio s) {
        return ! this.filtroANegar.cumple(s);
    }

}
