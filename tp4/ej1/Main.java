package tp4.ej1;

public class Main {

    public static void main(String[] args){

        Alarma alarma1 = new Alarma();

        Alarma alarmLum = new AlarmaLuminosa();

        Sensor sensorVentana = new Sensor("Ventana", true);
        Sensor sensorPuerta = new Sensor("Puerta", false);
        Sensor sensorMovimiento = new Sensor("Movimiento", false);
        Sensor sensorVidrio = new Sensor("Vidrio", false);

        alarma1.addSensor(sensorMovimiento);
        alarma1.addSensor(sensorVentana);
        alarma1.addSensor(sensorPuerta);
        alarma1.addSensor(sensorVidrio);

        alarma1.comprobarSensores();
        alarmLum.comprobarSensores();



    }
}
