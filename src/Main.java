import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Set;
import java.sql.Date;
import java.util.HashSet;
import Clases.*;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			
		Ciudad c1 = new Ciudad();
		c1.setNombre("Frankfurt");
		c1.setPais("Alemania");

		Promocion p1 = new Promocion();
		p1.setIdentificador(245638);
		p1.setDescripcion("Excursion en Merida");
		p1.setPrecio_real(8700);
		p1.setPrecio_ofertado(7600);
		p1.setFecha_ini_vig(new Date(115,2,3));
		p1.setFecha_fin_vig(new Date(115,5,3));
		p1.setCoordenadas(1234567890);
		
/*		Enlace e1 = new Enlace();
		e1.setUrl("www.venezuelatuya.com");
		
		p1.getEnlaces().add(e1); */
		p1.setCoordenadas(1234567890);		

		c1.getPromociones().add(p1);
		p1.getCiudades().add(c1);
		
		//Vale_Regalo vr1 = new Vale_Regalo();

		//vr1.setIdentificador(123456);
		//vr1.setFecha_compra(new Date(3,5,2015));
		//vr1.setForma_pago("TDC");
		//vr1.setDescrip_promo("Ful day en los Roques");
		//vr1.setCodigo_movil("QR123456");
		//vr1.setModo_envio("Correo Electronico");
		//vr1.setReceptor("Rosangelis");
		//vr1.setFecha_envio(new Date(5,5,2015));

		//Fecha_Realizacion fecha1 = new Fecha_Realizacion(new Date(115,5,2));
		//Fecha_Realizacion fecha2 = new Fecha_Realizacion(new Date(115,5,3));
		//Set<Fecha_Realizacion> fechas = new HashSet<Fecha_Realizacion>();
		//fechas.add(fecha1);
		//fechas.add(fecha2);

		//Evento evento = new Evento();
		//evento.setNombre("TOUR");
		//evento.setDescripcion("Rihanna concierto");
		//evento.setFechas(fechas);

/*		Enlace e1 = new Enlace();
		e1.setUrl("www.venezuelatuya.com");
		Enlace e2 = new Enlace();
		e2.setUrl("www.google.com");
		Set<Enlace> enlaces = new HashSet<Enlace>();
		enlaces.add(e1);
		enlaces.add(e2);

		p1.setEnlaces(enlaces);*/

		Empresa m1 = new Empresa();
		m1.setNombre("McDonalds");
		m1.setTelefono("02129454422");
		m1.setDireccion("Avenida principal de la Trinidad, Baruta - Edo.Miranda");
		m1.setNum_clientes(2500);
		
		Categoria t1 = new Categoria();
		t1.setNombre("Alimentos");
		
		m1.getCategorias().add(t1);
		t1.getEmpresas().add(m1);

		p1.setEmpresa(m1);
		m1.getPromociones().add(p1);
		
		Subcategoria s1 = new Subcategoria();
		s1.setNombre("Comida rapida");
		s1.setCategoria(t1);
		
		Subcategoria s2 = new Subcategoria();
		s2.setNombre("Hamburguesas");
		s2.setCategoria(t1);
		s2.setSubcat_papa(s1);
		
		s1.getSubcategorias().add(s2);
		
		Vale v1 = new Vale();
		v1.setIdentificador(67892);
		v1.setCiudad(c1);
		
		c1.getVales().add(v1);
		
		
        @SuppressWarnings("deprecation")

	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();

//	    session.save(m1);	    
//	    session.save(p1);
	    
	    session.save(t1);	    
	    session.save(s1);   
	    session.save(s2);	  
	    
	   	session.save(c1);
	   	session.save(v1);


//	    // Primero se guarda la clase no propietaria, check inverse en set de su xml
//	    session.save(p1);    
//	    session.save(c1);
	    	    
//	    session.save(m1);
//	    session.save(t1);

        session.getTransaction().commit();
	         
        session.close();
        sessionFactory.close();

	}

}
