package tp4.ej1;

public class AlarmaLuminosa extends Alarma {

    public AlarmaLuminosa(){
        //super();

    }

    public boolean comprobarSensores(){
        System.out.println("encender luz ");
            for(Sensor s : sensores){
                if(s.comprobar()){
                    System.out.println("alarma activada en zona: ");
                    System.out.println(s.getZonaControlada());


                }
            }
            return true;
        }




}
