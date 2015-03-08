package Clases;

import java.util.Calendar;
import java.sql.Date;

public class StatePublicada implements State {

	public void doAction(Promocion prom) {
		
		System.out.println("Promocion publicada");

		// Caso anulada
		String link = prom.getLink();		
		if (link == null) {
			prom.setStatus(new StateAnulada());
		}		
		
		// Caso vencida	
		Date fecha_fin_vig = prom.getFecha_fin_vig();
		Date today_date = new Date(Calendar.getInstance().getTimeInMillis());
		
		if ((fecha_fin_vig.getDate() == today_date.getDate()) &
			(fecha_fin_vig.getMonth() == today_date.getMonth()) &
			(fecha_fin_vig.getYear() == today_date.getYear())) {
			prom.setStatus(new StateVencida());			
		}
		
		// Verificacion de venta		
		Integer compras = prom.getCompras();		
		if (compras == null) {
			prom.setCompras(0);
		} else {
			prom.setCompras(prom.getCompras()+1);
		}

		// Despues de venta, verificar existencia
		if (prom.getCompras() == prom.getExistencia())  
			prom.setStatus(new StateSinExistencia());
		
	}

}
