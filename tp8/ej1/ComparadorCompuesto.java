package tp8.ej1;

import java.util.Comparator;

public class ComparadorCompuesto  implements Comparator<Socio> {

    private Comparator<Socio> c1;
    private Comparator<Socio> c2;

    public ComparadorCompuesto(Comparator<Socio> c1, Comparator<Socio> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public int compare(Socio o1, Socio o2) {
        int result = c1.compare(o1, o2);
        if (result == 0 && c2 != null)
            return c2.compare(o1, o2);
        return result;
    }
}
