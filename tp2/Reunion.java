package tp2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reunion {

    private String lugar;
    private String tema;

    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    private ArrayList<Contacto> participantes;


    public Reunion(String lugar, String tema,LocalDate fecha, LocalTime horaInicio, LocalTime horaFin){
        setLugar(lugar);
        setTema(tema);
        setHoraInicio(horaInicio);
        setHoraFin(horaFin);
        setFecha(fecha);
        participantes = new ArrayList<Contacto>();

    }


    public void addParticipante(Contacto participante1){
        if(!participantes.contains(participante1)){
            participantes.add(participante1);
        }

    }

    public boolean tieneConflicto(LocalDate fecha, LocalTime horaInicio){
        if((this.getFecha().equals(fecha)) && this.getHoraInicio().equals(horaInicio) || (this.getFecha().equals(fecha)) && (this.getHoraFin().isAfter(horaInicio))) {
            return true;
        }
        else {
            return false;
        }
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}
