package tp9.ej1.filtros;

import tp9.ej1.Noticia;

public class FiltroPalabraClave extends Filtro {


    private String palabraClaveBuscada;

    public FiltroPalabraClave(String palabraClaveBuscada) {
        this.palabraClaveBuscada = palabraClaveBuscada;
    }


    @Override
    public boolean cumple(Noticia n) {
        return n.getPalabrasClaves().contains(palabraClaveBuscada);
    }
}
