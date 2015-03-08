package Clases;

public class StateSinExistencia implements State {

	public void doAction(Promocion prom) {
		System.out.println("Promocion sin existencia");
		
		prom.setLink("");		
	}

}
