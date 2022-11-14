package tp8.ej3Navidad;

import java.util.ArrayList;

public class Carta{

    private Ninio remitente;
    private ArrayList<String> regalos;
    private static final String CARBON = "trozo de carbon";

    public Ninio getRemitente() {
        return remitente;
    }

    public boolean buscarRegalo(String  regalo){
        return regalos.contains(regalo);
    }

    public void setRemitente(Ninio remitente) {
        this.remitente = remitente;
    }

    public void addRegalo(String regalo) {
        regalos.add(regalo);
    }

    public void addCarbon(){
        regalos.clear();
        regalos.add(CARBON);
    }
}
