package tp1.elementosGeometricos2;

public class PuntoGeometrico {
	private int X;
	private int Y;
	
	public PuntoGeometrico() {
		this.X = 0;
		this.Y = 0;
	}
	
	public PuntoGeometrico(int X) {
		this.X = X;
	}
	
	public PuntoGeometrico(int X, int Y) {
		this(X);
		this.Y = Y;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
	public void desplazar(int X, int Y) {
		this.X += X;
		this.Y += Y;
	}
	
	public double distanciaEuclidea(int X, int Y) {
		return Math.sqrt(Math.pow(this.X - X,2) + Math.pow(this.Y - Y, 2));
	}
}
