package Clases;

import java.util.Date;

/*
 * Clase: Vale_Regalo
 * Descripcion: Son aquellos que se dan como obsequio de un usuario a otra 
 * persona sobre una promoción de Link-Shop.
 */
public class Vale_Regalo {
	
	private String receptor;
	private Date fecha_envio;
	
	public Vale_Regalo(String receptor, Date fecha_envio) {
		this.receptor = receptor;
		this.fecha_envio = fecha_envio;
	}
	
	public String getReceptor() {
		return receptor;
	}
	
	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}
	
	public Date getFecha_envio() {
		return fecha_envio;
	}
	
	public void setFecha_envio(Date fecha_envio) {
		this.fecha_envio = fecha_envio;
	}	
	
}

// END Vale_Regalo.java
