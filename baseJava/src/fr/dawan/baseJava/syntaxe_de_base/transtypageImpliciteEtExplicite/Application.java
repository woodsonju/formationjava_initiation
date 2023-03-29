package fr.dawan.baseJava.syntaxe_de_base.transtypageImpliciteEtExplicite;

public class Application {

	public static void main(String[] args) {

		// Transtypage implicite : Concerne le passage d'un type inferieur vers un type
		// superieur
		int i = 42; // 4o 
		double d = i; // 8o

		// Transtypage explicite : Passage d'un type superieur vers un type inferieur,
		// cela impliquer de faire un CAST
		int i1 = 123; //4o
		short s = (short) i1; //2o 
		
		
		//CAST : Concerne les conversions de type compatible
		String str = "11";
		//int i2 = str;
		
		//perte de données en utilisant le CAST
		int i3 = 130;
		byte b = (byte) i3;   //[-128, 127] 
		System.out.println(b);

	}

}
