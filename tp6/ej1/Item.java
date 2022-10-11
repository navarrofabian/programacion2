package tp6.ej1;

import java.time.LocalDate;

public abstract class Item {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;


    public Item(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public abstract boolean alquilar(Item item, Cliente client);

}
