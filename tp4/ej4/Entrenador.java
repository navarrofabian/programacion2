package tp4.ej4;

import java.time.LocalDate;

public class Entrenador extends Integrante {

    private long idFederacion;

    public Entrenador(String nombre, String apellido, long nroPasaporte, LocalDate fechaNacimiento, String estado, long idFederacion) {
        super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
        this.idFederacion = idFederacion;
    }
}
