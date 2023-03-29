package fr.dawan.javaException;

public class Utilisateur {
	/*
	 * Attributs 
	 */
	private String nom; 
	private String prenom;
	private int age;
	
	private static int nbreUtilisateur;
	
	private TypeUtilisateur typeUtilisateur;
	
	
	/*
	 * Constructeurs 
	 */
	public Utilisateur() {
		nbreUtilisateur++;
		typeUtilisateur = TypeUtilisateur.CLIENT;
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
		
		if(age < 15) {
			//System.out.println("Interdit au moins de 15 ans");
			throw new IllegalArgumentException("Interdit au moins de 15 ans");
		} else  {
			this.age = age;
		}
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


	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}


	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}
	
	
	

}
