package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;

public class FiltroAutor extends Filtro {

	private String autorBuscado;
	
	public FiltroAutor(String autorBuscado) {
		this.autorBuscado = autorBuscado;
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.tieneAutor(this.autorBuscado);
	}

}
