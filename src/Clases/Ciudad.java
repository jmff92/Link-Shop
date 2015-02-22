package Clases;

import java.util.HashSet;
import java.util.Set;

/*
 * Clase: Ciudad
 * Descripcion: La ciudad en donde se tienen promociones de productos, servicios 
 * o eventos
 */
public class Ciudad implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;
    private String pais;
    
	private Set<Promocion> promociones = new HashSet<Promocion>();	    

	public Ciudad(String nombre, String pais, Set<Promocion> promociones) {
		this.nombre = nombre;
		this.pais = pais;
		this.promociones = promociones;
	}

	public Ciudad() {
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	public Set<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(Set<Promocion> promociones) {
		this.promociones = promociones;
	}
}

// END Ciudad.java
