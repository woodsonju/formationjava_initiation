package fr.dawan.javaException.exception_personnalisee;

import java.io.Serializable;

public class Voiture implements Serializable {

	private static final long serialVersionUID = 7522611511701560728L;
	
	private String marque; 
	private String immatriculation;
	private int vitesse;
	
	public Voiture() {
		// TODO Auto-generated constructor stub
	}

	public Voiture(String marque, String immatriculation, int vitesse) {
		super();
		this.marque = marque;
		this.immatriculation = immatriculation;
		this.vitesse = vitesse;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", immatriculation=" + immatriculation + ", vitesse=" + vitesse + "]";
	}
	

}
