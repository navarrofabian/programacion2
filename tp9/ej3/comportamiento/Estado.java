package tp9.ej3.comportamiento;

public class Estado {

    private String estadoActual;


    public Estado(String estadoActual) {
        this.setEstadoActual(estadoActual);
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }
}
