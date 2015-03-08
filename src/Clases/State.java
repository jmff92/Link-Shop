package Clases;

/*
 * Interfaz State
 * Encapsula comportamientos para cada estado de una promocion.
 */

public interface State {
	public void doAction(Promocion prom);
}
