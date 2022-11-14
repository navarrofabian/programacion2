package tp9.ej1;

import tp9.ej1.filtros.Filtro;

import java.util.ArrayList;

public class Noticia extends ElementoNoticia{

    private String titulo;
    private ArrayList<String> palabrasClaves;
    private String texto;
    private String introduccion;
    private String autor;
    private String link;

    public Noticia(String titulo, String texto, String introduccion, String autor, String link) {
        this.setTitulo(titulo);
        this.setIntroduccion(introduccion);
        this.setTexto(texto);
        this.setAutor(autor);
        this.setLink(link);
        this.palabrasClaves = new ArrayList<>();
    }


    @Override
    public ElementoNoticia CopiaRestringida(Filtro filtro){
        if(filtro.cumple(this)){
            Noticia copia = new Noticia(this.getTitulo(), this.getTexto(), this.getIntroduccion(), this.getAutor(), this.getLink());
            for(String pc : this.palabrasClaves){
                copia.addPalabraClave(pc);
            }
            return copia;
        }
        return null;

    }

    @Override
    public int getCantNoticias() {
        return 1;
    }


    public ArrayList<String> getPalabrasClaves(){
        return new ArrayList<String>(palabrasClaves);
    }



    @Override
    public ArrayList<ElementoNoticia> buscar(Filtro filtro) {
        return null;
    }

    @Override
    public String toString() {
        return this.getLink();
    }

    public void addPalabraClave(String palabraClave){
        this.palabrasClaves.add(palabraClave);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Noticia otro = (Noticia) o;
            return this.titulo.equals(otro.getTitulo());

        }
        catch (Exception e) {
            return false;
        }
    }
}
