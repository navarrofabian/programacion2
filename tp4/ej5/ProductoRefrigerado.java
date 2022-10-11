package tp4.ej5;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
    public ProductoRefrigerado(LocalDate fechaVencimento, long nroLote, LocalDate fechaEnvasado, String granjaOrigen) {
        super(fechaVencimento, nroLote, fechaEnvasado, granjaOrigen);
    }
}
