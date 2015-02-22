import java.sql.Date;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Clases.Ciudad;
import Clases.Promocion;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

//		SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
		
//		Ciudad c1 = new Ciudad();
//		c1.setNombre("Caracas");
//		c1.setPais("Venezuela");
		
//		Ciudad c2 = new Ciudad();
//		c2.setNombre("Valencia");
//		c2.setPais("Venezuela");
		
//		Promocion p1 = new Promocion();
//		p1.setIdentificador(245638);
//		p1.setDescripcion("Excursion en la Gran Sabana");
//		p1.setPrecio_real(8700);
//		p1.setPrecio_ofertado(7600);
//		p1.setFecha_ini_vig(new Date(5,3,2015));
//		p1.setFecha_fin_vig(new Date(5,5,2015));
		//p1.setCoordenadas(12345678901234567890);
		
//		c1.getPromociones().add(p1);
//		c2.getPromociones().add(p1);		
		
//        @SuppressWarnings("deprecation")
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//	    Session session = sessionFactory.openSession();
//	    session.beginTransaction();
	         
//	    session.save(c1);    
//	    session.save(c2);
//	    session.save(p1);	    
	         
//        session.getTransaction().commit();
	         
//        session.close();
        sessionFactory.close();

	}

}
