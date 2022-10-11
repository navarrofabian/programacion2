package tp4.ej4;

import java.time.LocalDate;

public class Masajista extends Integrante {

    private String titulo;
    private int cantExperiencia;

    public Masajista(String nombre, String apellido, long nroPasaporte, LocalDate fechaNacimiento, String estado, String titulo, int cantExperiencia) {
        super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
        this.titulo = titulo;
        this.cantExperiencia = cantExperiencia;
    }
}
