package tp6.ej2;

import java.util.ArrayList;

public class ColaEspera {

    private ArrayList<Elemento> elementos;

    public ColaEspera(){
        elementos = new ArrayList<Elemento>();

    }

    public Elemento getSiguiente(){
        if(this.tieneElementos()){
            return elementos.remove((0));
        }
        else return null;

    }

    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }



    public void addElemento(Elemento e1){
        boolean insert = false;
        int i = 0;
        while(!insert && i < elementos.size()){
            if(e1.esMayor(elementos.get(i))){
                elementos.add(i, e1);
                insert = true;
            }
            i++;

        }
        if(!insert){
            elementos .add(e1);
        }

    }

}


