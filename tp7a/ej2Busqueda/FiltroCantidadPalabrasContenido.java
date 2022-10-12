package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;

public class FiltroCantidadPalabrasContenido extends Filtro {

	private int cantidadMinima;
	
	public FiltroCantidadPalabrasContenido(int cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.cantidadPalabras() > this.cantidadMinima;
	}

}
