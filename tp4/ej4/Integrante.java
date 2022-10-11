package tp4.ej4;

import java.time.LocalDate;

public class Integrante {

    private String nombre;
    private String apellido;
    private long nroPasaporte;
    private LocalDate fechaNacimiento;
    private String Estado;


    public Integrante(String nombre, String apellido, long nroPasaporte, LocalDate fechaNacimiento, String estado) {
        setNombre(nombre);
        setApellido(apellido);
        setNroPasaporte(nroPasaporte);
        setFechaNacimiento(fechaNacimiento);
        setEstado(estado);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(long nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public boolean estaDisponible() {
        return getEstado().equals("en pais de origen");
    }
}
