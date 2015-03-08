import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.sql.Date;
import java.util.HashSet;

import Util.HibernateUtil;
import Clases.*;

/*
 * Main Principal
 */
public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			
		Ciudad c1 = new Ciudad();
		Ciudad c2 = new Ciudad();
		Enlace e1 = new Enlace();
		Enlace e2 = new Enlace();
		Promocion p1 = new Promocion();
		Bien bien = new Bien();
		Empresa m1 = new Empresa();
		Categoria t1 = new Categoria();
		Categoria cat2 = new Categoria();
		Subcategoria s1 = new Subcategoria();
		Subcategoria s2 = new Subcategoria();
		Vale v1 = new Vale();
		User_Redes red1 = new User_Redes();
		User_Redes red2 = new User_Redes();
		Tarjeta_Credito tdc1 = new Tarjeta_Credito("123456");
		Tarjeta_Credito t2 = new Tarjeta_Credito("654321");
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();		
		Vale_Regalo vr1 = new Vale_Regalo();
		Tarjeta_Regalo tarjeta_regalo = new Tarjeta_Regalo();
		Fecha_Uso fecha_uso1 = new Fecha_Uso(new Date(115,5,2));
		Fecha_Uso fecha_uso2 = new Fecha_Uso(new Date(115,5,3));
		Comparte comparte1 = new Comparte();
		Comparte comparte2 = new Comparte();
		Comparte comparte3 = new Comparte();
		Comparte comparte4 = new Comparte();
		Usuario u3 = new Usuario();		
		Usuario u4 = new Usuario();
		Usuario u5 = new Usuario();			
		Vale v2 = new Vale();
		Vale v3 = new Vale();
		Vale v4 = new Vale();
		Vale v5 = new Vale();
		
		initialize(c1, c2, e1, e2, p1, bien, m1, t1, cat2, s1, s2, v1, red1, 
				red2, tdc1, t2, u1, u2, vr1, tarjeta_regalo, fecha_uso1,
				fecha_uso2, comparte1, comparte2, comparte3, comparte4, u3, u4, 
				u5, v2, v3, v4, v5);
		
        @SuppressWarnings("deprecation")

	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = null;
	    
		try {
			transaction = session.beginTransaction();

			session.save(tarjeta_regalo);
			session.save(cat2);
			session.save(e1);
			session.save(e2);
			session.save(m1);
			session.save(t1);
			session.save(bien);

			estadosPromocion(p1);
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
			
			/* DESCOMENTAR PARA PASO 4
			session.save(u3);
			session.save(u4);
			session.save(comparte1);
			session.save(comparte2);
			session.save(comparte3);
			*/

			/* DESCOMENTAR PARA PASO 6
			session.save(v2);
			session.save(v3);
			session.save(v4);
			*/

			/* DESCOMENTAR PARA PASO 8
			session.save(comparte4);
			*/

			/* DESCOMENTAR PARA PASO 9
			session.save(u5);
			session.save(v5);
			*/

			session.flush();        	       	
        	transaction.commit();			
			
		} catch (RuntimeException e) {
		    session.getTransaction().rollback();
		    throw e;
		} finally {session.close(); sessionFactory.close();}
		
	}

	public static void initialize(Ciudad c1, Ciudad c2, Enlace e1, Enlace e2, Promocion p1,
			Bien bien, Empresa m1, Categoria t1, Categoria cat2, Subcategoria s1, Subcategoria s2,
			Vale v1, User_Redes red1, User_Redes red2, Tarjeta_Credito tdc1, Tarjeta_Credito t2,
			Usuario u1, Usuario u2, Vale_Regalo vr1, Tarjeta_Regalo tarjeta_regalo, Fecha_Uso fecha_uso1,
			Fecha_Uso fecha_uso2, Comparte comparte1, Comparte comparte2, Comparte comparte3, Comparte comparte4,
			Usuario u3, Usuario u4, Usuario u5, Vale v2, Vale v3, Vale v4, Vale v5) {
		
		c1.setNombre("Madrid");
		c1.setPais("España");

		c2.setNombre("Caracas");
		c2.setPais("Venezuela");

		e1.setUrl("www.venezuelatuya.com");
		e2.setUrl("www.google.com");
		Set<Enlace> enlaces = new HashSet<Enlace>();
		enlaces.add(e1);
		enlaces.add(e2);

		p1.setIdentificador(245638);
		p1.setDescripcion("Excursion en Merida");
		p1.setPrecio_real(8700);
		p1.setPrecio_ofertado(7600);
		p1.setFecha_ini_vig(new Date(115,2,3));
		p1.setFecha_fin_vig(new Date(115,4,7));		
		p1.setCoordenadas(1234567890);
		p1.setEnlaces(enlaces);

		bien.setNombre("WORLD TOUR");
		bien.setDescripcion("Jason Derulo concierto");
		
		m1.setNombre("McDonalds");
		m1.setTelefono("02129454422");
		m1.setDireccion("Avenida principal de la Trinidad, Baruta - Edo.Miranda");
		m1.setNum_clientes(2500);
		
		t1.setNombre("Alimentos");

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

		Set<Fecha_Uso> fechas_uso = new HashSet<Fecha_Uso>();
		fechas_uso.add(fecha_uso1);
		fechas_uso.add(fecha_uso2);

		s1.setNombre("Comida rapida");
		s1.setCategoria(t1);
		
		s2.setNombre("Hamburguesas");
		s2.setCategoria(t1);
		s2.setSubcat_papa(s1);
		
		s1.getSubcategorias().add(s2);

		v1.setIdentificador(123456);
		v1.setFecha_compra(new Date(3,5,2015));
		v1.setForma_pago("TDC");
		v1.setDescrip_promo("Excursion en Merida");
		v1.setCodigo_movil("QR123456");
		v1.setModo_envio("Correo Electronico");
		v1.setFechas_uso(fechas_uso);
		v1.setCiudad(c1);
			
		c1.getVales().add(v1);

		red1.setUser("@rosangelisgarcia");
		red1.setRed("Instagram");

		red2.setUser("@rosangelisg");
		red2.setRed("Twitter");

		Set<User_Redes> users_redes = new HashSet<User_Redes>();
		users_redes.add(red1);
		users_redes.add(red2);

		Set<Tarjeta_Credito> tdcs = new HashSet<Tarjeta_Credito>();
		tdcs.add(tdc1);
		tdcs.add(t2);

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
		
		u2.setUsername("joseff");
		u2.getAgrega_amigo().add(u1);		
		u1.getEmisor().add(u2);
				
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

		tarjeta_regalo.setCodigo(9998);
		tarjeta_regalo.setMonto(200); 

		u1.addTernaria(tarjeta_regalo,u2);


		/*******************************************
		 *         COMPARTIR UNA PROMOCION         *
		 *******************************************/

		/* DESCOMENTAR PARA PASO 4
		u3.setUsername("johagd");
		u4.setUsername("anadorta");

		comparte1.setId(122);
		comparte1.setEmisor(u1);
		comparte1.setPromocion(p1);
		comparte1.setReceptor(u2);

		comparte2.setId(123);
		comparte2.setEmisor(u1);
		comparte2.setPromocion(p1);
		comparte2.setReceptor(u3);

		comparte3.setId(124);
		comparte3.setEmisor(u1);
		comparte3.setPromocion(p1);
		comparte3.setReceptor(u4); */

		/* DESCOMENTAR PARA PASO 6
		v2.setIdentificador(123457);
		v2.setFecha_compra(new Date(3,6,2015));
		v2.setForma_pago("TDC");
		v2.setDescrip_promo("Excursion en Merida");
		v2.setCodigo_movil("QR123456");
		v2.setModo_envio("Correo Electronico");
		v2.setFechas_uso(fechas_uso);
		v2.setCiudad(c1);
		v2.setPromocion(p1);
		p1.getVales().add(v2);		
		v2.setUsuario(u2);		
		u2.getVales().add(v2);

		v3.setIdentificador(123458);
		v3.setFecha_compra(new Date(3,7,2015));
		v3.setForma_pago("TDC");
		v3.setDescrip_promo("Excursion en Merida");
		v3.setCodigo_movil("QR123456");
		v3.setModo_envio("Correo Electronico");
		v3.setFechas_uso(fechas_uso);
		v3.setCiudad(c1);
		v3.setPromocion(p1);
		p1.getVales().add(v3);		
		v3.setUsuario(u3);		
		u3.getVales().add(v3);

		v4.setIdentificador(123459);
		v4.setFecha_compra(new Date(3,8,2015));
		v4.setForma_pago("TDC");
		v4.setDescrip_promo("Excursion en Merida");
		v4.setCodigo_movil("QR123456");
		v4.setModo_envio("Correo Electronico");
		v4.setFechas_uso(fechas_uso);
		v4.setCiudad(c1);
		v4.setPromocion(p1);
		p1.getVales().add(v4);		
		v4.setUsuario(u4);		
		u4.getVales().add(v4);
		*/

		/* DESCOMENTAR PARA PASO 8
		u5.setUsername("realejos");
		comparte4.setId(125);
		comparte4.setEmisor(u1);
		comparte4.setPromocion(p1);
		comparte4.setReceptor(u5);
		*/

		/* DESCOMENTAR PARA PASO 9
		v5.setIdentificador(123450);
		v5.setFecha_compra(new Date(3,8,2015));
		v5.setForma_pago("TDC");
		v5.setDescrip_promo("Excursion en Merida");
		v5.setCodigo_movil("QR123456");
		v5.setModo_envio("Correo Electronico");
		v5.setFechas_uso(fechas_uso);
		v5.setCiudad(c1);
		v5.setPromocion(p1);
		p1.getVales().add(v5);		
		v5.setUsuario(u5);		
		u5.getVales().add(v5);
		*/

	}
	
	public static void estadosPromocion(Promocion p1) {
					
		p1.setExistencia(2);
		p1.setLink("promocion-destacada");
		p1.doAction();
			
/*	promocion vencida			
		p1.setFecha_fin_vig(new Date(115,2,7));					
		p1.doAction();
*/			
/*	promocion anulada			
		p1.setLink("null");			
		p1.doAction();
*/						
/* 			
		p1.doAction();
		p1.doAction();
		p1.doAction();			
*/			
	}
		
}

// END Main.java
