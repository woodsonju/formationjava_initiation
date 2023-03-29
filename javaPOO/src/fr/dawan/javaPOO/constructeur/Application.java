package fr.dawan.javaPOO.constructeur;

public class Application {

	public static void main(String[] args) {
		
		//Un objet (ou instance) : new + constructeur
		Utilisateur user1 = new Utilisateur();
		
		System.out.println(user1);
		
		user1.prenom = "Guy";
		user1.nom = "Lee";
		System.out.println("Nom user1 : " + user1.nom);
		
		Utilisateur user2 = new Utilisateur("Culaire", "Laurie");
		
		System.out.println(user2.prenom);
		
		Utilisateur user3 = new Utilisateur("Négat", "Ray", 28);
		System.out.printf("%s %s : vous avez %d ans \n", user3.prenom, user3.nom, user3.age);
		
		System.out.println(Utilisateur.nbreUtilisateur);
		
	}

}
