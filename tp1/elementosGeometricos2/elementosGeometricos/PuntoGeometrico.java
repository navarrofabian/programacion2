package tp1.elementosGeometricos2.elementosGeometricos;

public class PuntoGeometrico {

    private int x;
    private int y;


    public PuntoGeometrico() {
        this.x = 0;
        this.y = 0;
    }

    public PuntoGeometrico(int x) {
        this.x = x;
    }

    public PuntoGeometrico(int x, int y) {
        this(x);
        this.y = y;
    }


    public void trasladarPunto(int x, int y) {
        setX(x);
        setY(y);
    }


    //calculate distance between two points
    public double getDistance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x += x;
    }

    public void setY(int y) {
        this.y += y;
    }
}
