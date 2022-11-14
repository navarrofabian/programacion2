package parcial2022;

import parcial2022.filtros.Filtro;

import java.util.ArrayList;

public class Clasificador {

    private ArrayList<String> palabras;
    private Filtro cond;

    public void clasificar(Noticia n){
        if(cond.cumple(n)){
            for(String p : palabras){
                n.addPalabraClave(p);
            }
        }
    }
}
