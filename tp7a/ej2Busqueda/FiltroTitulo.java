package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;

public class FiltroTitulo extends Filtro {

	private String tituloBuscado;
	
	public FiltroTitulo(String tituloBuscado) {
		this.tituloBuscado = tituloBuscado;
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().equals(this.tituloBuscado);
	}

}
