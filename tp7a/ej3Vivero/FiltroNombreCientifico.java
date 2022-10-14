package tp7a.ej3Vivero;

public class FiltroNombreCientifico extends Filtro {

    private String nombreCientificoBuscado;


    public FiltroNombreCientifico(String nombreCientificoBuscado ) {
        this.nombreCientificoBuscado = nombreCientificoBuscado;
    }

    @Override
    public boolean cumple(Planta pl) {
       return pl.getNombreCientifico().equals(nombreCientificoBuscado);
    }
}
