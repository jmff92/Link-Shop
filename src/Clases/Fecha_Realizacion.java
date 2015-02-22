package Clases;

import java.sql.Date;

/*
 * Clase: Fecha_Realizacion
 * Descripcion: Fecha en la que se realizara el evento
 */
public class Fecha_Realizacion {

	private Date fecha_r;

	public Fecha_Realizacion(Date fecha_r) {
		this.fecha_r = fecha_r;
	}

	public Fecha_Realizacion() {
		
	}

	public Date getFecha_r() {
		return fecha_r;
	}

	public void setFecha_r(Date fecha_r) {
		this.fecha_r = fecha_r;
	}

}

// END Fecha_Realizacion.java
