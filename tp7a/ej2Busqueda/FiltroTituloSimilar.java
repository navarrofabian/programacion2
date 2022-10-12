package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;

public class FiltroTituloSimilar extends Filtro {

	private String fraseBuscada; 
	
	public FiltroTituloSimilar(String fraseBuscada) {
		this.fraseBuscada = fraseBuscada;
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().contains(this.fraseBuscada);
	}

}
