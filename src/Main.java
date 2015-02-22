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


//        @SuppressWarnings("deprecation")
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();

	    // Primero se guarda la clase no propietaria, check inverse en set de su xml
	   	//session.save(fecha1);
	    //session.save(fecha2);
		//session.save(evento);
//	    session.save(vr1); 
	    session.save(p1);    
	    session.save(c1);	
	    	    
        session.getTransaction().commit();
	         
        session.close();
        sessionFactory.close();

	}

}
