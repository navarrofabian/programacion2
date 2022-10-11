package tp5.ej2;

import java.util.ArrayList;

public class Escuela {
    private ArrayList<Casa> casas;

    public Escuela() {

    }

    public void agregarACasa(Casa c1, Alumno a1){
        boolean pertenece = false;
        for(Casa c: casas){
           if(c.pertenece(a1)){
               pertenece = true;
           }
        }
        if(!pertenece){
            c1.addAlumno(a1);
        }
    }


}
