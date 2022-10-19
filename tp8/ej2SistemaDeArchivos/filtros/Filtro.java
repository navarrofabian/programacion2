package tp8.ej2SistemaDeArchivos.filtros;

import tp8.ej2SistemaDeArchivos.Archivo;
import tp8.ej2SistemaDeArchivos.ElementoFS;

public abstract class Filtro {

    public abstract boolean cumple(ElementoFS e);
}
