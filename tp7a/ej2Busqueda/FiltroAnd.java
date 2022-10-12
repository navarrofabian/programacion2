package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;

public class FiltroAnd extends Filtro {

	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return this.f1.cumple(doc) && this.f2.cumple(doc);
	}

}
