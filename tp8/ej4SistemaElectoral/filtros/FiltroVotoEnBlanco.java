package tp8.ej4SistemaElectoral.filtros;

import tp8.ej4SistemaElectoral.Voto;

public class FiltroVotoEnBlanco extends Filtro{
    @Override
    public boolean cumple(Voto voto) {
        return voto.getCandidato() == null;
    }
}
