package tp9.ej4;

import tp9.ej4.comportamiento.Calculador;
import tp9.ej4.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Seguro {

    public abstract double getMonto();
    public abstract int getNumeroPoliza();
    public abstract ArrayList<SeguroSimple> buscar(Filtro filtro, Comparator<SeguroSimple> comparator);

    public abstract double getCosto(Calculador calculador);


}
