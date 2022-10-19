package tp8.ej1;

import java.util.Comparator;

public class ComparadorCantAlquileres implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getCantAlquileres() - o2.getCantAlquileres();
    }
}
