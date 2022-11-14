package tp8.ej4SistemaElectoral.comparadores;

import tp8.ej4SistemaElectoral.Candidato;

import java.util.Comparator;

public class ComparadorAgrupacion implements Comparator<Candidato> {
    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getAgrupacion().compareTo(o2.getAgrupacion());
    }
}
