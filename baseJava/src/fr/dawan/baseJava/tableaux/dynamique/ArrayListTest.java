package fr.dawan.baseJava.tableaux.dynamique;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// objet/instance : new + constructeur 
		ArrayList<Integer> tab1 = new ArrayList<>();
		
			
		tab1.add(20);  //i = 0
		tab1.add(30);  // i = 1
		
		System.out.println(tab1.get(0));
		
		tab1.set(0, 60);
		
		System.out.println("Premier elt du tab : " + tab1.get(0));
		
		
		System.out.println("taille du tableau : " + tab1.size());
		
		System.out.println();
		
		
		tab1.add(67);
		

		//[60, 30, 67]
		for(int item: tab1) {
			System.out.print(item + " ");
		}
		
		System.out.println();

		
		tab1.remove(1); 
		
		
		for(int item: tab1) {
			System.out.print(item + " ");
		}
		
		
		if(tab1.contains(60)) {
			System.out.println("\n\nL'élément 60 est présent dans mon tableau");
		} else {
			System.out.println("\n\nL'élément 60 n'est pas présent dans mon tableau");
		}
	}

}
