package tp8.ej1;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
