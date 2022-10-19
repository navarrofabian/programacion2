package ejemplos.empresa;

import tp6.ej2.Elemento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Grupo extends ElementoEmpresa {

    private String nombre;
    private ArrayList<ElementoEmpresa> elementos;


    public Grupo(String nombre) {
        this.nombre = nombre;
        elementos = new ArrayList<ElementoEmpresa>();

    }

    public void addElemento(ElementoEmpresa e){
        if(!elementos.contains(e)){
            elementos.add(e);
        }
    }

    public int cantEmpleados(){
        int cantTotal = 0;
        for(ElementoEmpresa e : elementos){
            cantTotal+=e.cantEmpleados();
        }
        return cantTotal;
    }

    @Override
    public double gastoSueldos() {
       double cantTotal = 0.0;
       for(ElementoEmpresa e : elementos){
           cantTotal+=e.gastoSueldos();
       }
       return cantTotal;
    }


    public ArrayList<Empleado> empleadosConEsp(String especialidad, Comparator<Empleado> orden) {
        ArrayList<Empleado> empleadosConEspecialidad = this.empleadosConEsp(especialidad);
        Collections.sort(empleadosConEspecialidad, orden);
        return empleadosConEspecialidad;
    }


    @Override
    public ArrayList<Empleado> empleadosConEsp(String especialidad) {

        ArrayList<Empleado> empleadosConEspecialidad = new ArrayList<Empleado>();
        //solucion descomprimida
        /*for(ElementoEmpresa e : elementos){
            ArrayList<Empleado> reParcial = e.empleadosConEsp(especialidad);
            for (Empleado emp : reParcial){
                EmpleadosConEspecialidad.add(emp);
            }
        }
         */
        //solucion compacta
        for (ElementoEmpresa e : elementos){
            empleadosConEspecialidad.addAll(e.empleadosConEsp(especialidad));
        }
        return empleadosConEspecialidad;

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Grupo grupo = (Grupo) obj;
            return this.getNombre().equals(grupo.getNombre());
        } catch (Exception e){
            return false;
        }
    }
}
