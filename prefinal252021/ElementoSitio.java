package prefinal252021;

import prefinal252021.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoSitio {

    public abstract ArrayList<Video> buscar(Filtro filtro, Comparator orden);

    public abstract ArrayList<String> getPalabrasClaves();

    public abstract int getCantVideos();

    public abstract double getDuracion();

}
