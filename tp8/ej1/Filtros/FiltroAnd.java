package tp8.ej1.Filtros;

import tp8.ej1.Socio;

public class FiltroAnd extends Filtro {

    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroAnd(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(Socio s) {
        return this.filtro1.cumple(s) && this.filtro2.cumple(s);
    }
}
