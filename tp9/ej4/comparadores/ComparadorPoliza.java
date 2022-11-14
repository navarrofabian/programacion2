package tp9.ej4.comparadores;

import tp9.ej4.SeguroSimple;

import java.util.Comparator;

public class ComparadorPoliza implements Comparator<SeguroSimple> {

    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        return o1.getNumeroPoliza()- o2.getNumeroPoliza();
    }
}
