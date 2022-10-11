package tp5.ej2;

public class Main {
    public static void main(String[] args){

        Escuela Hogwarts = new Escuela();

        Casa Ravenclaw = new Casa(100);

        Alumno alumn1 = new Alumno("harry", "potter");

        Hogwarts.agregarACasa(Ravenclaw, alumn1);

    }


}
