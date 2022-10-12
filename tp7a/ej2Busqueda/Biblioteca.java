package tp7a.ej2Busqueda;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Documento> documentos;
	
	public Biblioteca() {
		this.documentos = new ArrayList<>();
	}
	
	public void addDocumento(Documento documento) {
		if (!this.documentos.contains(documento))
			this.documentos.add(documento);
	}
	
	public ArrayList<Documento> buscar(Filtro filtro) {
		ArrayList<Documento> resultado = new ArrayList<Documento>();

		for (Documento doc : this.documentos) {
			if (filtro.cumple(doc))
				resultado.add(doc);
		}
		
		return resultado;
	}


	@Override
	public String toString() {
		return "Biblioteca{" +
				"documentos=" + documentos +
				'}';
	}
}
