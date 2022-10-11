package tp2.tp2Ej5Peluqueria;

import java.util.ArrayList;

public class Peluquero {

    private String nombre;
    private int numeroP;
    private ArrayList<Turno> turnos;

    public Peluquero(String nombre, int numeroP){
        turnos = new ArrayList<Turno>();
        this.nombre = nombre;
        this.numeroP = numeroP;
    }

    public void addTurno(Turno t){
        if(!turnos.contains(t)){
            for(int i = 0; i < turnos.size(); i++){
                Turno tt = turnos.get(i);
                if(tt.noHayConflicto(t)){
                    turnos.add(t);
                }
            }
        }
    }

    public int getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
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
