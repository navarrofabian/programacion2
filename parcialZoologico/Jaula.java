package parcialZoologico;

import java.util.ArrayList;

public class Jaula extends ElementoZooSimple implements ElementoZoo{

    private Animal animal;
    private boolean esSegura;
    private Verificador verificador;

    public Jaula(Dimension dimension, String habitat) {
        super(dimension, habitat);
    }

    @Override
    public ArrayList<Jaula> getJaulasAptas(Animal a) {
        ArrayList<Jaula> res = new ArrayList<>();
        if(verificador.cumple(a,this)){
            res.add(this);
        }
        return res;
    }

    @Override
    public boolean puedeHabitar(Animal a) {
        return verificador.cumple(a,this);
    }

    @Override
    public int getCantAnimales() {
        if(animal != null){
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public int getCantMetrosTotal() {
        return 0; //(int) (this.getAncho() * this.getLargo() * this.getAlto());
    }

    @Override
    public int getCantMetrosDisponibles() {
        if(animal != null){
            return 0;
        }
       return this.getCantMetrosTotal();
    }

    @Override
    public int getCantMetrosOcupados() {
        return 0;
    }


}
