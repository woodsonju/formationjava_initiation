package fr.dawan.javaPOO.abstraction;

public class Rectangle extends Forme{
	
	private int longueur;
	private int largeur;

	protected final int PROP1 = 20;
	
	//Le mot clé super permet d'appeler des méthodes et attributs de la classe mère
	public Rectangle() {
		System.out.println("Je suis un constructeur de la classe Rectangle");
		System.out.println(super.PROP1 + this.PROP1);
	}

	public Rectangle(int longueur, int largeur) {
		this();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	

	
	@Override
	public double aire() {
		return longueur*largeur;
	}

	@Override
	public String decritToi() {
		return "Je suis un Rectangle";
	}
	


}
