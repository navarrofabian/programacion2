package tp1.elementosGeometricos2.elementosGeometricos;

public class Rectangulo {

    private PuntoGeometrico punto1;
    private PuntoGeometrico punto2;
    private PuntoGeometrico punto3;
    private PuntoGeometrico punto4;


    public Rectangulo(PuntoGeometrico punto1, PuntoGeometrico punto2, PuntoGeometrico punto3, PuntoGeometrico punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;


    }
    public void moverRectangulo(int x, int y){
        this.punto1.trasladarPunto(x, y);
        this.punto2.trasladarPunto(x, y);
        this.punto3.trasladarPunto(x, y);
        this.punto4.trasladarPunto(x, y);
    }


    //get area of the rectangle
    public double getArea() {
        return (punto2.getX() - punto1.getX()) * (punto3.getY() - punto1.getY());

    }

    public int comparar(double area2){
        double area = getArea();
        if(area < area2) return -1;
        if(area > area2) return 1;
        else return 0;

    }

    public boolean esCuadrado(){
        return (punto2.getX() - punto1.getX()) == (punto3.getY() - punto1.getY());
    }

    public double getLargoSuperior(){
        double a = this.punto2.getX() - this.punto1.getX();
        double b = this.punto2.getY() - this.punto1.getY();
        if(a > b) return a;
        if(b > a) return b;
        else return 0;
    }
    public String acostadoOParado() {

        double a = this.punto2.getX() - this.punto1.getX();
        double b = this.punto3.getY() - this.punto1.getY();
        if(a > b)
            return "Acostado";
        else if(b > a)
            return "Parado";
        else
            return "Ninguno";
    }


    public PuntoGeometrico getPunto1() {
        return punto1;
    }

    public void setPunto1(PuntoGeometrico punto1) {
        this.punto1 = punto1;
    }

    public PuntoGeometrico getPunto2() {
        return punto2;
    }

    public void setPunto2(PuntoGeometrico punto2) {
        this.punto2 = punto2;
    }
}
