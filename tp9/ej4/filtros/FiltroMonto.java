package tp9.ej4.filtros;

import tp9.ej4.SeguroSimple;

public class FiltroMonto extends Filtro{

    private double monto;

    public FiltroMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(SeguroSimple seguroSimple) {
        return seguroSimple.getMonto() > monto;
    }
}
