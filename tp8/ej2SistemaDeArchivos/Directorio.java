package tp8.ej2SistemaDeArchivos;

import tp8.ej2SistemaDeArchivos.filtros.Filtro;

import java.util.ArrayList;

public class Directorio extends ElementoFS {

    protected ArrayList<ElementoFS> elementos;

    public Directorio(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    @Override
    public double getTamanio() {
        double total = 0.0;
        for (ElementoFS eHijo : elementos) {
            total += eHijo.getTamanio();
        }
        return total;
    }
    public void addElemento(ElementoFS e) {
        if(!elementos.contains(e)){
            elementos.add(e);
        }
    }

    @Override
    public int getCantElementos() {
        return 0;
    }

    @Override
    public ArrayList<ElementoFS> buscar(Filtro filtro) {
        ArrayList<ElementoFS> result = new ArrayList<>();
        for(ElementoFS e: elementos){
                result.addAll(e.buscar(filtro));
        }
        return result;
    }

    public boolean equals(Object o) {
        try {
            ElementoFS otro = (ElementoFS) o;
            return this.getNombre().equals(otro.getNombre());
        }
        catch (Exception e) {
            return false;
        }
    }
}
