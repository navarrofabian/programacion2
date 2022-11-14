package tp9.ej4;

import tp9.ej4.comportamiento.Calculador;
import tp9.ej4.filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SeguroIntegrador extends Seguro {

    private int dni;
    private ArrayList<Seguro> seguros;

    public SeguroIntegrador(int dni){
        this.dni = dni;
        this.seguros = new ArrayList<Seguro>();
    }


    @Override
    public double getMonto() {
        double monto = 0.0;
        for(Seguro seguro : seguros){
            monto += seguro.getMonto();
        }
        return monto;
    }

    @Override
    public int getNumeroPoliza() {
        int numeroPoliza = -1;
        for(Seguro seguro : seguros){
            if(seguro.getNumeroPoliza() > numeroPoliza){
                numeroPoliza = seguro.getNumeroPoliza();
            }
        }
        return numeroPoliza;
    }

    @Override
    public ArrayList<SeguroSimple> buscar(Filtro filtro, Comparator<SeguroSimple>orden) {
        ArrayList<SeguroSimple> res = new ArrayList<>();
        for(Seguro seguro : seguros){
            res.addAll(seguro.buscar(filtro, orden));
        }
        Collections.sort(res, orden);
        return res;
    }

    @Override
    public double getCosto(Calculador calculador) {
        double costo = 0.0;
        for(Seguro seguro : seguros){
            costo += seguro.getCosto(calculador);
        }
        return costo;
    }
}
