package parcial2022;

import java.util.ArrayList;

public class PortalNoticias {

    private ArrayList<Clasificador> clasificadores;

    public void clasificarNoticia(Noticia n){
        for(Clasificador c: clasificadores){
            c.clasificar(n);
        }
    }
}
