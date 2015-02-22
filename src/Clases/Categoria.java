package Clases;

import java.util.HashSet;
import java.util.Set;

/*
 * Clase: Categoria
 * Descripcion: Nombre de usuario en una o mas redes sociales
 */
public class Categoria {

	private String nombre;
	
	private Set<Empresa> empresas = new HashSet<Empresa>();	

	public Categoria(String nombre, Set<Empresa> empresas) {
		this.nombre = nombre;
		this.empresas = empresas;
	}

	public Categoria() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Set<Empresa> empresas) {
		this.empresas = empresas;
	}
	
}

// END Categorias.java
