package ejemplos.empresa.comparadores;

import ejemplos.empresa.Empleado;

import java.util.Comparator;

public class ComparadorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado e1, Empleado e2) {
        return (int) (e1.getSueldo() - e2.getSueldo());
    }
}
