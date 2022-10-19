package practicaParcial.ej2ServidorWeb;

import java.util.ArrayList;

public class Texto extends Componente {

    private ArrayList<String> parrafos;


    public void addParrafo(String parrafos) {

    }

    @Override
    public double getTamanio() {
        int totalCaracteres = 0;
        for (String p: parrafos) {
            totalCaracteres += p.length();
        }
        return totalCaracteres;
    }

    @Override
    public double getCant() {
        return 0;
    }
}
