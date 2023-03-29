package fr.dawan.javaPOO.abstraction;

public class Triangle extends Forme{

	private double base;
	private double hauteur;
	
	
	public Triangle() {
	}
	
	public Triangle(double base, double hauteur) {
		super();
		this.base = base;
		this.hauteur = hauteur;
	}

	@Override
	public double aire() {
		return base * hauteur * 0.5;
	}

	@Override
	public String decritToi() {
		// TODO Auto-generated method stub
		return "Je suis un triangle";
	}
	

}
