package tp6.ej1;

import java.time.LocalDate;

public class Vehiculo extends Item{


    private String marca;
    private int kilometros;
    private String patente;
    private String tipo;

    public Vehiculo(LocalDate fechaI, LocalDate fechaF, String marca, int km, String patente, String tipo){
        super(fechaI, fechaF);
    }


    @Override
    public boolean alquilar(Item item, Cliente client) {
        return false;
    }

}
