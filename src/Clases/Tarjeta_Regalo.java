package Clases;

/*
 * Clase: Tarjeta_Regalo
 * Descripcion: Equivale a un monto de dinero promoción y que puede ser utilizado 
 * por un usuario para adquirir la promoción ofertada que desee
 */
public class Tarjeta_Regalo {

	private int codigo;
	private int monto;
	
	public Tarjeta_Regalo(int codigo, int monto) {
		this.codigo = codigo;
		this.monto = monto;
	}

	public Tarjeta_Regalo() {

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

}

// END Tarjeta_Regalo.java
