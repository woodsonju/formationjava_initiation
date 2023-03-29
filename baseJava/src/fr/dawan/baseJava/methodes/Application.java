package fr.dawan.baseJava.methodes;


/*
 * Méthode : Un ensemble d'instruction réutilisable  ---- Eviter de repeter du code 
 * Déclarer une méthode : 
 * Visiblité [mot-clé] type-retour  nom-méthode(param) {instructions}
 * 
 */
public class Application {

	
	public static void main(String[] args) {
		
		double[] tab = {11.5, 8.3, 17, 16.5};
		
		afficher();
		
		afficher(tab);
		
		System.out.println(somme(tab)); 
		
		System.out.println("minTab = " + minTab(tab));

	}
	
	
	/**
	 * Méthode afficher 
	 * void : si acune valeur n'est retounée on utilise le pseudo-type void
	 */
	public static void afficher() {
		System.out.println("Méthode afficher");
	}
	
	/**
	 * Affiche les élements d'un tableau
	 * @param tab
	 */
	public static void afficher(double[] tab) {
		for(double item: tab) {
			System.out.println(item + " ");
		}
	}
	
	
	/**
	 * Méthode prenant deux paramètre double et retourne un double
	 * @param a
	 * @param b
	 * @return
	 */
	public static double somme(double a, double b) {
		return a + b;
	}
	
	
	//Méthode qui renvoie la somme des éléments d'un tableau 
	public static double somme(double[] tab) {
		double somme = 0.0;
		for (double item : tab) {
			somme += item;
		}
		return somme;
	}
	
	
	//Méthode qui renvoie la moyenne des éléments d'un tableau
	public static double moyenne(double[] tab) {
		double sum = somme(tab);
		return sum/tab.length;
	}
	
	
	
	//Méthode qui renvoie l'élément le plus petit d'une tableau 
	//{11.5, 8.3, 17, 16.5, 5};
	//min = 11.5 
	//item = 8.3    ==> min = item (8.3)
	//item = 17   ==> min = 8.3 
	//item = 16.5   ==> min = 8.3
	public static double minTab(double[] tab) {
		double min = tab[0];
		for (double item : tab) {
			if(item < min) {
				min = item;
			}
		}
		
		return min;
	}

}
