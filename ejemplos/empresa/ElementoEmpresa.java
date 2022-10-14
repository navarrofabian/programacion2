package ejemplos.empresa;

import java.util.ArrayList;

public abstract class ElementoEmpresa {


    public abstract int cantEmpleados();
    public abstract double gastoSueldos();

    public abstract ArrayList<Empleado> empleadosConEsp(String especialidad);
}
