package tp2.Series;

public class Episodio {

    private String titulo;
    private String descripcion;
    private int visto;
    private int calificacion;


    public Episodio(String titulo, String descripcion, int visto, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        setCalificacion(calificacion);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int isVisto() {
        return visto;
    }

    public void setVisto(int visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if((calificacion >= 1) && (calificacion <= 5)) {
            this.calificacion = calificacion;
        }
        else{
            System.out.println("La calificacion debe estar entre 1 y 5");
        }

    }
}