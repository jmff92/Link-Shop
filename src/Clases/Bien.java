package Clases;

import java.util.Set;
import java.util.HashSet;

/*
 * Clase: Bien
 * Descripcion: Son los productos, servicios o eventos.
 */
public class Bien {

	private String nombre;
	private String descripcion;
	private Set<Promocion> promociones = new HashSet<Promocion>();

	public Bien(String nombre, String descripcion, Set<Promocion> promociones) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.promociones = promociones;
	}

	public Bien() {

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

	public Set<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(Set<Promocion> promociones) {
		this.promociones = promociones;
	}

}

// END Bien.java
