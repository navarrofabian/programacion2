package tp8.ej1;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuotaPaga;
    private ArrayList<Alquiler>alquileres;


    public Socio(String nombre, String apellido, int edad, boolean cuotaPaga){
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setCuotaPaga(cuotaPaga);
        this.alquileres = new ArrayList<Alquiler>();

    }

    public boolean alquilo(){
       return this.getCantAlquileres() > 0;
    }

    public boolean pago(){
        boolean res = false;
        for(Alquiler alquiler : alquileres){
            if(alquiler.getPrecioCancha() > 500.00){
                res = true;

            }
            break;
        }
        return res;
    }

    public int getCantAlquileres(){
        int cant = 0;
        for(Alquiler a : alquileres){
            if(a.getIdCancha() == 13){
                cant++;
            }
        }
        return cant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }

    public void addAlquiler(Alquiler alquiler) {
        if(!alquileres.contains(alquiler)){
            alquileres.add(alquiler);
        }
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<Alquiler>(alquileres);
    }


    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", cuotaPaga=" + cuotaPaga +
                ", alquileres=" + alquileres +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Socio otro = (Socio) obj;
            return this.getNombre().equals(otro.getNombre()) && this.getApellido().equals(otro.getApellido());
        } catch (Exception e){
            return false;
        }
    }


}
