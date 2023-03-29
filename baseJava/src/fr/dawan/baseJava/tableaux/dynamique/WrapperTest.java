package fr.dawan.baseJava.tableaux.dynamique;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> listElmt = new ArrayList<>();
		
		//Parser une chaine de caractère en entier 
		String nbre1 = "20";
		String nbre2 = "30";
		int somme = 0; 
		
		int n1 = Integer.parseInt(nbre1);
		Integer n2 = Integer.valueOf(nbre2);
		
		somme = n1 + n2;
		
		System.out.println(somme);
		
		//auto-boxing : Convertir les types données primitifs en leur objet de classe wrapper
		int a1 = 56; 
		Integer i1 = a1;
		//Utilisation de l'auto-boxing 
		listElmt.add(a1);
		
		//Unboxing : Convertir l'objt de la classe wrapper vers son type primitif 
		Integer i2 = 45; 
		int a2 = i2;
		//Utilisation de l'unboxing 
		int a3 = listElmt.get(0);
		

	}

}
