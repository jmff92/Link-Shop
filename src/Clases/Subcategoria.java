package Clases;

import java.util.HashSet;
import java.util.Set;

/*
 * Clase: Subcategoria
 * Descripcion: Las subcategorias son subdivisiones de las categorias y a su vez 
 * pueden dividirse en subcategorias
 */
public class Subcategoria {

	private String nombre;
	private Categoria categoria;
	private Subcategoria subcat_papa;
	private Set<Subcategoria> subcategorias = new HashSet<Subcategoria>();

	public Subcategoria(String nombre, Set<Subcategoria> subcategorias,
			Subcategoria subcat_papa) {
		this.nombre = nombre;
		this.subcategorias = subcategorias;
		this.subcat_papa = subcat_papa;
	}

	public Subcategoria() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<Subcategoria> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(Set<Subcategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}

	public Subcategoria getSubcat_papa() {
		return subcat_papa;
	}

	public void setSubcat_papa(Subcategoria subcat_papa) {
		this.subcat_papa = subcat_papa;
	}

}

// END Subcategoria.java
