package tp7a.ej1Agroquimicos;

import tp7a.ej1Agroquimicos.Cultivo;
import tp7a.ej1Agroquimicos.Enfermedad;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private ArrayList<Cultivo> noAplicables;
    private ArrayList<String> estadosPatologicos;

    public Producto(String nombre){
        this.setNombre(nombre);
        this.noAplicables = new ArrayList<Cultivo>();
        this.estadosPatologicos = new ArrayList<String>();

    }

    public boolean trata(Enfermedad enfermedad){
        for(String ep: estadosPatologicos){
            if(!enfermedad.trata(ep)){
                return false;
            }
        }
        return true;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCultivo(Cultivo c){
        noAplicables.add(c);
    }

}
