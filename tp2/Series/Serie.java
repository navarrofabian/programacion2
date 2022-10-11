package tp2.Series;

public class Serie {

    private Temporada [] temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    public Serie(int cantTemps, String titulo, String descripcion, String creador, String genero) {

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;

        this.temporadas = new Temporada[cantTemps];
        for(int i = 0; i < temporadas.length; i++){
            this.temporadas[i] = new Temporada(2);
        }

    }
    public void imprimirSerie() {
        System.out.println(getTitulo());
        System.out.println(getDescripcion());
        System.out.println(getCreador());
        System.out.println(getGenero());
        for(int i = 0; i < temporadas.length; i++) {
            temporadas[i].imprimirArr();
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public Temporada[] getTemporadas() {
        return temporadas;
    }

    public int  getCantidadVistos(int numeroTemporada) {
        int cant=0;
        if(numeroTemporada >=0 ){
           cant = temporadas[numeroTemporada].getVisto();
        }
        else{
            for(int i = 0; i < temporadas.length; i++){
                cant = cant + temporadas[i].getVisto();

            }
        }
        return cant;
    }

    public double  getPromedio(int numeroTemporada) {
        double cant=0;
        if(numeroTemporada >=0 ){
            cant = temporadas[numeroTemporada].getPromedio();
        }
        else{
            for(int i = 0; i < temporadas.length; i++){
                cant = cant + temporadas[i].getPromedio()/temporadas.length;

            }
        }
        return cant;
    }

    public boolean vioTodos(){
        int cant = 0;
        for(int i = 0; i < temporadas.length; i++){
            if(temporadas[i].getVistosEpisodios() == true){
                cant ++;
            }


        }
        return cant == temporadas.length;
    }



}