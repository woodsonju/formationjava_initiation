package fr.dawan.javaPOO.object_;

import java.io.Serializable;
import java.util.Objects;

public class CompteBancaire implements Serializable{

	private static final long serialVersionUID = 4334328502142135083L;
	
	private String nomProprietaire;
	private String numeroCompte;
	private double Solde;
	
	public CompteBancaire() {
		// TODO Auto-generated constructor stub
	}

	public CompteBancaire(String nomProprietaire, String numeroCompte, double solde) {
		super();
		this.nomProprietaire = nomProprietaire;
		this.numeroCompte = numeroCompte;
		Solde = solde;
	}

	public String getNomProprietaire() {
		return nomProprietaire;
	}

	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return Solde;
	}

	public void setSolde(double solde) {
		Solde = solde;
	}

	
	@Override
	public String toString() {
		return "CompteBancaire de " + this.nomProprietaire + " " 
									+ "\nNumeroCompte :" + this.numeroCompte 
									+ "\nSolde : " + this.Solde;
	}

	/*
	 * La méthode hashcode() calcule le code hashage pour l'objet en combinant les codes de 
	 * hachage des attributs 
	 */
	@Override
	public int hashCode() {
		
		// On définit un multiplication impair, de préférence un nombre premier
		//afin de garantir l'unicité, et d'éviter les collisions de hachage
		final int prime = 31;
		
		//On définit un résultat qui renvoyé 
		int result = 1;
		
		
		//Calcul du code de hachage du double
		long temp;
		temp = Double.doubleToLongBits(Solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
		
		// Lorsque vous devez gérer des hashcodes avec des objets 
		// Vous devez vérifier si l'objet n'est pas null, sinon vous aurez une erreur
		result = prime * result + ((nomProprietaire == null) ? 0 : nomProprietaire.hashCode());
		result = prime * result + ((numeroCompte == null) ? 0 : numeroCompte.hashCode());
		
		
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		//On vérifie si les références  d'objets sont identiques 
		if (this == obj)
			return true;
		
		//On vérifie l'objet passé en paramètre est null
		if (obj == null)
			return false;
		
		//On s'assure que les objets sont du même type, ici de type CompteBancaire
		//La méthode getClass retourne un objet Class qui represente la classe de votre 
		//votre objet 
		if (getClass() != obj.getClass())
			return false;
		
		//Maintenant, on compare les attributs de nos objets 
		CompteBancaire other = (CompteBancaire) obj;
		return Double.doubleToLongBits(Solde) == Double.doubleToLongBits(other.Solde)
				&& this.nomProprietaire.equals(other.nomProprietaire)
				&& this.numeroCompte.equals(other.numeroCompte);
	}

	

}
