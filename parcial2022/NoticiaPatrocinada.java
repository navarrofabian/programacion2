package parcial2022;

import parcial2022.filtros.Filtro;

import java.util.ArrayList;

public class NoticiaPatrocinada extends Noticia {

    @Override
    public ArrayList<Noticia> buscar(Filtro filtro){
        ArrayList<Noticia> result = new ArrayList<Noticia>();
        result.add(this);
        return result;
    }

}
