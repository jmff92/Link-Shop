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
	private Set<Subcategoria> subcategorias = new HashSet<Subcategoria>();

	public Categoria(String nombre, Set<Empresa> empresas, 
		   Set<Subcategoria> subcategorias) {
		this.nombre = nombre;
		this.empresas = empresas;
		this.subcategorias = subcategorias;
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

	public Set<Subcategoria> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(Set<Subcategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}
	
}

// END Categorias.java
