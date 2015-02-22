package Clases;

import java.math.BigInteger;
import java.sql.Date;
import java.util.Set;
import java.util.HashSet;

public class Promocion {

	private int identificador;
	private String descripcion;
	private int precio_real;
	private int precio_ofertado;
	private Date fecha_ini_vig;
	private Date fecha_fin_vig;
	private BigInteger coordenadas;
	private Set<Enlace> enlaces = new HashSet<Enlace>();
	
	private Set<Ciudad> ciudades = new HashSet<Ciudad>();
	
	public Promocion(int identificador, String descripcion, int precio_real,
			int precio_ofertado, Date fecha_ini_vig, Date fecha_fin_vig,
			BigInteger coordenadas, Set<Enlace> enlaces, Set<Ciudad> ciudades) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.precio_real = precio_real;
		this.precio_ofertado = precio_ofertado;
		this.fecha_ini_vig = fecha_ini_vig;
		this.fecha_fin_vig = fecha_fin_vig;
		this.coordenadas = coordenadas;
		this.enlaces = enlaces;
		this.ciudades = ciudades;
	}

	public Promocion() {
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio_real() {
		return precio_real;
	}

	public void setPrecio_real(int precio_real) {
		this.precio_real = precio_real;
	}

	public int getPrecio_ofertado() {
		return precio_ofertado;
	}

	public void setPrecio_ofertado(int precio_ofertado) {
		this.precio_ofertado = precio_ofertado;
	}

	public Date getFecha_ini_vig() {
		return fecha_ini_vig;
	}

	public void setFecha_ini_vig(Date fecha_ini_vig) {
		this.fecha_ini_vig = fecha_ini_vig;
	}

	public Date getFecha_fin_vig() {
		return fecha_fin_vig;
	}

	public void setFecha_fin_vig(Date fecha_fin_vig) {
		this.fecha_fin_vig = fecha_fin_vig;
	}

	public BigInteger getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(BigInteger coordenadas) {
		this.coordenadas = coordenadas;
	}

	public Set<Enlace> getEnlaces() {
		return enlaces;
	}

	public void setEnlaces(Set<Enlace> enlaces) {
		this.enlaces = enlaces;
	}

	public Set<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(Set<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

}