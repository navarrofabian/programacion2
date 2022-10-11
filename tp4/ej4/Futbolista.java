package tp4.ej4;

import java.time.LocalDate;

public class Futbolista extends Integrante {

    private String posicion;
    private String piernaHabil;
    private int cantGoles;

    public Futbolista(String nombre, String apellido, long nroPasaporte, LocalDate fechaNacimiento, String estado, String posicion, String piernaHabil, int cantGoles) {
        super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.cantGoles = cantGoles;
    }
}
