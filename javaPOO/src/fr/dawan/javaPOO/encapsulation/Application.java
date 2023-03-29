package fr.dawan.javaPOO.encapsulation;

public class Application {

	public static void main(String[] args) {
		
		Utilisateur user3 = new Utilisateur("Négat", "Ray", 28);
		System.out.printf("%s %s : vous avez %d ans \n", user3.getPrenom(), user3.getNom(), user3.getAge());
		
		System.out.println(Utilisateur.getNbreUtilisateur());
		
		System.out.println(user3.decrisToi());
		
	}

}
