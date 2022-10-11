package tp7a.ej1Agroquimicos;

import java.util.ArrayList;

public class Agronomia {

    private String nombre;
    private ArrayList<Producto> productos;


    public Agronomia(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<Producto>();
    }


    public ArrayList<Producto> getProductos(Enfermedad enfermedad){
        ArrayList<Producto> aux = new ArrayList<Producto>();
        for (Producto p : productos){
            if(p.trata(enfermedad)){
                aux.add(p);
            }
        }
        return aux;

    }


}
