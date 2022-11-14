package tp9.ej1;

import tp9.ej1.filtros.Filtro;

import java.util.ArrayList;

public abstract class ElementoNoticia {

    public abstract int getCantNoticias();
    public abstract ElementoNoticia CopiaRestringida(Filtro filtro);
    public abstract ArrayList<ElementoNoticia> buscar(Filtro filtro);
    public abstract String toString();



}
