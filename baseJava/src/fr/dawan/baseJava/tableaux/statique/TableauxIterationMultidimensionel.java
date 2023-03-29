package fr.dawan.baseJava.tableaux.statique;

public class TableauxIterationMultidimensionel {

	public static void main(String[] args) {
		int[][] scores = {
				{5, 25, 72, 16, 38},       //ligne 1  (indice 0)
				{90, 7, 30}, 				//ligne 2 (indice 1)
				{37, 87, 2, 52}           //ligne 3  (indice 2)
			}; 
		
		//System.out.println(scores.length);
		//Premiere boucle for parcours les lignes 
		for(int i = 0, nbRows = scores.length; i < nbRows; i++) {
			//Deuxième boucle for parcours les colonnes de la ligne en cours 
			for(int j = 0, nbColumns=scores[i].length; j < nbColumns; j++) {
				System.out.print(scores[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		

	}

}
