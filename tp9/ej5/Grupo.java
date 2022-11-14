package tp9.ej5;

import tp9.ej5.comportamiento.Restriccion;
import tp9.ej5.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class Grupo extends ElementoComunicacion{


    private String nombreGrupo;
    private ArrayList<ElementoComunicacion> elementos;
    private Restriccion restriccionGrupo;


    public Grupo(String nombreGrupo, Restriccion restriccionGrupo){
        this.nombreGrupo = nombreGrupo;
        this.elementos = new ArrayList<ElementoComunicacion>();
        this.restriccionGrupo = restriccionGrupo;
    }

    public void addElemento(ElementoComunicacion e){
        this.elementos.add(e);
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    @Override
    public void notificacion(Notificacion notificacion) {

            for(ElementoComunicacion e : elementos){
                if(restriccionGrupo.permiteEnvio(notificacion)){
                    e.notificacion(notificacion);
                }

        }
    }

    @Override
    public int cantMensajes() {
        int cantMensajes = 0;

        for(ElementoComunicacion e : elementos){
             e.cantMensajes();
        }
        return cantMensajes;
    }

    @Override
    public int cantEmpleados() {
        int cant = 0;
        for(ElementoComunicacion e : elementos){
            cant += e.cantEmpleados();
        }
        return cant;
    }

    @Override
    public ArrayList<Empleado> buscar(Filtro filtro, Comparator<Empleado> orden) {
        return null;
    }

}
