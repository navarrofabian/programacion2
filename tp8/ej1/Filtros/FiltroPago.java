package tp8.ej1.Filtros;

import tp8.ej1.Socio;

public class FiltroPago extends Filtro {

    @Override
    public boolean cumple(Socio s) {
        return s.isCuotaPaga();
    }
}
