package fr.dawan.javaPOO.polymorphisme;

public class Rectangle extends Forme{
	
	private int longueur;
	private int largeur;

	
	//Le mot clé super permet d'appeler des méthodes et attributs de la classe mère
	public Rectangle() {
	}

	public Rectangle(int longueur, int largeur) {
		this();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	
	
	@Override
	public double aire() {
		System.out.print("Aire Rectangle : ");
		return longueur*largeur;
	}

	@Override
	public String decritToi() {
		return "Je suis un Rectangle";
	}
	


}
