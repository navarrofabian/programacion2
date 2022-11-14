package tp9.ej2;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class GastoAbstracto {

    private String descpripcion;
    private LocalDate fecha;
    private ArrayList<String> otrasCaracteristicas;


    public GastoAbstracto(String descpripcion, LocalDate fecha) {
        this.setDescpripcion(descpripcion);
        this.setFecha(fecha);
        this.otrasCaracteristicas = new ArrayList<String>();
    }


    public String getDescpripcion() {
        return descpripcion;
    }

    public void setDescpripcion(String descpripcion) {
        this.descpripcion = descpripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public void addCaracteristica(String caracteristica) {
        if(!otrasCaracteristicas.contains(caracteristica)) {
            otrasCaracteristicas.add(caracteristica);
        }
    }

    public abstract double getMonto();


}
