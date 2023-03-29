package fr.dawan.javaPOO.object_;

import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		CompteBancaire cb1 = new CompteBancaire("Pat", "aa255hghg", 200000);
		System.out.println(cb1); //Idem : System.out.println(cb1.toString());
		
		
		CompteBancaire cb2 = new CompteBancaire("Guy", "5454dfdffd", 800000);
		CompteBancaire cb3 = new CompteBancaire("Guy", "5454dfdffd", 800000);
		
		//Pour les types complexes, l opérateur == entre les objets compare l'adresse (reference)
		System.out.println("L'utilisation de l'operateur == " + (cb2 == cb3)); //false 

		
		System.out.println(cb2.equals(cb3));
		
		System.out.println(cb2.hashCode());
		System.out.println(cb3.hashCode());
		
		
		Set<CompteBancaire> compteBancaires = new HashSet<>();
		compteBancaires.add(cb2);
		compteBancaires.add(cb3);
		System.out.println(compteBancaires.size());
		
	
		

	}

}
