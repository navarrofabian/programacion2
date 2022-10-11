package tp4.ej5;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {
    public ProductoCongelado(LocalDate fechaVencimento, long nroLote, LocalDate fechaEnvasado, String granjaOrigen) {
        super(fechaVencimento, nroLote, fechaEnvasado, granjaOrigen);
    }
}
