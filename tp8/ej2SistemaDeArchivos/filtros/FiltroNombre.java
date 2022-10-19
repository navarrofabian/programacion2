package tp8.ej2SistemaDeArchivos.filtros;

import tp8.ej2SistemaDeArchivos.ElementoFS;

public class FiltroNombre extends Filtro{

    private String palabraBuscada;

    public FiltroNombre(String palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    @Override
    public boolean cumple(ElementoFS e) {
        return e.getNombre().toLowerCase().contains(palabraBuscada.toLowerCase());
    }
}
