package tp1.elementosGeometricos2;

public class mainPuntoGeo {
	public static void main(String[] args) {
		PuntoGeometrico p1 = new PuntoGeometrico(5,6);
		PuntoGeometrico p2 = new PuntoGeometrico(5,5);
		PuntoGeometrico p3 = new PuntoGeometrico(5,120);
		PuntoGeometrico p4 = new PuntoGeometrico(120,124);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.print("distanciaEuclidea: ");
		System.out.println(p1.distanciaEuclidea(6, 3));
		Rectangulo r1 = new Rectangulo(p1,p2);
		Rectangulo r2 = new Rectangulo(p3,p4);
		r1.desplazarRectangulo(2, 2);
		System.out.println(r1.areaRectangulo());
		System.out.println(r2.areaRectangulo());
		System.out.println(r1.esMayor(r2.areaRectangulo()));
		System.out.println(r1.esCuadrado());
		System.out.println(r1.ladoSuperior());
		System.out.println(r1.acostadoOParado());
	}
}
