package parcialZoologico;

import java.util.ArrayList;

public class CompuestoZoo implements ElementoZoo {

    private ArrayList<ElementoZoo> elementos;


    @Override
    public ArrayList<Jaula> getJaulasAptas(Animal a) {
        ArrayList<Jaula> res = new ArrayList<Jaula>();
        for (ElementoZoo e : elementos){
            e.getJaulasAptas(a);
        }
        return res;
    }

    @Override
    public boolean puedeHabitar(Animal a) {
        for (ElementoZoo e : elementos){
            if(e.puedeHabitar(a)){
                return true;
            }
        }
        return false;
    }


    @Override
    public int getCantAnimales() {
        int cant = 0;
        for (ElementoZoo e : elementos) {
            cant += e.getCantAnimales();
        }
        return cant;
    }

    @Override
    public int getCantMetrosTotal() {
        int cant = 0;
        for (ElementoZoo e : elementos) {
            cant += e.getCantMetrosTotal();
        }
        return cant;
    }

    @Override
    public int getCantMetrosDisponibles() {
        int cant = 0;

        for (ElementoZoo e : elementos) {
            e.getCantMetrosDisponibles();
        }
        return cant;
    }

    @Override
    public int getCantMetrosOcupados() {
        return 0;
    }
}
