package tp5.ej2;

import java.util.ArrayList;

public class Casa {
    private int maxIntegrantes;
    private ArrayList<Cualidad> requisitos;
    protected ArrayList<Alumno> integrantes;

    public Casa(int maxIntegrantes){
        this.setMaxIntegrantes(maxIntegrantes);
        this.integrantes = new ArrayList<>();
        this.requisitos = new ArrayList<>();

    }

    public void addAlumno(Alumno a1){
        if((hayLugar())&&(cumpleRequisitos(a1))){
            integrantes.add(a1);
        }
    }

    public boolean hayLugar(){
        return(integrantes.size() <= getMaxIntegrantes());

    }

    public boolean cumpleRequisitos(Alumno a1){
        int j = 0;
        for (Cualidad c : requisitos) {
            if(a1.cumple(c)){
                j++;
            }
        }
        return j == requisitos.size();
    }
    public boolean pertenece(Alumno a1){
        return this.integrantes.contains(a1);
    }

    public int getMaxIntegrantes() {
        return maxIntegrantes;
    }

    public void setMaxIntegrantes(int maxIntegrantes) {
        this.maxIntegrantes = maxIntegrantes;

    }


}
