package tp1.elementosGeometricos2;

public class Rectangulo {
	private PuntoGeometrico  p1;
	private PuntoGeometrico p2;
	
	public Rectangulo(PuntoGeometrico p1, PuntoGeometrico p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void desplazarRectangulo(int X, int Y) {
		this.p1.desplazar(X,Y);
		this.p2.desplazar(X,Y);
	}
	
	public double areaRectangulo() {
		return ((p2.getX() - p1.getX()) * (p2.getY() - p1.getY()));
	}
	
	public int esMayor(double area2) {
		double area = areaRectangulo();
		if(area > area2) 
			return 1;
		else if(area < area2) 
			return -1;
		else
			return 0;
	}
	
	public boolean esCuadrado() {
		return ((p2.getX() - p1.getX()) == (p2.getY() - p1.getY()));
	}
	
	public String ladoSuperior() {
		int base, altura;
		base = this.p2.getX() - this.p1.getX();
		altura = this.p2.getY() - this.p1.getY();
		if(base > altura)
			return "La base es superior";
		else if(altura > base)
			return "La altura es superior";
		else
			return "La base y la altura son iguales";
	}
	
	public String acostadoOParado() {
		int base, altura;
		base = this.p2.getX() - this.p1.getX();
		altura = this.p2.getY() - this.p1.getY();
		if(base > altura)
			return "Acostado";
		else if(altura > base)
			return "Parado";
		else
			return "Ninguno";
	}

	public PuntoGeometrico getP1() {
		return p1;
	}

	public void setP1(PuntoGeometrico p1) {
		this.p1 = p1;
	}

	public PuntoGeometrico getP2() {
		return p2;
	}

	public void setP2(PuntoGeometrico p2) {
		this.p2 = p2;
	}
	
	
}
