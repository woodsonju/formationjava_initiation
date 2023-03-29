package fr.dawan.javaPOO.interface_.presentation;

import fr.dawan.javaPOO.interface_.dao.ProductBDDImpl;
import fr.dawan.javaPOO.interface_.dao.ProductDAO;
import fr.dawan.javaPOO.interface_.dao.ProductFileImpl;
import fr.dawan.javaPOO.interface_.model.Product;

public class Application {

	public static void main(String[] args) {
		
		ProductDAO dao = new ProductBDDImpl();
		
		dao.addProduct(new Product());
		
	}
	
}
