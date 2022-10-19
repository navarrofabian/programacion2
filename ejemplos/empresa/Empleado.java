package ejemplos.empresa;

import java.util.ArrayList;

public class Empleado extends ElementoEmpresa{

    private String nombre;
    private String apellido;
    private String especialidad;
    private double sueldo;


    public Empleado(String nombre, String apellido, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
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
        apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Empleado empleado = (Empleado) obj;
            return this.getNombre().equals(empleado.getNombre()) &&
                    this.getApellido().equals(empleado.getApellido());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public int cantEmpleados() {
        return 1;
    }

    @Override
    public double gastoSueldos() {
       return this.getSueldo();
    }

    @Override
    public ArrayList<Empleado> empleadosConEsp(String especialidad) {
        ArrayList<Empleado> empleado = new ArrayList<Empleado>();
        if(this.getEspecialidad().equals(especialidad)){
            empleado.add(this);
        }
        return empleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", sueldo=" + sueldo +
                '}' + "\n";
    }
}

