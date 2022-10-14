package ejemplos.empresa;

import java.util.ArrayList;

public class EmpleadoCrack extends Empleado {
    public EmpleadoCrack(String nombre, String apellido, String especialidad, double sueldo) {
        super(nombre, apellido, especialidad, sueldo);
    }
    @Override
    public ArrayList<Empleado> empleadosConEsp(String especialidad) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(this);
        return empleados;

    }
}
