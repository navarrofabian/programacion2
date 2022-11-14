package tp9.ej4;

import tp9.ej4.comportamiento.Calculador;
import tp9.ej4.filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class SeguroTemporal extends Seguro{
    private Seguro contenido;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public SeguroTemporal(SeguroSimple seguroSimple, LocalDate fechaInicio, LocalDate fechaFin){
        this.contenido = seguroSimple;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public double getMonto() {
        if(vigente()){
            return contenido.getMonto();
        }
        return 0.0;
    }

    @Override
    public double getCosto(Calculador calculador) {
        if(vigente()){
            return contenido.getCosto(calculador);
        }
        return 0.0;
    }

    public boolean vigente(){
        if(fechaFin.isAfter(LocalDate.now())){
            return true;
        }
        return false;
    }

    @Override
    public int getNumeroPoliza() {
        return contenido.getNumeroPoliza();
    }

    @Override
    public ArrayList<SeguroSimple> buscar(Filtro filtro, Comparator<SeguroSimple> orden) {
        if(vigente()){
            return contenido.buscar(filtro, orden);
        }
        return new ArrayList<SeguroSimple>();

    }
}
