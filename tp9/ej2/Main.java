package tp9.ej2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        GastoDetallado g1 = new GastoDetallado( "gasto1", LocalDate.of(2016,01,01), 5200.00);

        g1.addCaracteristica("calidad media");
    }
}
