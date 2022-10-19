package tp8.ej6arbolBinario;

import java.util.ArrayList;

public abstract class Nodo implements Comparable<Nodo> {

    private int valor;


    public Nodo(int valor) {
        this.valor = valor;
    }

    public abstract ArrayList<Nodo> recorrerArbol();

    public int getValor() {
        return valor;
    }

    public int compareTo(Nodo nodo) {
        return 0;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Nodo "  + valor;
    }
}
