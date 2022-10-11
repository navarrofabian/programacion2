package tp3.ej1;

public class Main {

    public static void main(String[] args) {

        Persona empleado1 = new Persona("juan", 1255421, true);
        Persona persona1 = new Persona("pedro", 4785144);
        Consultora consul1 = new Consultora("consultoraSA");

        Encuesta encuesta1 = new Encuesta(empleado1, persona1);

        Pregunta pregunta1 = new Pregunta("no se que preguntar?", 1);

        Respuesta respuesta1 = new Respuesta("no se que responder", 1);

        consul1.addEmpleado(empleado1);

        consul1.addEncuesta(encuesta1);

        encuesta1.addPregunta(pregunta1);
        encuesta1.addRespuesta(respuesta1, pregunta1.getNroPregunta());
        encuesta1.getRespuestas();

        consul1.getEncuestas();
        consul1.getCantEncuestas(empleado1);




    }

}
