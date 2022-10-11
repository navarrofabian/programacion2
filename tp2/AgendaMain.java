package tp2;

import java.time.LocalDate;
import java.time.LocalTime;

/*2 Agenda Personal
Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el
tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo
contactos telefónicos y mail de los asistentes.
Consejo: No todos los objetos son “palpables”
Extra: ¿Quién detecta un conflicto de horarios?
 */
public class AgendaMain {


    public static void main(String[] args) {

        Contacto contact1 = new Contacto( "contact1" , "contact1", 124451, false );
        Reunion reunion1 = new Reunion("calle1y2", "lgbts", LocalDate.of(2016,01,01), LocalTime.of(5, 30), LocalTime.of(8 ,30));
        Agenda agenda1 = new Agenda();
        agenda1.addContact(contact1);
        agenda1.addReunion(reunion1);
    }
}


