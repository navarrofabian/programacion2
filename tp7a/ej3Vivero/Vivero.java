package tp7a.ej3Vivero;

import java.util.ArrayList;

public class Vivero {

    private String nombre;
    private ArrayList<Planta> plantas;


    public Vivero(String nombre) {
        this.nombre = nombre;
    }

    public void addPlanta(Planta p) {
        if(!plantas.contains(p)){
            plantas.add(p);
        }
    }

    public ArrayList<Planta> buscar(Filtro filtro){
        ArrayList<Planta> resultado = new ArrayList<Planta>();

        for(Planta p : plantas){
            if(filtro.cumple(p)){
                resultado.add(p);
            }
        }
        return resultado;
    }


}
