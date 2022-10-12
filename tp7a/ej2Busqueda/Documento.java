package tp7a.ej2Busqueda;

import java.util.ArrayList;

/*
 * Un documento tiene un título, una lista de autores, un contenido textual y una lista de
palabras clave
 */
public class Documento {

	private String titulo;
	private ArrayList<String> autores;
	private String contenido;
	private ArrayList<String> palabrasClaves;
	
	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.autores = new ArrayList<>();
		this.palabrasClaves = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getContenido() {
		return contenido;
	}
	
	public void addAutor(String autor) {
		if (!this.autores.contains(autor))
			this.autores.add(autor);
	}
	
	public boolean tieneAutor(String autor) {
		return this.autores.contains(autor);
	}
	
	public void addPalabraClave(String palabraClave) {
		if (!this.palabrasClaves.contains(palabraClave))
			this.palabrasClaves.add(palabraClave);
	}
	
	public boolean tienePalabraClave(String palabraClave) {
		return this.palabrasClaves.contains(palabraClave);
	}
	
	public boolean equals(Object o) {
		try {
			Documento otro = (Documento) o;
			return this.getTitulo().equals(otro.getTitulo());
		} catch (Exception e) {
			return false;
		}
	}

	public boolean tienePalabrasClaves() {
		return !this.palabrasClaves.isEmpty();
	}

	public int cantidadPalabras() {
		return this.contenido.split(" ").length;
	}

	@Override
	public String toString() {
		return "Documento{" +
				"titulo='" + titulo + '\'' +
				", autores=" + autores +
				", contenido='" + contenido + '\'' +
				", palabrasClaves=" + palabrasClaves +
				'}';
	}
}
