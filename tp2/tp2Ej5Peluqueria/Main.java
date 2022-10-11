package tp2.tp2Ej5Peluqueria;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Peluqueria peluqueria1 = new Peluqueria("peloloco", 10.0, 4, LocalTime.of(9,0), LocalTime.of(20,0));

        Peluquero p1 = new Peluquero ("juan", 1);
        Peluquero p2 = new Peluquero ("pepe", 2);
        Peluquero p3 = new Peluquero ("jose", 3);
        Peluquero p4 = new Peluquero ("pedro", 4);

        Cliente cliente1 = new Cliente("kdkdk");

        Turno t23 = new Turno (LocalDate.of(2022, 8, 7), LocalTime.of(9,0), LocalTime.of(10,0), cliente1, p1, 500);

        peluqueria1.addPeluquero(p1);
        peluqueria1.addPeluquero(p2);
        peluqueria1.addPeluquero(p3);
        peluqueria1.addPeluquero(p4);
        peluqueria1.addCliente(cliente1);
        peluqueria1.addTurno(t23,p1.getNumeroP());
        peluqueria1.cobrar(t23);

        Cliente cliente2 = new Cliente ("ddjdj");
        Cliente cliente3 = new Cliente ("ddjdj");
        Cliente cliente4 = cliente2;
        
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);






    }
}
