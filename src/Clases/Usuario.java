package Clases;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

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
	private Set<Usuario> agrega_amigo = new HashSet<Usuario>();
	private Set<Usuario> acepta_amigo = new HashSet<Usuario>();	
	private Set<Usuario> emisor = new HashSet<Usuario>();
	private Set<Usuario> receptor = new HashSet<Usuario>();
	private Set<Ciudad> ciudades = new HashSet<Ciudad>();
	private Set<Categoria> categorias = new HashSet<Categoria>();
	private Map<Tarjeta_Regalo,Usuario> compra_tarjeta = new HashMap<Tarjeta_Regalo,Usuario>();
	private Set<Vale> vales = new HashSet<Vale>();

    private Set<Comparte> comparte_emisor = new HashSet<Comparte>();
    private Set<Comparte> comparte_receptor = new HashSet<Comparte>();

	public Usuario(String username, String contrasena, String nombre,
			String apellido, String correo_elec, String suscrip_correos,
			String frec_correos, int dinero_promo, int puntos,
			Set<Tarjeta_Credito> tdcs, Set<User_Redes> users_redes,
			Set<Usuario> agrega_amigo, Set<Usuario> acepta_amigo,
			Set<Usuario> emisor, Set<Usuario> receptor, Set<Ciudad> ciudades,
			Set<Categoria> categorias,
			Map<Tarjeta_Regalo, Usuario> compra_tarjeta, Set<Vale> vales,
			Set<Comparte> comparte_emisor, Set<Comparte> comparte_receptor) {
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
		this.agrega_amigo = agrega_amigo;
		this.acepta_amigo = acepta_amigo;
		this.emisor = emisor;
		this.receptor = receptor;
		this.ciudades = ciudades;
		this.categorias = categorias;
		this.compra_tarjeta = compra_tarjeta;
		this.vales = vales;
		this.comparte_emisor = comparte_emisor;
		this.comparte_receptor = comparte_receptor;
	}

	public Usuario(){

	}

	public synchronized void addTernaria(final Tarjeta_Regalo tarjeta, Usuario user) {
        compra_tarjeta.put(tarjeta,user);
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

	public Set<Usuario> getAgrega_amigo() {
		return agrega_amigo;
	}

	public void setAgrega_amigo(Set<Usuario> agrega_amigo) {
		this.agrega_amigo = agrega_amigo;
	}

	public Set<Usuario> getAcepta_amigo() {
		return acepta_amigo;
	}

	public void setAcepta_amigo(Set<Usuario> acepta_amigo) {
		this.acepta_amigo = acepta_amigo;
	}

	public Set<Usuario> getEmisor() {
		return emisor;
	}

	public void setEmisor(Set<Usuario> emisor) {
		this.emisor = emisor;
	}

	public Set<Usuario> getReceptor() {
		return receptor;
	}

	public void setReceptor(Set<Usuario> receptor) {
		this.receptor = receptor;
	}

	public Set<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(Set<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> ciudades) {
		this.categorias = categorias;
	}

	public Map<Tarjeta_Regalo,Usuario> getCompra_tarjeta() {
		return compra_tarjeta;
	}

	public void setCompra_tarjeta(Map<Tarjeta_Regalo,Usuario> compra_tarjeta) {
		this.compra_tarjeta = compra_tarjeta;
	}

	public Set<Vale> getVales() {
		return vales;
	}

	public void setVales(Set<Vale> vales) {
		this.vales = vales;
	}

	public Set<Comparte> getComparte_emisor() {
		return comparte_emisor;
	}

	public void setComparte_emisor(Set<Comparte> comparte_emisor) {
		this.comparte_emisor = comparte_emisor;
	}

	public Set<Comparte> getComparte_receptor() {
		return comparte_receptor;
	}

	public void setComparte_receptor(Set<Comparte> comparte_receptor) {
		this.comparte_receptor = comparte_receptor;
	}

}

// END Usuario.java
