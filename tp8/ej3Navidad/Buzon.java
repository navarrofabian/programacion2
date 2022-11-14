package tp8.ej3Navidad;

import tp8.ej3Navidad.filtros.Filtro;

import java.util.ArrayList;

public class Buzon {

    private ArrayList<Ninio> niniosBuenos;
    private ArrayList<Carta> cartas;

    public Buzon() {
        niniosBuenos = new ArrayList<Ninio>();
    }

    public int getCantidad(Filtro filtro){
        int cantidad = 0;
        for(Carta c : cartas){
            if(filtro.cumple(c)){
                cantidad++;
            }
        }
        return cantidad;
    }

    public void addNinio(Ninio ninio) {
        if(!niniosBuenos.contains(ninio)){
            niniosBuenos.add(ninio);
        }
    }

    public int cantCartas() {
        return cartas.size();
    }



    public void depositarCarta(Carta carta){
        if(!niniosBuenos.contains(carta.getRemitente())){
            carta.addCarbon();
        }
        this.cartas.add(carta);


    }


}
