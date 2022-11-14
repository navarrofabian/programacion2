package tp9.ej1;

import tp9.ej1.filtros.Filtro;

import java.util.ArrayList;

public class ElementoCompuestoN extends ElementoNoticia {

    private String nombre;
    private String descripcion;
    private String linkImg;
    private ArrayList<ElementoNoticia> elementos;


    public ElementoCompuestoN(String nombre, String descripcion, String linkImg){
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setLinkImg(linkImg);
        this.elementos = new ArrayList<ElementoNoticia>();
    }


    @Override
    public int getCantNoticias() {
         int totalNoticias = 0;
         for (ElementoNoticia e : elementos) {
             totalNoticias += e.getCantNoticias();
         }
         return totalNoticias;
    }

    @Override
    public ElementoNoticia CopiaRestringida(Filtro filtro) {
        ElementoCompuestoN copia = new ElementoCompuestoN(this.getNombre(), this.getDescripcion(), this.getLinkImg());
        for (ElementoNoticia e : this.elementos){
            ElementoNoticia copiaHijo = e.CopiaRestringida(filtro);
            if (copiaHijo != null){
                copia.addElemento(copiaHijo);
            }
        }
        if(copia.tieneElementos()){
            return copia;
        }
        else
            return null;
    }

    @Override
    public ArrayList<ElementoNoticia> buscar(Filtro filtro) {
        return null;
    }
    @Override
    public String toString() {
        String resultado = this.getNombre() + "\\";
        for (ElementoNoticia e : elementos)
            resultado += e.toString();
        return resultado;
    }


    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }

    public void addElemento(ElementoNoticia e){
        if(!elementos.contains(e)){
            elementos.add(e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }
    @Override
    public boolean equals(Object obj){
        try{
            ElementoCompuestoN otro = (ElementoCompuestoN) obj;
            return this.getNombre().equals(otro.getNombre());
        }
        catch(Exception e){
            return false;
        }
    }
}
