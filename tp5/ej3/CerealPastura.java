package tp5.ej3;

public class CerealPastura extends Cereal {
    public CerealPastura(String nombreCereal) {
        super(nombreCereal);
    }

    public boolean SeCumple(Lote l1){
        if (super.seCumple(l1)){
            return l1.getHectareas() >= 50.0;
        }
        else return false;
    }
}
