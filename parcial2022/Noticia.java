package parcial2022;

import parcial2022.filtros.Filtro;

import java.util.ArrayList;

public class Noticia extends ElementoPortal {
    private ArrayList<String> palabrasClaves;
    private String contenido;
    private String titulo;
    private String autor;
    private String categoria;

    public Noticia() {
    }



    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(palabrasClaves);
    }

    public void setPalabrasClaves(String palabraClave) {
        if(!palabrasClaves.contains(palabraClave)){
            this.palabrasClaves.add(palabraClave);
        }
    }
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public ArrayList<Noticia> buscar(Filtro filtro) {
        ArrayList<Noticia> result = new ArrayList<Noticia>();
        if(filtro.cumple(this)){
            result.add(this);
        }
        return result;

    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void addPalabraClave(String palabraClave){
        if(!palabrasClaves.contains(palabraClave)){
            palabrasClaves.add(palabraClave);
        }
    }
}
