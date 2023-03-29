package fr.dawan.javaPOO.polymorphisme;

public abstract class Forme {
	
	private String chaine;
	
	public Forme() {
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
