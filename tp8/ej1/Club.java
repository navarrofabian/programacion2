package tp8.ej1;

import tp8.ej1.Filtros.Filtro;

import java.util.ArrayList;

public class Club {

    private String nombre;
    private ArrayList<Socio> socios;


    public Club(String nombre){
        this.setNombre(nombre);
        this.socios = new ArrayList<>();
    }


    public ArrayList<Socio> getSocios(){

        return new ArrayList<Socio>(socios);
    }

    public ArrayList<Socio> getSocios(Filtro f1){
        ArrayList<Socio> resultSocios = new ArrayList<Socio>();
        for(Socio s :socios){
            if((f1.cumple(s))){
                resultSocios.add(s);
            }
        }
        return resultSocios;
    }

    public void addSocio(Socio s) {
        if(!socios.contains(s)){
            this.socios.add(s);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
