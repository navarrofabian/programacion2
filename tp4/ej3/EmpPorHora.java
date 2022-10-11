package tp4.ej3;

public class EmpPorHora extends Empleado {
    private int cantHorasExtras;
    private double precioHora;

    public EmpPorHora(double salarioFijo, int cantHorasExtras) {
        super(salarioFijo);
        this.cantHorasExtras = cantHorasExtras;
        this.precioHora = 100.0;
    }

    public double getSalario() {
        return super.getSalario() + this.totalExtra();
    }

    public double totalExtra(){
        return precioHora * cantHorasExtras;
    }
}
