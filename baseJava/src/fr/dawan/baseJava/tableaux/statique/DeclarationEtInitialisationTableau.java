package fr.dawan.baseJava.tableaux.statique;

public class DeclarationEtInitialisationTableau {

	public static void main(String[] args) {
		
		//1- Si on connait les différents éléments du tableau
		int[] tab1 = {12, 38, 4, 98, 78};  
		
		//Un tableau commence à l'indice 0
		
		System.out.println(tab1[0]);
		System.out.println(tab1[0] + tab1[2]);
		
		//2-Si on connait la taille du tableau 
		int[] tab2 = new int[4];  
		//System.out.println(tab2[1]);
		tab2[0] = 30;
		tab2[1]= 14;
		

	}

}
