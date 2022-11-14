package tp9.ej5;

import tp9.ej5.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoComunicacion {

    public abstract void notificacion(Notificacion n);

    public abstract int cantMensajes();

    public abstract int cantEmpleados();

    public abstract ArrayList<Empleado> buscar(Filtro filtro, Comparator<Empleado> orden);

}
