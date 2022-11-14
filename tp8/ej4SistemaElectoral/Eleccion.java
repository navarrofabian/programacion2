package tp8.ej4SistemaElectoral;

import java.util.ArrayList;

public class Eleccion {

    public ArrayList<Candidato> candidatos;



    public Eleccion() {
        this.candidatos = new ArrayList<Candidato>();
    }

    public ArrayList<Candidato> getCandidatos() {
        return new ArrayList<Candidato>(candidatos);
    }
}
