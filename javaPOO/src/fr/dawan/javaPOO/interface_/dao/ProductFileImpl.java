package fr.dawan.javaPOO.interface_.dao;

import java.util.List;

import fr.dawan.javaPOO.interface_.model.Product;

public class ProductFileImpl implements ProductDAO{

	@Override
	public void addProduct(Product p) {
		//Ajouter un produit dans un fichier
	}

	@Override
	public void deleteProductById(Product p) {
		//Supprimer un produit dans un fichier
	}

	@Override
	public void updateProduct(Product p) {
		//Mettre à jour un produit dans un fichier
	}

	@Override
	public List<Product> findAll() {
		//Lister les produits dans un fichier
		return null;
	}

}
