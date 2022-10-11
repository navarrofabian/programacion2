package tp2.tp2Ej5Peluqueria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private ArrayList<Turno> turnos;


    public Cliente(String nombre){
        this.nombre = nombre;
        turnos = new ArrayList<Turno>();

    }

    public boolean esFrecuente(){
        boolean result = false;
        LocalDate hoy = LocalDate.now();
        for (Turno t : turnos) {
            result = t.getFecha().getMonthValue() + 1 == hoy.getMonthValue();
        }
        return result;
    }

    public void addTurno(Turno t){

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
}
