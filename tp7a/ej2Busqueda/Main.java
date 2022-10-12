package tp7a.ej2Busqueda;

import tp7a.ej2Busqueda.Biblioteca;
import tp7a.ej2Busqueda.Documento;
import tp7a.ej2Busqueda.Filtro;
import tp7a.ej2Busqueda.FiltroCantidadPalabrasContenido;

public class Main {

	public static void main(String[] args) {

		Biblioteca b1 = new Biblioteca();

		Documento doc1 = new Documento("prog2", "programacion orientada a objetos");
		Documento doc2 = new Documento("prog3", "programacion orientada a objetos");

		b1.addDocumento(doc1);
		b1.addDocumento(doc2);
		Filtro f1 = new FiltroCantidadPalabrasContenido(2);
		System.out.println(b1.buscar(f1));
	}

}
