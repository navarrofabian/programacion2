package tp1;

import java.util.Calendar;
public class Persona {

    private String nombre = "N";
    private String apellido = "N";

    private int edad;
    private String fechaNacimiento = "01/01/2000";
    private int dni;

    private String sexo = "femenino";
    private int peso = 1;
    private int altura = 1;
    Calendar calendario = Calendar.getInstance();



    public Persona(int dni){
        this.dni = dni;

    }


    public Persona (int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public Persona (int dni,String nombre,String apellido, String fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona (int dni,String nombre,String apellido,int edad, String fechaNacimiento,String sexo, int peso, int altura){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getMasaCorporal(){
    return (this.altura / this.peso);
    }

    public boolean getEnForma(){
        int masa = getMasaCorporal();
        double min = 18.5;
        double max = 25.0;
        if(masa > min && masa < max){
            return true;
        }
        else {
            return false;
        }
    }
        public boolean getEsSuCumpleanos() {
            int diaNacimiento = Integer.parseInt(fechaNacimiento.substring(0, 2));
            int mesNacimiento = Integer.parseInt(fechaNacimiento.substring(3, 5));
            return (diaNacimiento == calendario.get(Calendar.DATE) && mesNacimiento == calendario.get(Calendar.MONTH));
    }

    public boolean getEsMayor(){
        return edad >= 18;
    }

    public boolean getPuedeVotar(){
        return edad >= 16;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public boolean getEdadCoherente() {
        int anioNacimiento = Integer.parseInt(fechaNacimiento.substring(6));
        return (calendario.get(Calendar.YEAR - anioNacimiento)) == edad;
    }

    public String getinformacion() {
        String info = "\nNombre: " + nombre +" " + "\nApellido: "+ apellido+" " + "\nEdad: " + edad+" " + "\nfechaNacimiento: " + fechaNacimiento+" " + "\nDni: " + dni+" "  + "\nPeso: " + peso+" " + "\nAltura: " + altura+" "   + "\nSexo: " + sexo+" ";
        return info;

    }
}
