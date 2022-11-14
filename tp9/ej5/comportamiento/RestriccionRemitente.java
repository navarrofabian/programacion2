package tp9.ej5.comportamiento;

import tp9.ej5.Notificacion;

public class RestriccionRemitente extends Restriccion {
    @Override
    public boolean permiteEnvio(Notificacion notificacion) {
        return false;
    }
}
