package Clases;

import java.math.BigInteger;

/*
 * Clase: Tarjeta_Regalo
 * Descripcion: Equivale a un monto de dinero promoción y que puede ser utilizado 
 * por un usuario para adquirir la promoción ofertada que desee
 */
public class Tarjeta_Regalo {

	private BigInteger codigo;
	private Integer monto;
	
	public Tarjeta_Regalo(BigInteger codigo, Integer monto) {
		this.codigo = codigo;
		this.monto = monto;
	}

	public BigInteger getCodigo() {
		return codigo;
	}

	public void setCodigo(BigInteger codigo) {
		this.codigo = codigo;
	}

	public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}

}

// END Tarjeta_Regalo.java
