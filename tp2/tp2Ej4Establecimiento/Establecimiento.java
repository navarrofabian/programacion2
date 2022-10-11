package tp2.tp2Ej4Establecimiento;

import java.util.ArrayList;

public class Establecimiento {
    private String nombreEst;
    private ArrayList<Usuario> socios;
    private ArrayList<Cancha> canchas;

    private ArrayList<Turno> historicoTurnos;

    public Establecimiento(String nombreEst){
        this.nombreEst = nombreEst;
        socios = new ArrayList<Usuario>();
        canchas = new ArrayList<Cancha>();
        historicoTurnos = new ArrayList<Turno>();
    }

    public ArrayList<Turno> getHistoricoTurnos() {
        return historicoTurnos;
    }

    public void setHistoricoTurnos(ArrayList<Turno> historicoTurnos) {
        this.historicoTurnos = historicoTurnos;
    }

    public ArrayList<Usuario> getSocios() {
        return socios;
    }
}
