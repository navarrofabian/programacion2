package parcialZoologico;

import java.util.ArrayList;

public interface ElementoZoo {


    ArrayList<Jaula> getJaulasAptas(Animal a);

    boolean puedeHabitar(Animal a);

    int getCantAnimales();

    int getCantMetrosTotal();

    int getCantMetrosDisponibles();

    int getCantMetrosOcupados();
}
