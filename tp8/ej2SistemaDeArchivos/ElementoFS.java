package tp8.ej2SistemaDeArchivos;

import tp8.ej2SistemaDeArchivos.filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoFS implements Comparable<ElementoFS> {

    private String nombre;
    private LocalDate fechaCreac;
    private LocalDate fechaModif;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
        this.fechaCreac = LocalDate.now();
        this.fechaModif = LocalDate.now();
    }

    public abstract double getTamanio();
    public abstract int getCantElementos();
    public abstract ArrayList<ElementoFS> buscar(Filtro filtro);

    public ArrayList<ElementoFS> buscar(Filtro filtro, Comparator<ElementoFS> c){
        ArrayList <ElementoFS> res = this.buscar(filtro);
        Collections.sort(res, c);
        return res;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public LocalDate getFechaCreac() {
        return fechaCreac;
    }

    public void setFechaCreac(LocalDate fechaCreac) {
        this.fechaCreac = fechaCreac;
    }

    public LocalDate getFechaModif() {
        return fechaModif;
    }

    public void setFechaModif(LocalDate fechaModif) {
        this.fechaModif = fechaModif;
    }

    @Override
    public int compareTo(ElementoFS o) {
        return this.getNombre().compareTo(o.nombre);
    }
}
