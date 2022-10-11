package tp2.tp2Ej4Establecimiento;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Establecimiento est1 = new Establecimiento("est1");
        Cancha canchaPadel1 = new Cancha("canchaPadel");
        Usuario user1 = new Usuario("user1");
        Usuario user2 = new Usuario("user2");
        Usuario user3 = new Usuario("user3");
        Usuario user4 = new Usuario("user4");
        Turno turno15 = new Turno(LocalDate.of(2022, 1, 1), LocalTime.of(15,30), user1);

        canchaPadel1.asignarCancha(turno15, est1.getSocios());
        //est1.getSocios();

    }
}
