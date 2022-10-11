package tp6.ej1;

import java.util.ArrayList;

public class Alquiler {

    private String nombreLocal;

    private ArrayList<Pelicula> peliculas;

    private ArrayList<Vehiculo> vehiculos;

    public Alquiler(String nombreLocal) {
        this.setNombreLocal(nombreLocal);
        this.peliculas = new ArrayList<Pelicula>();
        this.vehiculos = new ArrayList<Vehiculo>();

    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }
}
