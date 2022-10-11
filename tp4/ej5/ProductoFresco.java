package tp4.ej5;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
    public ProductoFresco(LocalDate fechaVencimento, long nroLote, LocalDate fechaEnvasado, String granjaOrigen) {
        super(fechaVencimento, nroLote, fechaEnvasado, granjaOrigen);
    }
}
