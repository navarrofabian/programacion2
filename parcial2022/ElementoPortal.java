package parcial2022;

import parcial2022.filtros.Filtro;

import java.util.ArrayList;

public abstract class ElementoPortal {

    public abstract ArrayList<String> getPalabrasClaves();

    public abstract String getCategoria();

    public abstract ArrayList<Noticia> buscar(Filtro filtro);
}
