package fr.dawan.baseJava.syntaxe_de_base.io_standard;

import java.util.Scanner;


public class ClasseScanner {

	public static void main(String[] args) {
		
		//objet = new + constructeur
		Scanner input = new Scanner(System.in);
		int n = 0; 
		double var1 = 0.0;
		
		//1: Entrer un nombre entier : 
		//2: Utilisateur entre le nombre  (2)
		//3: Le carré de 2 est 4
		System.out.print("Entrer un nombre entier: ");
		n = input.nextInt();  //nexInt() est une méthode d'instance ==> Instance.methode donc inpout.nextInt()
		System.out.printf("Le carré %d est %d%n", n, (n*n));
		
		
		//1: Entrer un nombre double (réel) : 
		//2: Utilisateur entre le nombre  (5.5)
		//3: Le carré de 5.5 est 30.25
		System.out.print("Entrer un nombre double: ");
		var1 = input.nextDouble();
		System.out.printf("Le carré de %.2f est %.2f", var1, (var1*var1));
	}

}
