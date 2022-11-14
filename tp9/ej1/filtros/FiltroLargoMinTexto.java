package tp9.ej1.filtros;

import tp9.ej1.Noticia;

public class FiltroLargoMinTexto extends Filtro{

    private int largoMinimo;

    public FiltroLargoMinTexto(int largoMinimo) {
        this.largoMinimo = largoMinimo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTexto().length() > largoMinimo;
    }
}
