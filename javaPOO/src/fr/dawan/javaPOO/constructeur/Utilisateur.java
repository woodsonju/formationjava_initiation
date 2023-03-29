package fr.dawan.javaPOO.constructeur;

public class Utilisateur {
	
	/*
	 * Les attributs 
	 */
	
	//variable d'instance : Instance.variable 
	public String nom; 
	public String prenom;
	public int age;
	
	
	//Variable de classe : Classe.variable 
	public static int nbreUtilisateur;
	
	
	/*
	 * Constructeurs
	 */
	
	//Constructeur sans paramètre (par defaut)
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	
	//Constructeur avec 2 paramètres
	public Utilisateur (String nom, String prenom) {
		//This fais reference à l'objet en cours (courant)
		//This represente l'objet dans lequel nous nous trouvons
		//On peut faire appel à this pour acceder à un attribut de la même classe
		this();
		this.nom = nom;
		this.prenom = prenom;
		//nbreUtilisateur++;
	}
	
	
	//constructeur avec 3 paramètres
	public Utilisateur(String nom, String prenom, int age) {
		//this.nom = nom; 
		//this.prenom = prenom;
		this(nom, prenom);
		this.age = age;
	//	nbreUtilisateur++;
	}

}
