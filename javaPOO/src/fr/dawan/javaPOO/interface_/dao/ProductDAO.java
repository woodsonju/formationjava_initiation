package fr.dawan.javaPOO.interface_.dao;

import java.util.List;

import fr.dawan.javaPOO.interface_.model.Product;

public interface ProductDAO {
	
	//Lister l'ensemble des fonctionnalités du client sous forme de méthode 
	void addProduct(Product p);
	void deleteProductById(Product p);
	void updateProduct(Product p);
	List<Product> findAll();

}
