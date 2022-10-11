package tp1.elementosGeometricos2.elementosGeometricos;

public class Main {
    public static void main(String[] args) {

        PuntoGeometrico punto1 = new PuntoGeometrico(1, 1);
        PuntoGeometrico punto2 = new PuntoGeometrico(4, 1);
        PuntoGeometrico punto3 = new PuntoGeometrico(1, 5);
        PuntoGeometrico punto4 = new PuntoGeometrico(4, 5);

        System.out.println(punto1.getX());
        System.out.println(punto1.getY());
        System.out.println(punto2.getX());
        System.out.println(punto2.getY());
        System.out.println(punto3.getX());
        System.out.println(punto3.getY());
        System.out.println(punto4.getX());
        System.out.println(punto4.getY());

       System.out.print("distanciaEuclidea: ");
       System.out.println(punto1.getDistance(6, 3));
       punto1.trasladarPunto(0,0);

        Rectangulo rect1 = new Rectangulo(punto1, punto2, punto3, punto4);
       // Rectangulo rect2 = new Rectangulo(punto1, punto2, punto3, punto4);

        //rect1.moverRectangulo(5,10);
        System.out.println(rect1.getArea());
        System.out.print("comparar rectangulo: ");
        //System.out.println(rect1.comparar(rect2.getArea()));
        System.out.print("es cuadrado: ");
        System.out.println(rect1.esCuadrado());
        System.out.print("largo superior: ");
        System.out.println(rect1.getLargoSuperior());
        System.out.print("orientacion: ");
        System.out.println(rect1.acostadoOParado());
    }
}