package tp8.ej4SistemaElectoral;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voto {

    private Persona votante;
    private Candidato candidato;
    private LocalTime hora;

    public Voto(Persona votante){
        this.votante = votante;
        this.hora = LocalTime.now();
    }

    public Voto(Persona votante, Candidato candidato){
        this.votante = votante;
        this.candidato = candidato;
        this.hora = LocalTime.now();
    }

    public Candidato getCandidato(){
        return candidato;
    }

    public LocalTime getHora(){
        return hora;
    }

}
