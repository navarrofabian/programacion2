package tp8.ej4SistemaElectoral;

public class Candidato implements Comparable<Candidato> {

    private String nombre;
    private String partido;
    private String agrupacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    public boolean equals(Object o) {
        try {
            Candidato candidato = (Candidato) o;
            return this.getNombre().equals(candidato.getNombre()) &&
                   this.getPartido().equals(candidato.getPartido());
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public int compareTo(Candidato o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
