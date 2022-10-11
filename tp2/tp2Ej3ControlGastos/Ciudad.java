package tp2.tp2Ej3ControlGastos;

import java.util.ArrayList;

public class Ciudad {

    private String nombreCiudad;
    private int cantHabitantes;
    private double totalGastos;
    private ArrayList<Impuesto> recaudacion;

    public Ciudad(String nombreCiudad, int cantHabitantes, double totalGastos) {
        setNombreCiudad(nombreCiudad);
        setCantHabitantes(cantHabitantes);
        setTotalGastos(totalGastos);
        recaudacion = new ArrayList<Impuesto>();

    }


    public void addRecaudacion(Impuesto imp1, Impuesto imp2, Impuesto imp3, Impuesto imp4, Impuesto imp5 ){
        if(controlarCiudad()){
            recaudacion.add(imp1);
            recaudacion.add(imp2);
            recaudacion.add(imp3);
            recaudacion.add(imp4);
            recaudacion.add(imp5);
        }

    }
    public double getTotalRecaudacion() {
        double totalRecaudacion = 0;
        for(int i=0; i<recaudacion.size(); i++){
            Impuesto imp = recaudacion.get(i);
            totalRecaudacion += imp.getRecaudacionImpuesto();
        }
        return totalRecaudacion;
    }

    public boolean controlarCiudad(){
        if(cantHabitantes >= Pais.minHabitantes){
            return true;
        }
        else {
            return false;
        }

    }
     public double getBalance(){
         return getTotalRecaudacion() - getTotalGastos();
     }



    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public double getTotalGastos() {
        return totalGastos;
    }

    public void setTotalGastos(double totalGastos) {
        this.totalGastos = totalGastos;
    }
}
