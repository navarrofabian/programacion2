package practicaParcial.ej2ServidorWeb;

public class Link extends Componente{

    private Pagina paginaReferenciada;

    @Override
    public double getTamanio() {
        return paginaReferenciada.getTamanioTotal();
    }

    @Override
    public double getCant() {
        return 0;
    }
}
