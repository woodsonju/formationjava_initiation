package fr.dawan.baseJava.syntaxe_de_base.io_standard;

public class FormatageDeChaineDeCaractere {

	public static void main(String[] args) {
		int dividende = 25;
		int diviseur = 11;

		// 1er solution : Utilisation de println ==> [25/11]
		System.out.println("[" + dividende + "/" + diviseur + "]");

		int id = 5;
		/*
		 * Les sorties formatées : Le format de ce qui va être affiché
		 * 
		 * %s permet de formater un chaine caractère 
		 * %c Permet de formater un caractère
		 * %d Permet de formater un entier en base décimal 
		 * %f Permet de formater un réel sous forme décimal 
		 * %n ou \n retour à la ligne
		 */

		// 2ème solution : Utilisation de printf
		System.out.printf("[%d/%d]%n", dividende, diviseur);

		System.out.println("La valeur de l'id est " + id);
		System.out.printf("La valeur de l'id est %d%n", id);

		// 3ème solution :Utilisation de String.format
		String str = String.format("[%d/%d]%n", dividende, diviseur);
		System.out.println(str);
		 
		
		System.out.println(Math.PI); //static : variable de classe ==> Classe.Variable
		//Formatter la valeur de PI avec 2 chiffres après la virgule
		System.out.printf("%.f\n", Math.PI);
		

	}

}
