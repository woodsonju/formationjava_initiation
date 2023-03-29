package fr.dawan.javaPOO.interface_.dao;

import java.util.List;

import fr.dawan.javaPOO.interface_.model.Product;

public class ProductBDDImpl implements ProductDAO{

	@Override
	public void addProduct(Product p) {
		//SQL - Requête d'insertion
		
	}

	@Override
	public void deleteProductById(Product p) {
		//SQL - requête de suppression
	}

	@Override
	public void updateProduct(Product p) {
		// SQL- requête de mise à jour
		
	}

	@Override
	public List<Product> findAll() {
		// SQL - requête de selection
		return null;
	}

}
