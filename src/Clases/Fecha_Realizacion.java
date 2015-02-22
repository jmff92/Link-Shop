package Clases;

import java.sql.Date;

/*
 * Clase: Fecha_Realizacion
 * Descripcion: Fecha en la que se realizara el evento
 */
public class Fecha_Realizacion {

	private Date fecha_realizacion;

	public Fecha_Realizacion(Date fecha_realizacion) {
		this.fecha_realizacion = fecha_realizacion;
	}

	public Date getFecha_realizacion() {
		return fecha_realizacion;
	}

	public void setFecha_realizacion(Date fecha_realizacion) {
		this.fecha_realizacion = fecha_realizacion;
	}

}

// END Fecha_Realizacion.java
