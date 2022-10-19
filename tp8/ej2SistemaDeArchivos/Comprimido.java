package tp8.ej2SistemaDeArchivos;

import tp8.ej2SistemaDeArchivos.filtros.Filtro;

import java.util.ArrayList;

public class Comprimido extends Directorio{
    public Comprimido(String nombre) {
        super(nombre);
    }

    @Override

    public ArrayList<ElementoFS> buscar(Filtro f){
        ArrayList<ElementoFS> aux = new ArrayList<>();
        for (ElementoFS e : elementos){
            if(f.cumple(e)) {
                aux.add(this);
                break;
            }
        }
        return aux;
    }


    /*

    public ArrayList<ElementoFS> buscar(Filtro f){
        ArrayList<ElementoFS> aux = new ArrayList<>();
        boolean encontro = false;
        int i = 0;
        while(i < elementos.size() &&!encontro) {
            if(f.cumple(elementos.get(i))) {
                encontro = true;
            }
            i++;
        }
        if(encontro) {
            aux.add(this);
        }
        return aux;
    }

     */
}
