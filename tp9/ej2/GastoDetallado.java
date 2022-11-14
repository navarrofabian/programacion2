package tp9.ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public class GastoDetallado extends GastoAbstracto{

    private ArrayList<GastoAbstracto> gastos;

    public GastoDetallado(String descpripcion, LocalDate fecha) {
        super(descpripcion, fecha);
        this.gastos = new ArrayList<>();
    }


    @Override
    public double getMonto() {
        return 0;
    }
}
