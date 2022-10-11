package tp1.elementosGeometricos2.tp1Ej1Persona;

public class Electrodomestico {
    private String nombre;
    private int precioBase = 100;
    private String color = "Gris Plata";
    private int consumoEnergetico = 10;
    private int peso = 2;



    public Electrodomestico(){

    }
    public Electrodomestico(int peso, int precioBase){
        this.peso = peso;
        this.precioBase = precioBase;

    }

    public Electrodomestico(String nombre, int precioBase, String color, int consumoEnergetico, int peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean getBajoConsumo() {
        int consumoEnergetico = getConsumoEnergetico();
        if (consumoEnergetico < 45) {
            return true;
        }
        return false;

    }

    public int getBalance() {
        int costo = getPrecioBase();
        int peso = getPeso();
        int balance = peso - costo;
        return balance;
    }

     public boolean getAltaGama () {
        int balance = getBalance();
        return balance > 3;
     }
}
