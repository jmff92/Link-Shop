package Clases;

/*
 * Representa el estado de una promocion agotada en existencia. 
 */

public class StateSinExistencia implements State {

	public void doAction(Promocion prom) {
		System.out.println("Promocion sin existencia");
		
		prom.setLink("");		
	}

}
