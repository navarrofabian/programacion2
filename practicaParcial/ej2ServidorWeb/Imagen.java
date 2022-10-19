package practicaParcial.ej2ServidorWeb;

public class Imagen extends Componente{

    private String extencion;
    private double tamanio;

    public Imagen(String extencion, double tamanio){
       this.extencion = extencion;
       this.tamanio = tamanio;
    }


    @Override
    public double getTamanio() {
        return 0;
    }


    @Override
    public double getCant() {
        return 0;
    }
}
