package tp5.ej3;

import java.util.ArrayList;

public class Cooperativa {

    private String nombreCoopertativa;
    private ArrayList<Mineral> mineralesInteres;
    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;


    public Cooperativa(String nombreCoopertativa) {
        this.setNombreCoopertativa(nombreCoopertativa);
        this.cereales = new ArrayList<Cereal>();

    }

    public boolean esEspecial(Lote l1){
        boolean result = false;
        for ( Mineral m : mineralesInteres){
            if(l1.tieneMineral(m)){
                result = true;
                break;
            }
        }
        return result;
    }

    public ArrayList<Cereal> getCereales(Lote l1){
        ArrayList<Cereal> aux = new ArrayList<Cereal>();
        for (Cereal cl : cereales){
            if(l1.puedeSembrar(cl)){
                aux.add(cl);
            }
        }
        return aux;
    }

    public ArrayList<Lote> getLotes(Cereal c1){
        ArrayList<Lote> aux = new ArrayList<Lote>();
        for (Lote l1 : lotes){
            if(l1.puedeSembrar(c1)){
                aux.add(l1);
            }
        }
        return aux;
    }

    public String getNombreCoopertativa() {
        return nombreCoopertativa;
    }

    public void setNombreCoopertativa(String nombreCoopertativa) {
        this.nombreCoopertativa = nombreCoopertativa;
    }
}
