package Clases;

/*
 * Representa el estado de una promocion anulada. 
 */

public class StateAnulada implements State {

	public void doAction(Promocion prom) {
		
		System.out.println("Promocion anulada");
		
		prom.setLink("");
		
	}

}
