package tp3.ej1;

import java.util.ArrayList;

public class Consultora {

    private String nombre;
    private ArrayList<Encuesta> regEncuestas;
    private double plus;
    private ArrayList<Persona>empleados;


    public Consultora(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<Persona>();
        this.regEncuestas = new ArrayList<Encuesta>();
    }


    public void addEncuesta(Encuesta encuesta1){
        regEncuestas.add(encuesta1);

    }
    public void addEmpleado(Persona empleado){
        if(!empleados.contains(empleado)){
            this.empleados.add(empleado);
        }
    }

    public ArrayList<Encuesta> getEncuestas(){
        return regEncuestas;
    }

    public int getCantEncuestas(Persona empleado){
        int cantEncuestas = 0;
        for(int i = 0; i < this.regEncuestas.size(); i++){
            if(regEncuestas.get(i).getEmpleado().equals(empleado)){
                cantEncuestas++;
            }
        }
        return cantEncuestas;
    }



}
