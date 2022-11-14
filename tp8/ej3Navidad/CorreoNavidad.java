package tp8.ej3Navidad;

import java.util.ArrayList;

public class CorreoNavidad {

    private ArrayList<Buzon> buzones;

    public CorreoNavidad() {
        buzones = new ArrayList<>();
    }

    public void addBuzon(Buzon buzon) {
        buzones.add(buzon);
    }
}
