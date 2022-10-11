package tp3.ej1;

public class Persona {

    private String nombre;
    private long dni;
    private boolean esEmpleado;



   public Persona(String nombre, long dni){
       this.nombre = nombre;
       this.dni = dni;

   }
    public Persona(String nombre, long dni, boolean esEmpleado){
        this.nombre = nombre;
        this.dni = dni;
        this.esEmpleado = esEmpleado;
    }
}
