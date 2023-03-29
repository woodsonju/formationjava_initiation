package fr.dawan.baseJava.condition;

import java.util.Scanner;

public class BlocIfElse {

	public static void main(String[] args) {
		

		/*
		 * Expression d'un test conditionnel 
		 * Si (condition est vraie) 
		 * 		instructions 
		 * Sinon 
		 * 	 d'autre instructions
		 * 
		 * Le bloc If (quand la condition est vraie) 
		 * Le bloc Else (traite tous les autres cas : quand la condition est fausse)
		 * 
		 * Le bloc Else-If (traite un cas)
		 */
		Scanner input = new Scanner(System.in);
		int nombre = 0;
		
		
		System.out.print("Entrer un nombre svp : ");
		nombre =  input.nextInt();
		
		if(nombre > 0) {
			System.out.println("Le nombre est positif");
		} else if(nombre == 0) {
			System.out.println("Le nombre est  égal à 0");
		} else if(nombre * nombre == 25) {
			System.out.println("Le nombre rentré est égal à " + nombre);
		}
		else {  //< et == 
			System.out.println("Le nombre est négatif");
		}
		

	}

}
