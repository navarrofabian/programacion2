package tp8.ej4SistemaElectoral;

public class Persona {

    private Long dni;

    public Persona(Long dni) {
        this.setDni(dni);
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public boolean equals(Object o) {
        try {
            Persona persona = (Persona) o;
            return this.getDni() .equals(persona.getDni());
        }
        catch (Exception e) {
            return false;
        }
    }
}
