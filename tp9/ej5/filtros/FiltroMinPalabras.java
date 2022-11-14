package tp9.ej5.filtros;

import tp9.ej5.Notificacion;

public class FiltroMinPalabras extends Filtro{

    private int cantMaxPalabras;

    public FiltroMinPalabras(int cantMaxPalabras) {
        this.cantMaxPalabras = cantMaxPalabras;
    }

    @Override
    public boolean cumple(Notificacion notificacion) {
        String[] words = notificacion.getMensaje().split("\\s+");
        return words.length < this.cantMaxPalabras;
    }
}
