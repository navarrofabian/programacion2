package tp8.ej1.Filtros;

import tp8.ej1.Alquiler;
import tp8.ej1.Socio;

public class FiltroPagoMas500 extends Filtro{


    @Override
    public boolean cumple(Socio s) {
        boolean res = false;
        for(Alquiler alquiler : s.getAlquileres()){
            if(alquiler.getPrecioCancha() > 500.00){
                res = true;

            }
            break;
        }
        return res;
    }
}
