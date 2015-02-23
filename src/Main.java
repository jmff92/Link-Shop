import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Set;
import java.sql.Date;
import java.util.HashSet;
import Clases.*;

/*
 * Main Principal
 */
public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			
		Ciudad c1 = new Ciudad();
		c1.setNombre("Toledo");
		c1.setPais("España");

		Ciudad c2 = new Ciudad();
		c2.setNombre("Caracas");
		c2.setPais("Venezuela");

		Enlace e1 = new Enlace();
		e1.setUrl("www.venezuelatuya.com");
		Enlace e2 = new Enlace();
		e2.setUrl("www.google.com");
		Set<Enlace> enlaces = new HashSet<Enlace>();
		enlaces.add(e1);
		enlaces.add(e2);

		Promocion p1 = new Promocion();
		p1.setIdentificador(245638);
		p1.setDescripcion("Excursion en Merida");
		p1.setPrecio_real(8700);
		p1.setPrecio_ofertado(7600);
		p1.setFecha_ini_vig(new Date(115,2,3));
		p1.setFecha_fin_vig(new Date(115,5,3));		
		p1.setCoordenadas(1234567890);
		p1.setEnlaces(enlaces);

		Bien bien = new Bien();
		bien.setNombre("WORLD TOUR");
		bien.setDescripcion("Jason Derulo concierto");
		
		Empresa m1 = new Empresa();
		m1.setNombre("McDonalds");
		m1.setTelefono("02129454422");
		m1.setDireccion("Avenida principal de la Trinidad, Baruta - Edo.Miranda");
		m1.setNum_clientes(2500);
		
		Categoria t1 = new Categoria();
		t1.setNombre("Alimentos");
		
		Categoria cat2 = new Categoria();
		cat2.setNombre("Turismo");		
		cat2.getPromociones().add(p1);
		p1.setCategoria(cat2);

		Set<Promocion> promociones = new HashSet<Promocion>();
		promociones.add(p1);	

		Set<Bien> bienes = new HashSet<Bien>();
		bienes.add(bien);
		
		p1.setBienes(bienes);
		bien.setPromociones(promociones);

		c1.getPromociones().add(p1);
		p1.getCiudades().add(c1);

		m1.getCategorias().add(t1);
		t1.getEmpresas().add(m1);

		p1.setEmpresa(m1);
		m1.getPromociones().add(p1);

		Fecha_Uso fecha_uso1 = new Fecha_Uso(new Date(115,5,2));
		Fecha_Uso fecha_uso2 = new Fecha_Uso(new Date(115,5,3));
		Set<Fecha_Uso> fechas_uso = new HashSet<Fecha_Uso>();
		fechas_uso.add(fecha_uso1);
		fechas_uso.add(fecha_uso2);

		Subcategoria s1 = new Subcategoria();
		s1.setNombre("Comida rapida");
		s1.setCategoria(t1);
		
		Subcategoria s2 = new Subcategoria();
		s2.setNombre("Hamburguesas");
		s2.setCategoria(t1);
		s2.setSubcat_papa(s1);
		
		s1.getSubcategorias().add(s2);

		Vale v1 = new Vale();

		v1.setIdentificador(123456);
		v1.setFecha_compra(new Date(3,5,2015));
		v1.setForma_pago("TDC");
		v1.setDescrip_promo("Full day en los Roques");
		v1.setCodigo_movil("QR123456");
		v1.setModo_envio("Correo Electronico");
		v1.setFechas_uso(fechas_uso);
		v1.setCiudad(c1);
			
		c1.getVales().add(v1);

		User_Redes red1 = new User_Redes();
		red1.setUser("@rosangelisgarcia");
		red1.setRed("Instagram");

		User_Redes red2 = new User_Redes();
		red2.setUser("@rosangelisg");
		red2.setRed("Twitter");

		Set<User_Redes> users_redes = new HashSet<User_Redes>();
		users_redes.add(red1);
		users_redes.add(red2);

		Tarjeta_Credito tdc1 = new Tarjeta_Credito("123456");
		Tarjeta_Credito t2 = new Tarjeta_Credito("654321");
		Set<Tarjeta_Credito> tdcs = new HashSet<Tarjeta_Credito>();
		tdcs.add(tdc1);
		tdcs.add(t2);

		Usuario u1 = new Usuario();
		u1.setUsername("rosangelisg");
		u1.setContrasena("123456");
		u1.setNombre("Rosangelis");
		u1.setApellido("Garcia");
		u1.setCorreo_elec("rosangelis.92");
		u1.setSuscrip_correos("true");
		u1.setFrec_correos("15 dias");
		u1.setDinero_promo(100);
		u1.setPuntos(50);
		u1.setTdcs(tdcs);
		u1.setUsers_redes(users_redes);
				
		v1.setPromocion(p1);
		p1.getVales().add(v1);		
		
		v1.setUsuario(u1);		
		u1.getVales().add(v1);
		
		Usuario u2 = new Usuario();
		u2.setUsername("joseff");
		u2.getAgrega_amigo().add(u1);		
		u1.getEmisor().add(u2);
				
		Vale_Regalo vr1 = new Vale_Regalo();
		vr1.setIdentificador(5432);
		vr1.setFecha_compra(new Date(3,8,2015));
		vr1.setForma_pago("TDC");
		vr1.setDescrip_promo("Full day en Mochima");
		vr1.setCodigo_movil("QR654321");
		vr1.setModo_envio("Correo Electronico");
		vr1.setReceptor("Rosangelis");
		vr1.setFecha_envio(new Date(5,5,2015));
		vr1.setCiudad(c2);
		
		vr1.setPromocion(p1);
		p1.getVales().add(vr1);		
		
		vr1.setUsuario(u1);		
		u1.getVales().add(vr1);		
		
		
		c2.getVales().add(vr1);

		Set<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(u1);
		usuarios.add(u2);
		c2.setUsuarios(usuarios);
		t1.setUsuarios(usuarios);

		Set<Ciudad> ciudades = new HashSet<Ciudad>();
		ciudades.add(c1);
		u1.setCiudades(ciudades);
		u2.setCiudades(ciudades);

		Set<Categoria> categorias = new HashSet<Categoria>();
		categorias.add(t1);
		u1.setCategorias(categorias);
		u2.setCategorias(categorias);

		Tarjeta_Regalo tarjeta_regalo = new Tarjeta_Regalo();
		tarjeta_regalo.setCodigo(9998);
		tarjeta_regalo.setMonto(200); 

		u1.addTernaria(tarjeta_regalo,u2);

		u2.addTernariaComparte(p1,u1);

        @SuppressWarnings("deprecation")

	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();

	    session.save(tarjeta_regalo);
		session.save(cat2);
	    session.save(e1);
		session.save(e2);
		session.save(m1);
		session.save(t1);
		session.save(bien);
		session.save(p1);
		session.save(c1);
		session.save(c2);
		session.save(v1);		
	    session.save(fecha_uso1);
	    session.save(fecha_uso2);	    
	    session.save(tdc1);
	    session.save(t2);
	   	session.save(s1);   
	    session.save(s2);
	    session.save(red1);
	    session.save(red2);
	    session.save(u1);
	    session.save(u2);
	    session.save(vr1);

        session.getTransaction().commit();
	         
        session.close();
        sessionFactory.close();

	}

}

// END Main.java
