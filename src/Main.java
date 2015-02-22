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
	
		Ciudad c1 = new Ciudad();
		c1.setNombre("Puerto Ordaz");
		c1.setPais("Venezuela");
				
		Promocion p1 = new Promocion();
		p1.setIdentificador(245638);
		p1.setDescripcion("Excursion en Mochima");
		p1.setPrecio_real(8700);
		p1.setPrecio_ofertado(7600);
//		p1.setFecha_ini_vig(new Date(5,3,2015));
//		p1.setFecha_fin_vig(new Date(5,5,2015));
//		p1.setCoordenadas(12345678901234567890);

		// Se agrega sobre la clase propietaria, check inverse en set de su xml
		c1.getPromociones().add(p1);
		
//        @SuppressWarnings("deprecation")
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();

	    // Primero se guarda la clase no propietaria, check inverse en set de su xml
	    session.save(p1);    
	    session.save(c1);	
	    
        session.getTransaction().commit();
	         
        session.close();
        sessionFactory.close();

	}

}
