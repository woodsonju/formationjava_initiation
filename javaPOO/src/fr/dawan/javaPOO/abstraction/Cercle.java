package fr.dawan.javaPOO.abstraction;

public class Cercle extends Forme{
	
	private double rayon;
	
	public Cercle() {
	}
	

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}


	@Override
	public double aire() {
		return Math.PI*rayon*rayon;
	}


	@Override
	public String decritToi() {
		return "Je suis un cercle";
	}
	
}
