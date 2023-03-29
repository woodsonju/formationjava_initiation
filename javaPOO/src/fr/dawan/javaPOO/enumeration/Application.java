package fr.dawan.javaPOO.enumeration;

public class Application {

	public static void main(String[] args) {
		
		Utilisateur user3 = new Utilisateur("Négat", "Ray", 28);
	
		if(user3.getTypeUtilisateur() == TypeUtilisateur.CLIENT) {
			System.out.println("Recuperer la liste des produits ");
		}  else if(user3.getTypeUtilisateur() == TypeUtilisateur.PRESTATAIRE) {
			System.out.println("Fournir des prestations");
		} else if(user3.getTypeUtilisateur() == TypeUtilisateur.ADMIN) {
			System.out.println("Vous avez accès à toutes les ressources (modification, suppression, ajout...)");
		} else {
			System.out.println("Identifiez vous!!!");
		}
		
	}

}
