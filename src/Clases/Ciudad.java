package Clases;

import java.util.HashSet;
import java.util.Set;

public class Ciudad {

	private String nombre;
    private String pais;
    
	private Set<Promocion> promociones = new HashSet<Promocion>();	    

	public Ciudad(String nombre, String pais, Set<Promocion> promociones) {
		this.nombre = nombre;
		this.pais = pais;
		this.promociones = promociones;
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