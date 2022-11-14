package tp9.ej2;

import java.time.LocalDate;

public class GastoSimple extends GastoAbstracto{

    private double monto;

    public GastoSimple(String descpripcion, LocalDate fecha, double monto) {
        super(descpripcion, fecha);
        this.monto = monto;

    }

    @Override
    public double getMonto() {
        return monto;
    }
}
