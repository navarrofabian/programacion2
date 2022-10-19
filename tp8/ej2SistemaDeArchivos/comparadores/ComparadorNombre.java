package tp8.ej2SistemaDeArchivos.comparadores;

import tp8.ej2SistemaDeArchivos.ElementoFS;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoFS> {

    @Override
    public int compare(ElementoFS e1, ElementoFS e2) {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}
