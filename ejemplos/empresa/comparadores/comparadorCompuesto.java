package ejemplos.empresa.comparadores;

import ejemplos.empresa.Empleado;

import java.util.Comparator;

public class comparadorCompuesto implements Comparator<Empleado>{

    private Comparator<Empleado> c1;
    private Comparator<Empleado> c2;

    public comparadorCompuesto(Comparator<Empleado> c1, Comparator<Empleado> c2) {

    }

    @Override
    public int compare(Empleado o1, Empleado o2) {
        int result = c1.compare(o1, o2);
        if (result == 0 && c2 != null)
            return c2.compare(o1, o2);
        return result;
    }
}
