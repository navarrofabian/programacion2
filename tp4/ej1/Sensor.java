package tp4.ej1;

public class Sensor {

    private String  zonaControlada;
    private boolean estado;


    public Sensor(String zonaControlada, boolean estado) {
        this.zonaControlada = zonaControlada;
        this.estado = estado;
    }

    public boolean comprobar(){
        if(estado){
            return true;
            //alarma();
        }
        else{
            return false;

        }

    }



    public String getZonaControlada() {
        return zonaControlada;
    }

    public void setZonaControlada(String zonaControlada) {
        this.zonaControlada = zonaControlada;
    }
}
