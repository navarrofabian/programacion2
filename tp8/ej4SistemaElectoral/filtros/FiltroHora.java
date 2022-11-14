package tp8.ej4SistemaElectoral.filtros;

import tp8.ej4SistemaElectoral.Voto;

import java.time.LocalTime;

public class FiltroHora extends Filtro{

    private LocalTime horaInicio;
    private LocalTime horaFin;

    @Override
    public boolean cumple(Voto voto) {
        return voto.getHora().isAfter(horaInicio) && voto.getHora().isBefore(horaFin);
    }


}
