package tp2.tp2Ej3ControlGastos;

import java.util.ArrayList;

public class Pais {
    public static final int minHabitantes = 100000;

    private ArrayList<Provincia> provincias;
    private String nombrePais;

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
        this.provincias = new ArrayList<Provincia>();

    }
    public void addProvincia(Provincia provincia) {
        if (!provincias.contains(provincia)) {
            if(provincia.provinciaEnDeficit()){
                this.provincias.add(provincia);
            }
        }
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
}
