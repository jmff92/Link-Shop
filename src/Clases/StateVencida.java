package Clases;

/*
 * Representa el estado de una promocion que ya expiro. 
 */

public class StateVencida implements State {
	
	public void doAction(Promocion prom) {
		System.out.println("Promocion vencida");
		
		prom.setLink("");		
	}	

}
