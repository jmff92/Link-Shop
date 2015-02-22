package Clases;

/*
 * Clase: Subcategoria
 * Descripcion: Las subcategorias son subdivisiones de las categorias y a su vez 
 * pueden dividirse en subcategorias
 */
public class Subcategoria {

	private String nombre;

	public Subcategoria(String nombre) {
		this.nombre = nombre;
	}

	public Subcategoria() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

// END Subcategoria.java
