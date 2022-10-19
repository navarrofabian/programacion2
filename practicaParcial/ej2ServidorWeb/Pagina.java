package practicaParcial.ej2ServidorWeb;

import java.util.ArrayList;

public class Pagina {

    private String nombrePagina;
    private ArrayList<Componente> componentes;

    public Pagina(String nombrePagina) {
        this.setNombrePagina(nombrePagina);
        this.componentes = new ArrayList<Componente>();
    }

    public void addComponente(Componente componente, int posicion){
        if(posicion == -1){
            this.componentes.add(componente);
        }
        else{
            this.componentes.add(posicion, componente);
        }
    }

    public double getTamanioTotal(){
        double total = 0;
        for(Componente c: componentes){
            total += c.getTamanio();
        }
        return total;
    }

    public String getNombrePagina() {
        return nombrePagina;
    }

    public void setNombrePagina(String nombrePagina) {
        this.nombrePagina = nombrePagina;
    }
}
