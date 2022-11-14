package tp8.ej4SistemaElectoral.filtros;

import tp8.ej4SistemaElectoral.Candidato;
import tp8.ej4SistemaElectoral.Voto;

public class FiltroCandidato extends Filtro{

    private Candidato candidatoBuscado;


    public FiltroCandidato(Candidato candidatoBuscado) {
        this.candidatoBuscado = candidatoBuscado;
    }

    @Override
    public boolean cumple(Voto voto) {
        return candidatoBuscado.equals(voto.getCandidato());
    }
}
