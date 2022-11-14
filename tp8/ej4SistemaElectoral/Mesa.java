package tp8.ej4SistemaElectoral;

import tp8.ej4SistemaElectoral.filtros.Filtro;

import java.util.ArrayList;

public class Mesa extends Lugar{

    private ArrayList<Persona> padron;
    private ArrayList<Voto> votos;

    public Mesa(String nombre) {
        super(nombre);
    }


    public void votar(Persona p, Candidato c){
        if(padron.contains(p)){
            Voto v;
            if(c != null){
                v = new Voto(p, c);
            }
            else{
                v = new Voto(p);
            }
            votos.add(v);
        }
    }

    public void addPersonaPadron(Persona p){
        if(!padron.contains(p)){
            padron.add(p);
        }
    }

    @Override
    public double getPorcenVotos(Filtro f){
        int votosFiltro = 0;
        for (Voto v : votos){
            if(f.cumple(v)){
                votosFiltro++;
            }
        }
        return (double) votosFiltro / votos.size() * 100;
    }

    public int getCantVotos(){
        return votos.size();
    }
}
