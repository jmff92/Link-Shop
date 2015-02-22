package Clases;

import java.sql.Date;

/*
 * Clase: Fecha_Uso 
 * Descripcion: Fecha en la que se usa el vale
 */
public class Fecha_Uso {

	private Date fecha_uso;

	public Fecha_Uso(Date fecha_uso) {
		this.fecha_uso = fecha_uso;
	}

	public Date getFecha_uso() {
		return fecha_uso;
	}

	public void setFecha_uso(Date fecha_uso) {
		this.fecha_uso = fecha_uso;
	}	
	
}

// END Fecha_Uso.java
