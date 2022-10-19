package tp8.ej1;

import java.util.Comparator;

public class ComparadorCuota  implements Comparator<Socio> {


    @Override
    public int compare(Socio o1, Socio o2) {
        if(o1.isCuotaPaga() && !o2.isCuotaPaga()){
            return -1;
        }
        if(!o1.isCuotaPaga() && o2.isCuotaPaga()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
