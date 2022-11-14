package tp9.ej4.filtros;

import tp9.ej4.SeguroSimple;

public class FiltroPalabra extends Filtro{

    private String palabraBuscada;


    public FiltroPalabra(String palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }


    @Override
    public boolean cumple(SeguroSimple seguroSimple) {
        return seguroSimple.getDescripcion().toLowerCase().contains(palabraBuscada);
    }
}
