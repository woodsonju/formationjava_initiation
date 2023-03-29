package fr.dawan.javaPOO.abstraction;

public abstract class Forme {
	
	protected  final int PROP1 = 5;
	
	private String chaine;
	
	public Forme() {
		System.out.println("Je suis un constructeur de la classe Forme");
	}

	public Forme(String chaine) {
		super();
		this.chaine = chaine;
		System.out.println(this.chaine);
	}

	public String decritToi() {
		return "Je suis la classe abstraite";
	}
	
	public abstract double aire();
	
	
}
