package parcial2022;

import parcial2022.filtros.Filtro;

import java.util.ArrayList;

public class NoticiaCompuesta extends ElementoPortal {

    private ArrayList<ElementoPortal> elementos;
    private int posicion;
    private String defecto;

    private ArrayList<Clasificador> clasificadores;



    @Override
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> result = new ArrayList<String>();
        for (ElementoPortal e : elementos) {
            ArrayList <String> aux = e.getPalabrasClaves();
            for (String s : aux) {
                if(!result.contains(s)){
                    result.add(s);
                }
            }
        }
        return result;
    }



    @Override
    public String getCategoria() {
        if(posicion < elementos.size()){
            return elementos.get(posicion).getCategoria();
        }
        else{
            return defecto;
        }
    }

    @Override
    public ArrayList<Noticia> buscar(Filtro filtro) {
        ArrayList<Noticia> result = new ArrayList<Noticia>();
        for(ElementoPortal e : elementos){
            result.addAll(e.buscar(filtro));
        }
        return result;
    }

}
