package tp8.ej5arbolBinario;

import java.util.ArrayList;

public class Hoja extends Nodo {

    public Hoja(int valor){
        super(valor);
    }

    @Override
    public ArrayList<Nodo> recorrerArbol() {
        ArrayList<Nodo> result = new ArrayList<Nodo>();
        result.add(this);
        return result;
    }


    @Override
    public int compareTo(Nodo o) {
        return 0;
    }
}
