package Clases;

import java.sql.Date;

/*
 * Clase: Fecha_Uso 
 * Descripcion: Fecha en la que se usa el vale
 */
public class Fecha_Uso {

	private Date fecha_u;

	public Fecha_Uso(Date fecha_u) {
		this.fecha_u = fecha_u;
	}

	public Fecha_Uso() {

	}

	public Date getFecha_u() {
		return fecha_u;
	}

	public void setFecha_u(Date fecha_u) {
		this.fecha_u = fecha_u;
	}	
	
}

// END Fecha_Uso.java
