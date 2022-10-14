package tp7a.ej3Vivero;

import java.util.ArrayList;

public class Planta {

    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String entorno;
    private int sol;
    private int agua;

    public Planta(String nombreCientifico,String clasificacionSuperior, String familia,String clase, String entorno, int sol, int agua) {
        this.setNombreCientifico(nombreCientifico);
        this.setClasificacionSuperior(clasificacionSuperior);
        this.setFamilia(familia);
        this.setClase(clase);
        this.setEntorno(entorno);
        this.setSol(sol);
        this.setAgua(agua);
        this.nombresVulgares = new ArrayList<String>();
    }


    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEntorno() {
        return entorno;
    }

    public void setEntorno(String entorno) {
        this.entorno = entorno;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }
}
