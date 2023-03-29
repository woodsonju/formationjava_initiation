package fr.dawan.baseJava.syntaxe_de_base.variables;

public class ContanteEtRegleDeNommage {

	public static void main(String[] args) {
		/*
		 * Les constantes doivent être en majuscule, pour les différencier des autres variables
		 * final : veut dire que le contenu de ma variable ne va pas changer
		 */
		final int VIES_MAX = 15;
		//VIES_MAX = 52;
		
		System.out.println(VIES_MAX);
		
		System.out.println("***************************REGLES DE NOMMAGE****************************");
		
		//Le noms des variables peuvent commencer par un underscore 
		String _val = "toto";
		
		//Les noms des variables peuvent commencer par le $
		double $val = 5.3;
		
		//Les nom des variables peuvent contenir des chiffres 
		double conv2int = 500;
		
		/*
		 * Les mots composés
		 */
		//on peut utiliser l'underscore
		int nombre_de_vie = 5;
		
		//On peut utiliser le CamelCase 
		int nombreDeVie = 5;
		
		

	}

}
