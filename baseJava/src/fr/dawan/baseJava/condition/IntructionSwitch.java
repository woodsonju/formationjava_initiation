package fr.dawan.baseJava.condition;

import java.util.Scanner;

public class IntructionSwitch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int jours = 1;
		
		System.out.println("Saisir le numero du jour : ");
		
		jours = input.nextInt(); //7
		
		//Solution 1: Bloc Else-IF 
//		if(jours == 1) {
//			System.out.println("Lundi");
//		}else if (jours == 2) {
//			System.out.println("Mardi");
//		} else if (jours == 3) {
//			System.out.println("Mercredi");
//		} else if(jours == 4) {
//			System.out.println("Jeudi");
//		}else if(jours == 5) {
//			System.out.println("Vendredi");
//		}else if(jours == 6) {
//			System.out.println("Samedi");
//		}else if(jours == 7) {
//			System.out.println("Dimanche");
//		} else {
//			System.out.println("Entrée invalide :  veuillez saisir le numéro du jours entre 1 et 7" );
//		}
		
		
		//Solution 2 : Intruction Switch
		//C'est une variante du If-Else 
		switch(jours) {
			case 1:
				System.out.print("Lundi");
				break;
			case 2 : 
				System.out.print("Mardi");
				break;
			case 3 : 
				System.out.print("Mercredi");
				break;
			case 4 : 
				System.out.print("Jeudi");
				break;
			case 5 : 
				System.out.print("Vendredi");
				break;
			case 6 : 
				System.out.print("Samedi");
				break;
			case 7 : 
				System.out.print("Dimanche");
				break;
			default: 
				System.out.println("Entrée invalide :  veuillez saisir le numéro du jours entre 1 et 7" );
		}

	}

}
