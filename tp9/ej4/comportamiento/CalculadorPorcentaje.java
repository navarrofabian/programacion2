package tp9.ej4.comportamiento;

import tp9.ej4.SeguroSimple;

public class CalculadorPorcentaje extends Calculador{

    private double porcentaje;

    public CalculadorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }


    @Override
    public double calcularCosto(SeguroSimple seguroSimple) {
        return seguroSimple.getMonto() * porcentaje;
    }
}
