package fr.dawan.javaPOO.polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		ArrayList<Forme> formes = new ArrayList<>();

		/*
		 * Manipuler des objets sans ce soucier de leur type 
		 * indice 0 : forme = new Cercle(2)
		 * indice 1 : forme = new Rectangle(6, 3)
		 * indice 2 : forme = new Rectangle(6, 3)
		 * indice 3 : forme = new Triangle(5, 10)
		 * 
		 */
		formes.add(new Cercle(2));
		formes.add(new Rectangle(5, 7));
		formes.add(new Rectangle(6, 3));
		formes.add(new Triangle(5, 10));

		
		for (Forme forme : formes) {
			System.out.println(forme.aire());
		}
		
		
		Forme forme = new Rectangle(10, 7);
		
		List<Forme> lstForme = new ArrayList<>();

	}

}
