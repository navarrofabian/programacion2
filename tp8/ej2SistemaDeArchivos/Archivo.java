package tp8.ej2SistemaDeArchivos;

import tp6.ej2.Elemento;
import tp8.ej2SistemaDeArchivos.filtros.Filtro;

import java.util.ArrayList;

public class Archivo extends ElementoFS {
    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public double getTamanio() {
        return 0;
    }

    @Override
    public int getCantElementos() {
        return 0;
    }

    @Override
    public ArrayList<ElementoFS> buscar(Filtro filtro) {
        ArrayList<ElementoFS> res = new ArrayList<>();
        filtro.cumple(this);
        res.add(this);
        return res;
    }
}
