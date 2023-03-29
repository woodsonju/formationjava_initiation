package fr.dawan.javaPOO.tp_concept_objet;

public class ManutARisque extends Manutentionnaire{
	
	public ManutARisque() {
		// TODO Auto-generated constructor stub
	}

	public ManutARisque(String nom, String prenom, int age, String date, int nbreHeure) {
		super(nom, prenom, age, date, nbreHeure);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		return super.calculerSalaire() + ARisque.PRIME;
	}
}
