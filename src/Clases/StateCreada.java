package Clases;

public class StateCreada implements State {

	public void doAction(Promocion prom) {

		System.out.println("Promocion creada");
		
		String link = prom.getLink();
				
		if (link == null) {
			prom.setStatus(new StateAnulada());
		} else {
			prom.setStatus(new StatePublicada());			
		}
			
	}

}
