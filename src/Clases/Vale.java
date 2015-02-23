package Clases;

import java.sql.Date;
import java.util.Set;
import java.util.HashSet;

/*
 * Clase: Vale
 * Descripcion: Aquellos vales que fueron canjeados por el usuario
 */
public class Vale {

	private int identificador;
	private Date fecha_compra;
	private String forma_pago;
	private String descrip_promo;
	private String codigo_movil;
	private String modo_envio;
	private Set<Fecha_Uso> fechas_uso = new HashSet<Fecha_Uso>();
	
	private Ciudad ciudad;
	
	public Vale(int identificador, Date fecha_compra, String forma_pago,
			String descrip_promo, String codigo_movil, String modo_envio,
			Set<Fecha_Uso> fechas_uso, Ciudad ciudad) {
		this.identificador = identificador;
		this.fecha_compra = fecha_compra;
		this.forma_pago = forma_pago;
		this.descrip_promo = descrip_promo;
		this.codigo_movil = codigo_movil;
		this.modo_envio = modo_envio;
		this.fechas_uso = fechas_uso;
		this.ciudad = ciudad;
	}

	public Vale() {

	}
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public String getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	public String getDescrip_promo() {
		return descrip_promo;
	}

	public void setDescrip_promo(String descrip_promo) {
		this.descrip_promo = descrip_promo;
	}

	public String getCodigo_movil() {
		return codigo_movil;
	}

	public void setCodigo_movil(String codigo_movil) {
		this.codigo_movil = codigo_movil;
	}

	public String getModo_envio() {
		return modo_envio;
	}

	public void setModo_envio(String modo_envio) {
		this.modo_envio = modo_envio;
	}

	public Set<Fecha_Uso> getFechas_uso() {
		return fechas_uso;
	}

	public void setFechas_uso(Set<Fecha_Uso> fechas_uso) {
		this.fechas_uso = fechas_uso;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}

// END Vale.java
