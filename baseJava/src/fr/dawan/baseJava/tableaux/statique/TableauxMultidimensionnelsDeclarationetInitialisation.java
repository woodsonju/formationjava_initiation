package fr.dawan.baseJava.tableaux.statique;

public class TableauxMultidimensionnelsDeclarationetInitialisation {

	public static void main(String[] args) {
		
		/*
		 * joueur1 [10, 20, 30]      			---- ligne 1 (indice 0)
		 * joueur2 [80, 40, 45]                 ---- ligne 1 (indice 1)
		 */
		
		//Si on connait le nombre d'élément
		int[][] scores1 = {{10, 20, 30}, {80, 40, 45}};    
		
		
		//Si on connait la taille du tableau
		int[][] scores2 = new int[2][3];
		
		
		System.out.println(scores1[0][1]);
		System.out.println(scores1[1][2]);
		
	}

}
