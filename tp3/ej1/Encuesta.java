package tp3.ej1;

import java.util.ArrayList;

public class Encuesta {

    private ArrayList<Pregunta> preguntas;
    private ArrayList<Respuesta> respuestas;
    private Persona encuestado;
    private Persona empleado;

    public Encuesta(Persona empAsig, Persona encuestado) {
        preguntas = new ArrayList<>();
        respuestas = new ArrayList<>();
        this.encuestado = encuestado;
        this.empleado = empAsig;
    }

    public void addPregunta(Pregunta pregunta){
        preguntas.add(pregunta);
    }

    public void addRespuesta(Respuesta respuesta, int nroPregunta){
        respuestas.add(nroPregunta, respuesta);
    }

    public ArrayList<Respuesta> getRespuestas(){
        return respuestas;
    }

    public Persona getEmpleado() {
        return empleado;
    }
}
