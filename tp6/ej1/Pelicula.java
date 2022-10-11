package tp6.ej1;

import java.time.LocalDate;

public class Pelicula extends Item{

    private String titulo;
    private LocalDate fechaLanzamiento;
    private int cantCopias;

    public Pelicula(LocalDate fechaI, LocalDate fechaF,String titulo, LocalDate fechaLanzamiento,int cantCopias){
        super(fechaI, fechaF);
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.cantCopias = cantCopias;
    }

    @Override
    public boolean alquilar(Item item, Cliente client) {
        return false;
    }
}
