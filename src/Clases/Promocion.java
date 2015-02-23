package Clases;

import java.sql.Date;
import java.util.Set;
import java.util.HashSet;

/*
 * Clase: Promocion
 * Descripcion: Modalidad de venta donde los productos, servicios o eventos son 
 * ofertados a un precio menor al real en sus principales puntos de comercializacion
 */
public class Promocion {

	private int identificador;
	private String descripcion;
	private int precio_real;
	private int precio_ofertado;
	private Date fecha_ini_vig;
	private Date fecha_fin_vig;
	private int coordenadas;
	private Set<Enlace> enlaces = new HashSet<Enlace>();
	
	private Set<Ciudad> ciudades = new HashSet<Ciudad>();
	private Empresa empresa;	
	private Set<Bien> bienes = new HashSet<Bien>();
	private Categoria categoria;
	private Set<Vale> vales = new HashSet<Vale>();
	
	public Promocion(int identificador, String descripcion, int precio_real,
			int precio_ofertado, Date fecha_ini_vig, Date fecha_fin_vig,
			int coordenadas, Set<Enlace> enlaces, Set<Ciudad> ciudades,
			Empresa empresa, Set<Bien> bienes, Categoria categoria,
			Set<Vale> vales) {
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.precio_real = precio_real;
		this.precio_ofertado = precio_ofertado;
		this.fecha_ini_vig = fecha_ini_vig;
		this.fecha_fin_vig = fecha_fin_vig;
		this.coordenadas = coordenadas;
		this.enlaces = enlaces;
		this.ciudades = ciudades;
		this.empresa = empresa;
		this.bienes = bienes;
		this.categoria = categoria;
		this.vales = vales;
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

	public int getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(int coordenadas) {
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Set<Bien> getBienes() {
		return bienes;
	}

	public void setBienes(Set<Bien> bienes) {
		this.bienes = bienes;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<Vale> getVales() {
		return vales;
	}

	public void setVales(Set<Vale> vales) {
		this.vales = vales;
	}

}

// END Promocion.java
