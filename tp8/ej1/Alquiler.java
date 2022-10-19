package tp8.ej1;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private double precioCancha;
    private int idCancha;

    public Alquiler(LocalDate fecha, Double precioCancha, int idCancha) {
        this.setFecha(fecha);
        this.setPrecioCancha(precioCancha);
        this.setIdCancha(idCancha);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getPrecioCancha() {
        return precioCancha;
    }

    public void setPrecioCancha(Double precioCancha) {
        this.precioCancha = precioCancha;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "fecha=" + fecha +
                ", precioCancha=" + precioCancha +
                ", idCancha=" + idCancha +
                '}'+ "\n";
    }
}
