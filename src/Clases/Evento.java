package Clases;

import java.util.Set;
import java.util.HashSet;

/*
 * Clase: Evento
 * Descripcion: Suceso de importancia que se encuentra programado
 */
public class Evento {

	private Set<Fecha_Realizacion> fechas = new HashSet<Fecha_Realizacion>();

	public Evento(Set<Fecha_Realizacion> fechas) {
		this.fechas = fechas;
	}

	public Evento() {

	}

	public Set<Fecha_Realizacion> getFechas() {
		return fechas;
	}

	public void setFechas(Set<Fecha_Realizacion> fechas) {
		this.fechas = fechas;
	}
	
}

// END Evento.java
