package tp8.ej5arbolBinario;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Hoja h1 = new Hoja(1);
        Hoja h3 = new Hoja(4);
        Hoja h4 = new Hoja(7);

        NodoCompuesto c8 = new NodoCompuesto(8);

        NodoCompuesto c3 = new NodoCompuesto(3);

        NodoCompuesto c6 = new NodoCompuesto(6);

        c8.addNodo(c3);
        c3.addNodo(h1);
        c3.addNodo(c6);
        c6.addNodo(h3);
        c6.addNodo(h4);
        ArrayList<Nodo> arbolLista = c8.recorrerArbol();

       // System.out.println("lista: " + arbolLista);
        System.out.println("lista del " + c8.getValor() + " " + c8.recorrerArbol());

    }

}
