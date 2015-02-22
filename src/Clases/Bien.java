package Clases;

/*
 * Clase: Bien
 * Descripcion: Son los productos, servicios o eventos.
 */
public class Bien {

	private String nombre;
	private String descripcion;
	
	public Bien(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

// END Bien.java
