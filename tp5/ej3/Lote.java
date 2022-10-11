package tp5.ej3;

import java.util.ArrayList;

public class Lote {
    private ArrayList<Mineral> minerales;
    private int nroLote;
    private double hectareas;

    public Lote(int nroLote, double hectareas) {
        this.setNroLote(nroLote);
        this.setHectareas(hectareas);

    }

    public boolean puedeSembrar(Cereal c1){
        return c1.seCumple(this);

    }

    public boolean tieneMineral(Mineral m1){
        return minerales.contains(m1);
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public double getHectareas() {
        return hectareas;
    }

    public void setHectareas(double hectareas) {
        this.hectareas = hectareas;
    }
}
