package Clases;

import java.util.HashSet;
import java.util.Set;

/*
 * Clase: Empresa
 * Descripcion: Organización dedicada a actividades comerciales para satisfacer 
 * las necesidades de bienes o servicios de los consumidores
 */
public class Empresa {

	private String nombre;
	private String telefono;
	private String direccion;
	private int num_clientes;
	
	private Set<Categoria> categorias = new HashSet<Categoria>();	
	private Set<Promocion> promociones = new HashSet<Promocion>();	
		
	public Empresa(String nombre, String telefono, String direccion,
			int num_clientes, Set<Categoria> categorias, Set<Promocion> promociones) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.num_clientes = num_clientes;
		this.categorias = categorias;
		this.promociones = promociones;
	}

	public Empresa() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNum_clientes() {
		return num_clientes;
	}

	public void setNum_clientes(int num_clientes) {
		this.num_clientes = num_clientes;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Set<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(Set<Promocion> promociones) {
		this.promociones = promociones;
	}	
	
}

// END Empresa.java
