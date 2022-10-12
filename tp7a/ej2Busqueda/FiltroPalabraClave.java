package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;

public class FiltroPalabraClave extends Filtro {

	private String palabraClaveBuscada;
	
	public FiltroPalabraClave(String palabraClaveBuscada) {
		this.palabraClaveBuscada = palabraClaveBuscada;
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.tienePalabraClave(this.palabraClaveBuscada);
	}

}
