package fr.dawan.javaPOO.tp_concept_objet;

public class TechnARisque extends Technicien{

	public TechnARisque() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TechnARisque(String nom, String prenom, int age, String date, int nbreUniteProduit) {
		super(nom, prenom, age, date, nbreUniteProduit);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calculerSalaire() {
		return super.calculerSalaire() + ARisque.PRIME;
	}

}
