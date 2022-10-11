package tp2.tp2Ej3ControlGastos;

public class Impuesto {

    private String nombreImpuesto;
    private double recaudacionImpuesto;

    public Impuesto(String nombreImpuesto, double recaudacionImpuesto){
        setNombreImpuesto(nombreImpuesto);
        setRecaudacionImpuesto(recaudacionImpuesto);

    }

    public String getNombreImpuesto() {
        return nombreImpuesto;
    }

    public void setNombreImpuesto(String nombreImpuesto) {
        this.nombreImpuesto = nombreImpuesto;
    }

    public double getRecaudacionImpuesto() {
        return recaudacionImpuesto;
    }

    public void setRecaudacionImpuesto(double recaudacionImpuesto) {
        this.recaudacionImpuesto = recaudacionImpuesto;
    }
}
