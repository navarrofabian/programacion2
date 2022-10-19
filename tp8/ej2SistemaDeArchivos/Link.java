package tp8.ej2SistemaDeArchivos;

import tp8.ej2SistemaDeArchivos.filtros.Filtro;

import java.util.ArrayList;

public class Link extends ElementoFS {

    private static final double TAMANIO = 1.0;

    public Link(String nombre) {
        super(nombre);
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }

    @Override
    public int getCantElementos() {
        return 0;
    }

    @Override
    public ArrayList<ElementoFS> buscar(Filtro filtro) {
        ArrayList<ElementoFS> res = new ArrayList<ElementoFS>();
        if(filtro.cumple(this)){
            res.add(this);
        }
        return res;
    }
}
