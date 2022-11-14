package tp8.ej5arbolBinario;

import java.util.ArrayList;


public class NodoCompuesto extends Nodo {


    private ArrayList<Nodo> nodos;

    public NodoCompuesto(int valor) {
        super(valor);
        this.nodos = new ArrayList<Nodo>();
    }

    @Override
    public ArrayList<Nodo> recorrerArbol(){
        ArrayList<Nodo> resultado = new ArrayList<>();
        for (Nodo nodoHijo : nodos){
            resultado.add(nodoHijo);
            System.out.println(nodoHijo.recorrerArbol());
            nodoHijo.recorrerArbol();
        }
        return resultado;
    }

    @Override
    public int compareTo(Nodo n) {
        return 0;
    }

    public void addNodo(Nodo n) {
        if(!nodos.contains(n) &&  nodos.size()<=2){
            this.nodos.add(n);
        }
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Nodo otro = (Nodo) obj;
            return this.getValor() == (otro.getValor());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nodo:" + getValor() + " " +
                "nodos hijos = " + nodos;
    }
}
