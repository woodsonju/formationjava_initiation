package fr.dawan.javaException.exception_personnalisee;

public class Application {

	public static void main(String[] args) {
		Parking parking = new Parking();
		
		
		try {
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
			parking.garerVoiture(new Voiture());
		} catch (ParkingPleinException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Bloc Finally");
		}

	}

}
