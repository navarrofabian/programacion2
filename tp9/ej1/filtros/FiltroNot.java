package tp9.ej1.filtros;

import tp9.ej1.Noticia;

public class FiltroNot extends Filtro{

    private Filtro filtroANegar;

    public FiltroNot(Filtro filtroANegar) {
        this.filtroANegar = filtroANegar;
    }

    @Override
    public boolean cumple(Noticia n) {
        return !filtroANegar.cumple(n);
    }
}
