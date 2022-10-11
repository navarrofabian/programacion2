package tp2.tp2Ej4Establecimiento;

import java.util.ArrayList;
import java.util.Objects;

public class Cancha {

    private String tipoCancha;
    private double valor;
    private ArrayList<Turno> turnos;
    private double descuento = 0.1;
    private double precioPadel = 100.0;
    private double precioFutbol = 400.0;


    public Cancha(String tipoCancha){
        setTipoCancha(tipoCancha);
        setTurnos(new ArrayList<Turno>());
    }
    public void asignarCancha(Turno turno, ArrayList<Usuario> socios){

        Usuario user = turno.getUsuario();
        setValor();
        if(socios.contains(user)){
            valor = valor - valor * descuento;
        }
        turno.setValorTurno(valor);
        turnos.add(turno);
    }


    public String getTipoCancha() {
        return tipoCancha;
    }

    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor() {
        if(Objects.equals(this.tipoCancha, "canchaPadel")){
            valor = precioPadel;
        }
        else if(Objects.equals(this.tipoCancha, "canchaFutbol")){
            valor = precioFutbol;
        }
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
}
