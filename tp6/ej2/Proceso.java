package tp6.ej2;

public class Proceso extends Elemento{

    private String nombre;
    private double memRequerida;

    public Proceso(String nombre, double memRequerida) {
        this.setNombre(nombre);
        this.setMemRequerida(memRequerida);
    }

    public String getNombre() {
        return nombre;
    }

    public double getMemRequerida() {
        return memRequerida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMemRequerida(double memRequerida) {
        this.memRequerida = memRequerida;
    }
    @Override
    public boolean esMayor(Elemento otro) {
        return this.getMemRequerida() > ((Proceso) otro).getMemRequerida();
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", memRequerida=" + memRequerida +
                '}';
    }
}
