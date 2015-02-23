package Clases;

import java.util.Set;
import java.util.HashSet;

/*
 * Clase: Usuario
 * Descripcion: Aquella persona que adquiere promociones de productos, bienes o 
 * servicios, motivado por el bien y su precio ofertado
 */
public class Usuario {

	private String username;
	private String contrasena;
	private String nombre;
	private String apellido;
	private String correo_elec;
	private String suscrip_correos;
	private String frec_correos;
	private int dinero_promo;
	private int puntos;
	private Set<Tarjeta_Credito> tdcs = new HashSet<Tarjeta_Credito>();
	private Set<User_Redes> users_redes = new HashSet<User_Redes>();
	
	public Usuario(String username, String contrasena, String nombre,
			String apellido, String correo_elec, String suscrip_correos,
			String frec_correos, int dinero_promo, int puntos, Set<Tarjeta_Credito> tdcs,
			Set<User_Redes> users_redes) {
		this.username = username;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo_elec = correo_elec;
		this.suscrip_correos = suscrip_correos;
		this.frec_correos = frec_correos;
		this.dinero_promo = dinero_promo;
		this.puntos = puntos;
		this.tdcs = tdcs;
		this.users_redes = users_redes;
	}

	public Usuario(){

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo_elec() {
		return correo_elec;
	}

	public void setCorreo_elec(String correo_elec) {
		this.correo_elec = correo_elec;
	}

	public String getSuscrip_correos() {
		return suscrip_correos;
	}

	public void setSuscrip_correos(String suscrip_correos) {
		this.suscrip_correos = suscrip_correos;
	}

	public String getFrec_correos() {
		return frec_correos;
	}

	public void setFrec_correos(String frec_correos) {
		this.frec_correos = frec_correos;
	}

	public int getDinero_promo() {
		return dinero_promo;
	}

	public void setDinero_promo(int dinero_promo) {
		this.dinero_promo = dinero_promo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public Set<Tarjeta_Credito> getTdcs() {
		return tdcs;
	}

	public void setTdcs(Set<Tarjeta_Credito> tdcs) {
		this.tdcs = tdcs;
	}

	public Set<User_Redes> getUsers_redes() {
		return users_redes;
	}

	public void setUsers_redes(Set<User_Redes> users_redes) {
		this.users_redes = users_redes;
	}

}

// END Usuario.java
