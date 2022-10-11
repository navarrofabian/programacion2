package tp5.ej3;

public class Mineral {
    private String compuesto;
    private boolean primario;

    public Mineral(String compuesto, boolean primario) {
        this.setCompuesto(compuesto);
        this.setPrimario(primario);
    }

    public String getCompuesto() {
        return compuesto;
    }

    public void setCompuesto(String compuesto) {
        this.compuesto = compuesto;
    }

    public boolean isPrimario() {
        return primario;
    }

    public void setPrimario(boolean primario) {
        this.primario = primario;
    }
}
