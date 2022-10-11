package tp4.ej3;

import java.util.ArrayList;

public class Empresa {
    private String nombreEmpresa;

    private ArrayList<Empleado> empleados;


    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<Empleado>();
    }


}
