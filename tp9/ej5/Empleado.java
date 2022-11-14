package tp9.ej5;

import tp9.ej5.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class Empleado extends ElementoComunicacion{

    private String nombre;
    private String apellido;
    private int edad;
    private int nroLegajo;
    private ArrayList<Notificacion> notificaciones;

    public Empleado(String nombre, String apellido, int edad, int nroLegajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nroLegajo = nroLegajo;
        this.notificaciones = new ArrayList<Notificacion>();
    }


    public void enviarMensaje(Notificacion mensaje, ElementoComunicacion destinatario){
        destinatario.notificacion(mensaje);
    }

    @Override
    public void notificacion(Notificacion n) {
        if(!notificaciones.contains(n)){
            notificaciones.add(n);
        }
    }

    @Override
    public int cantMensajes() {
        return notificaciones.size();
    }

    @Override
    public int cantEmpleados() {
        return 1;
    }

    @Override
    public ArrayList<Empleado> buscar(Filtro filtro, Comparator<Empleado> orden) {
        return null;
    }
}
