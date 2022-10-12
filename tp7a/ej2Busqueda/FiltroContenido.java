package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;

public class FiltroContenido extends Filtro {

	private String contenidoBuscado;
	
	public FiltroContenido(String contenidoBuscado) {
		this.contenidoBuscado = contenidoBuscado;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getContenido().contains(this.contenidoBuscado);
	}

}
