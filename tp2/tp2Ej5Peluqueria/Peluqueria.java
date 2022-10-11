package tp2.tp2Ej5Peluqueria;

import java.time.LocalTime;
import java.util.ArrayList;

public class Peluqueria {

    private ArrayList<Peluquero> peluqueros;
    private ArrayList<Cliente> clientes;
    private String nombrePeluqueria;
    private double porcentajeDescuento;

    private int cantPeluqueros;
    private LocalTime horaApertura;
    private LocalTime horaCierre;



    public Peluqueria(String nombrePeluqueria, double porcentajeDescuento,int cantPeluqueros, LocalTime horaApertura, LocalTime horaCierre) {
        this.nombrePeluqueria = nombrePeluqueria;
        this.porcentajeDescuento = porcentajeDescuento;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.cantPeluqueros = cantPeluqueros;
        peluqueros = new ArrayList<Peluquero>();
        clientes = new ArrayList<Cliente>();

    }

    public void addPeluquero(Peluquero p) {
        if((peluqueros.size() <= this.cantPeluqueros)&&(!peluqueros.contains(p))){
            peluqueros.add(p);
        }

    }
    public void addCliente(Cliente c){
        if(!clientes.contains(c)){
            clientes.add(c);
        }

    }

    public void addTurno(Turno t, int numeroP){
        peluqueros.get(numeroP).addTurno(t);
    }

    public double cobrar(Turno t) {
        boolean esFrecuente = t.getCliente().esFrecuente();
        return t.getPrecio(porcentajeDescuento, esFrecuente);
    }

    public String getNombrePeluqueria() {
        return nombrePeluqueria;
    }

    public void setNombrePeluqueria(String nombrePeluqueria) {
        this.nombrePeluqueria = nombrePeluqueria;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }


    public int getCantPeluqueros() {
        return cantPeluqueros;
    }

    public void setCantPeluqueros(int cantPeluqueros) {
        this.cantPeluqueros = cantPeluqueros;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }
}
