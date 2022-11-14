package tp9.ej4.filtros;

import tp9.ej4.SeguroSimple;

public class FiltroOr extends Filtro{

    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }


    @Override
    public boolean cumple(SeguroSimple seguroSimple) {
        return f1.cumple(seguroSimple) || f2.cumple(seguroSimple);
    }
}
