package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;

public class FiltroSinPalabrasClave extends Filtro {

	@Override
	public boolean cumple(Documento doc) {
		return !doc.tienePalabrasClaves();
	}

}
