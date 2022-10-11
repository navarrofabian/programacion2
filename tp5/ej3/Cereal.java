package tp5.ej3;

import java.util.ArrayList;

public class Cereal {

    private String nombreCereal;
    private ArrayList<Mineral> minRequeridos;

    public Cereal(String nombreCereal) {
        this.setNombreCereal(nombreCereal);
        this.minRequeridos = new ArrayList<Mineral>();

    }

    public boolean seCumple(Lote l1){
        boolean result = true;
        for (Mineral m : minRequeridos){
            if(!l1.tieneMineral(m)){
                result = false;
                break;
            }
        }
        return result;
    }

    public String getNombreCereal() {
        return nombreCereal;
    }

    public void setNombreCereal(String nombreCereal) {
        this.nombreCereal = nombreCereal;
    }

    public boolean equals(Object o) {
        try {
            Cereal otro = (Cereal) o;
            if(this.getNombreCereal().equals(otro.getNombreCereal())){
                return true;
            }
            else {
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
}

