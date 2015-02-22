package Clases;

/*
 * Clase: Tarjeta_Credito
 * Descripcion: Tarjetas de credito asociadas al usuario
 */
public class Tarjeta_Credito {

	private String tdc_num;

	public Tarjeta_Credito(String tdc_num) {
		this.tdc_num = tdc_num;
	}

	public Tarjeta_Credito() {
		
	}

	public String getTdc_num() {
		return tdc_num;
	}

	public void setTdc_num(String tdc_num) {
		this.tdc_num = tdc_num;
	}
	
}

// END Tarjeta_Credito.java
