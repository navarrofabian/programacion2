package tp7a.ej1Agroquimicos;

import java.util.ArrayList;

public class Cultivo {

    private String nombre;
    private ArrayList<Enfermedad> enfermedadesPosibles;


    public Cultivo(String nombre){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Object o) {
        try {
            Cultivo otro = (Cultivo)o;
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
