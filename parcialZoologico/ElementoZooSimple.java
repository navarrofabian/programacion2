package parcialZoologico;


public abstract class ElementoZooSimple{

    private Dimension dimension;
    private String habitat;

    public ElementoZooSimple(Dimension dimension, String habitat) {
        this.dimension = dimension;
        this.habitat = habitat;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
