package Clases;

import java.util.Set;
import java.util.HashSet;

/*
 * Clase: Comparte
 * Descripcion: Un usuario comparte una promocion a un(os) amigo(s).
 */
public class Comparte {

	private Integer id;
	private Usuario emisor;
	private Promocion promocion;
	private Integer compra;
	private Usuario receptor;
	private String gratuito;

	public Comparte() {

	}

	public Comparte(Integer id, Usuario emisor, Promocion promocion, 
			Integer compra, Usuario receptor, String gratuito) {
		super();
		this.id = id;
		this.emisor = emisor;
		this.promocion = promocion;
		this.compra = compra;
		this.receptor = receptor;
		this.gratuito = gratuito;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getEmisor() {
		return emisor;
	}

	public void setEmisor(Usuario emisor) {
		this.emisor = emisor;
	}

	public Promocion getPromocion() {
		return promocion;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}

	public Integer getCompra() {
		return compra;
	}

	public void setCompra(Integer compra) {
		this.compra = compra;
	}

	public Usuario getReceptor() {
		return receptor;
	}

	public void setReceptor(Usuario receptor) {
		this.receptor = receptor;
	}

	public String getGratuito() {
		return gratuito;
	}

	public void setGratuito(String gratuito) {
		this.gratuito = gratuito;
	}

}

// END Comparte.java
