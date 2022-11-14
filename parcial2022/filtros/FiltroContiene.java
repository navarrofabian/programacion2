package parcial2022.filtros;

import parcial2022.Noticia;

public class FiltroContiene extends Filtro{

    private String palabra;

    @Override
    public boolean cumple(Noticia n) {
        return n.getContenido().contains(palabra);
    }
}
