package tp8.ej4SistemaElectoral;

import tp8.ej4SistemaElectoral.filtros.Filtro;

import java.util.ArrayList;

public class LugarVoto extends Lugar{


    private String nombre;
    private ArrayList<Lugar> lugaresParaVotar;

    public LugarVoto(String nombre) {
        super(nombre);
        this.lugaresParaVotar = new ArrayList<Lugar>();
    }


    public double getPorcenVotos(Filtro filtro) {
        double porcentajeVotos = 0.0;
        for (Lugar lugarHijo : lugaresParaVotar) {
            porcentajeVotos += lugarHijo.getPorcenVotos(filtro);
        }
        return porcentajeVotos;
    }

    @Override
    public int getCantVotos() {
        int total = 0;
        for (Lugar lugar : lugaresParaVotar) {
            total += lugar.getCantVotos();
        }
        return total;

    }


    public void addLugarParaVotar(Lugar lugar) {
        lugaresParaVotar.add(lugar);
    }
}
