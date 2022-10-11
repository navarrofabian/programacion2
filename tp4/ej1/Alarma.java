package tp4.ej1;

import java.util.ArrayList;

public class Alarma {

    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean ventanaAbierta;
    private boolean movimiento;

    protected ArrayList<Sensor> sensores;

    public Alarma() {
        sensores = new ArrayList<Sensor>();

    }

    public void addSensor(Sensor sensor){
        sensores.add(sensor);
    }

    public boolean comprobarSensores(){
        for(Sensor s : sensores){
            if(s.comprobar()){
                System.out.println("alarma activada en zona: ");
                System.out.println(s.getZonaControlada());
            }
        }
        return true;
    }





}
