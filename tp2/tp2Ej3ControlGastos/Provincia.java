package tp2.tp2Ej3ControlGastos;

import java.util.ArrayList;

public class Provincia {

    private String nombreProvincia;

    private ArrayList<Ciudad> ciudades;
    private ArrayList<Ciudad> ciudadesInviables;

    public Provincia(String nombreProvincia){
        this.nombreProvincia = nombreProvincia;
        this.ciudades = new ArrayList<Ciudad>();
        this.ciudadesInviables = new ArrayList<Ciudad>();
    }
    public void addCiudad(Ciudad ciudad) {
        if(!ciudades.contains(ciudad)){
            ciudades.add(ciudad);
        }
    }

    public ArrayList<Ciudad> getCiudadesInviables(){
        for(int i = 0; i < ciudades.size(); i++){
            if(ciudades.get(i).getBalance() > 0.0){
                ciudadesInviables.add(ciudades.get(i));
            }
        }
        return ciudadesInviables;
    }

    public boolean provinciaEnDeficit(){
        if(ciudadesInviables.size() > ciudades.size() / 2){
            return true;
        }
        else return false;
    }


    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
