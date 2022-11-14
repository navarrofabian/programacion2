package tp8.ej3Navidad.filtros;

import tp8.ej3Navidad.Carta;

public class FiltroRegalo extends Filtro {

    private String regalo;

    public FiltroRegalo(String regalo) {
        this.regalo = regalo;
    }


    @Override
    public boolean cumple(Carta c) {
        return c.buscarRegalo(regalo);
    }
}
