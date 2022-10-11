package tp5.ej2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String Apellido;
    private ArrayList<Cualidad> habilidades;

    public Alumno(String nombre, String Apellido) {
        this.setNombre(nombre);
        this.setApellido(Apellido);
        this.habilidades = new ArrayList<Cualidad>();

    }

    public boolean cumple(Cualidad cualidad) {
       return  this.habilidades.contains(cualidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void addCualidad(Cualidad c1) {
        habilidades.add(c1);
    }


}
