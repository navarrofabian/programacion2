package tp2;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Reunion> reuniones;
    private ArrayList<Contacto> contactos;

    public Agenda() {
        reuniones = new ArrayList<Reunion>();
        contactos = new ArrayList<Contacto>();
    }
    public void addContact(Contacto contacto) {
        if(!contactos.contains(contacto)){
            contactos.add(contacto);
        }
    }

    public boolean addReunion(Reunion reunion1) {
        if(!reuniones.contains(reunion1)){
            for(int i=0; i<reuniones.size(); i++) {
                Reunion r = reuniones.get(i);
                if(!r.tieneConflicto(reunion1.getFecha(),reunion1.getHoraInicio())){
                    reuniones.add(reunion1);
                    return true;
                }
            }
        }
        return false;
    }

}
