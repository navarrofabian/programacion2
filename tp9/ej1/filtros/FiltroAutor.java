package tp9.ej1.filtros;

import tp9.ej1.Noticia;

public class FiltroAutor extends Filtro{

    private String AutorBuscado;


    public FiltroAutor(String AutorBuscado) {
        this.AutorBuscado = AutorBuscado;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getAutor().equals(AutorBuscado);
    }
}
