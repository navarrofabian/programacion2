package tp4.ej4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Integrante persona1 = new Integrante("juan", "Perez", 11144254, LocalDate.of(1990, 1, 1), "Viajando" );

        Futbolista juanp = new Futbolista("juan", "Perez", 11144254, LocalDate.of(1990, 1, 1), "Viajando", "delantero", "derecha", 289);

        System.out.println(persona1.getEstado());

        System.out.println(juanp.getEstado());

        System.out.println(juanp.estaDisponible());


    }
}
