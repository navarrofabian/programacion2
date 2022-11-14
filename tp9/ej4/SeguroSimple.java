package tp9.ej4;

import tp9.ej4.comportamiento.Calculador;
import tp9.ej4.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class SeguroSimple extends Seguro {

    private int dni;
    private String descripcion;
    private int nroPoliza;
    private double montoAsegurado;


    public SeguroSimple(int dni, String descripcion, int nroPoliza, double montoAsegurado) {
        this.dni = dni;
        this.descripcion = descripcion;
        this.nroPoliza = nroPoliza;
        this.montoAsegurado = montoAsegurado;
    }

    @Override
    public double getMonto() {
        return montoAsegurado;
    }

    @Override
    public int getNumeroPoliza() {
        return nroPoliza;
    }

    @Override
    public ArrayList<SeguroSimple> buscar(Filtro filtro, Comparator<SeguroSimple> orden) {
        ArrayList<SeguroSimple> seg = new ArrayList<SeguroSimple>();

        if(filtro.cumple(this)){
            seg.add(this);
        }
        return seg;
    }


    @Override
    public double getCosto(Calculador calculador) {
        return calculador.calcularCosto(this);
    }

    public int getDni() {
        return dni;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
