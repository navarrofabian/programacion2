package tp6.ej2;

public class Computadora  extends Elemento{

    private double ghz;
    private String nombre;
    private Proceso proc;


    public Computadora(double ghz, String nombre) {
        this.setGhz(ghz);
        this.setNombre(nombre);
        proc = null;

    }

    public double getGhz() {
        return ghz;
    }

    public void setGhz(double ghz) {
        this.ghz = ghz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void ejecutarProceso(Proceso p){
        this.proc = p;

    }

    @Override
    public boolean esMayor(Elemento otro) {
        return this.getGhz() > ((Computadora) otro).getGhz();
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "ghz=" + ghz +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
