package tp9.ej3;

public class Recurso {

    private String nombre;
    private boolean exclusivo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isExclusivo() {
        return exclusivo;
    }

    public void setExclusivo(boolean exclusivo) {
        this.exclusivo = exclusivo;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Recurso otro = (Recurso) o;
            return this.getNombre().equals(otro.getNombre());
        }
        catch (Exception e) {
            return false;
        }
    }
}
