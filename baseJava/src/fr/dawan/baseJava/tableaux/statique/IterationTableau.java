package fr.dawan.baseJava.tableaux.statique;

public class IterationTableau {

	public static void main(String[] args) {
		
		int[] tab = {200, 330, 50};
		
		//Boucle for classique 
//		for(int i = 0; i < 3; i++) {
//			System.out.println("Element à la position " + i + " : " + tab[i]);
//		}
//		
		
		//Taille du tableau 
		System.out.println("\nTaille tableau : " + tab.length + "\n");
		
		//Boucle for classique 
		for(int i = 0; i < tab.length; i++) {
			System.out.println("Element à la position " + i + " : " + tab[i]);
			//tab[i] = 500;
			
		}
		
		System.out.println(tab[0]);
		
		//Boucle Foreach
		System.out.println("\nBoucle Foreach : Iteration sur un ensemble de valeur");
		for(int item : tab) {
			System.out.println(item);
			//item = 780;
		}
		
		System.out.println(tab[0]);
		
		
		/*
		 * Conclusion : 
		 * Pour modifier une valeur dans le tableau, utiliser l'iteration classique
		 */

	}

}
