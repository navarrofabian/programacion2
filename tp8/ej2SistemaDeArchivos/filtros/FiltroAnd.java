package tp8.ej2SistemaDeArchivos.filtros;

import tp8.ej2SistemaDeArchivos.Archivo;
import tp8.ej2SistemaDeArchivos.ElementoFS;

public class FiltroAnd extends Filtro{

    private Filtro filtro1;
    private Filtro filtro2;


    public FiltroAnd(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(ElementoFS e) {
        return filtro1.cumple(e) && filtro2.cumple(e);
    }
}
