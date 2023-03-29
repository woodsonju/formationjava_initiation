package fr.dawan.javaPOO.encapsulation;

public class Utilisateur {
	/*
	 * Attributs 
	 */
	private String nom; 
	private String prenom;
	private int age;
	

	private static int nbreUtilisateur;
	
	
	/*
	 * Constructeurs 
	 */
	public Utilisateur() {
		nbreUtilisateur++;
	}
	

	public Utilisateur (String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;

	}
	
	public Utilisateur(String nom, String prenom, int age) {
		this(nom, prenom);
		this.age = age;
	}
	
	
	
	/*
	 * Méthodes
	 */
	
	//Getter 
	public int getAge() {
		return this.age;
	}

	//Setter 
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	public static int getNbreUtilisateur() {
		return nbreUtilisateur;
	}
	
	
	public String decrisToi() {
		return "Je suis " + this.prenom + " " + this.nom + " et j'ai " + this.age + " ans";
	}
	

}
