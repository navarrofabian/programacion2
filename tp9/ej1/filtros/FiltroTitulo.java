package tp9.ej1.filtros;

import tp9.ej1.Noticia;

public class FiltroTitulo extends Filtro{


    private String tituloBuscado;


    public FiltroTitulo(String tituloBuscado) {
        this.tituloBuscado = tituloBuscado;
    }


    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(tituloBuscado);
    }
}
