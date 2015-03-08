package Clases;

public class StateVencida implements State {
	
	public void doAction(Promocion prom) {
		System.out.println("Promocion vencida");
		
		prom.setLink("");		
	}	

}
