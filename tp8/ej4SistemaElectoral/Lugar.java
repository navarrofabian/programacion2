package tp8.ej4SistemaElectoral;

import tp8.ej2SistemaDeArchivos.ElementoFS;
import tp8.ej4SistemaElectoral.filtros.Filtro;

public abstract class Lugar implements Comparable<Lugar> {

    private String nombre;

    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPorcenVotos(Filtro filtro);

    public abstract int getCantVotos();

    @Override
    public int compareTo(Lugar l) {
        return 0;
    }

}
