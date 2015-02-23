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
	private Set<Promocion> promociones = new HashSet<Promocion>();
	private Set<Usuario> usuarios = new HashSet<Usuario>();

	public Categoria(String nombre, Set<Empresa> empresas, 
		   Set<Subcategoria> subcategorias, Set<Promocion> promociones,
		   Set<Usuario> usuarios) {
		this.nombre = nombre;
		this.empresas = empresas;
		this.subcategorias = subcategorias;
		this.promociones = promociones;
		this.usuarios = usuarios;
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

	public Set<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(Set<Promocion> promociones) {
		this.promociones = promociones;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}

// END Categorias.java
