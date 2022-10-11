package tp7a.ej1Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {

    private String nombre;
    private ArrayList<String> estadosPatologicos;


    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<String>();
    }

    public boolean trata(String estadoPatologico){
        return  estadosPatologicos.contains(estadoPatologico);
    }

    public String getNombre() {
        return nombre;
    }

    public boolean equals(Object o) {
        try {
            Enfermedad otro = (Enfermedad)o;
            if(this.getNombre().equals(otro.getNombre())) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
