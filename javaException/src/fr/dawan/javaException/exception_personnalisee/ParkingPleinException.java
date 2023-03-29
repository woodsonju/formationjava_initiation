package fr.dawan.javaException.exception_personnalisee;

/*
 * Pour créer ses propres exceptions 
 * 1- Heriter de la classe Exception 
 * 2- Appeler le constructeur de la classe exception
 */
public class ParkingPleinException extends Exception{

	public ParkingPleinException() {
		super("Il n'a plus de place sur le parkings");
		
	}

}
