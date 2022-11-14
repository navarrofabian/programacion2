package tp9.ej5.filtros;

import tp9.ej5.Notificacion;

public class FiltroPalabra extends Filtro{

    private String palabraBuscada;

    @Override
    public boolean cumple(Notificacion notificacion) {
        return false;
    }
}
