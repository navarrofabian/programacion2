package tp9.ej4.comportamiento;

import tp9.ej4.SeguroSimple;

public class CalculadorSuma extends Calculador{

    private Calculador c1;
    private Calculador c2;

    public CalculadorSuma(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcularCosto(SeguroSimple seguroSimple) {
        return c1.calcularCosto(seguroSimple) + c2.calcularCosto(seguroSimple);
    }
}
