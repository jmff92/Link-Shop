import java.sql.Date;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Clases.Ciudad;
import Clases.Enlace;
import Clases.Promocion;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
			
		Ciudad c1 = new Ciudad();
		c1.setNombre("Toledo");
		c1.setPais("España");
				
		Promocion p1 = new Promocion();
		p1.setIdentificador(245638);
		p1.setDescripcion("Excursion en Merida");
		p1.setPrecio_real(8700);
		p1.setPrecio_ofertado(7600);
		p1.setFecha_ini_vig(new Date(115,2,3));
		p1.setFecha_fin_vig(new Date(115,5,3));
		p1.setCoordenadas(1234567890);
		
		Enlace e1 = new Enlace();
		e1.setUrl("www.venezuelatuya.com");
		
		p1.getEnlaces().add(e1);

		// Se agrega sobre la clase propietaria, check inverse en set de su xml
		c1.getPromociones().add(p1);
		p1.getCiudades().add(c1);
		
        @SuppressWarnings("deprecation")
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();

//	    // Primero se guarda la clase no propietaria, check inverse en set de su xml
	    session.save(e1);
	    session.save(p1);    
	    session.save(c1);	
	    
        session.getTransaction().commit();
	         
        session.close();
        sessionFactory.close();

	}

}
