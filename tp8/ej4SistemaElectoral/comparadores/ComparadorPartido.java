package tp8.ej4SistemaElectoral.comparadores;

import tp8.ej4SistemaElectoral.Candidato;

import java.util.Comparator;

public class ComparadorPartido implements Comparator<Candidato> {
    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getPartido().compareTo(o2.getPartido());
    }
}
