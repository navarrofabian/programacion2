package tp9.ej4.comportamiento;

import tp9.ej4.SeguroSimple;

public class CalculadorFijo extends Calculador{

    private double costoFijo;

    public CalculadorFijo(double costoFijo) {
        this.costoFijo = costoFijo;
    }
    @Override
    public double calcularCosto(SeguroSimple seguroSimple) {
        return costoFijo;
    }
}
