package fr.istic.foucaultbertier.aco.commandes;

import fr.istic.foucaultbertier.aco.Enregistreur;

/**
 * Cette commande est chargée d'ordonner à l'enregistreur de commande d'arrêter d'enregistrer les commandes qui lui sont destinées
 * @see Enregistreur
 */
public class Arreter implements Commande {

	private Enregistreur enregistreur;
	
	/**
	 * Crée la commande
	 * @param enregistreur L'enregistreur à qui adresser la commande (non null)
	 */
	public Arreter(Enregistreur enregistreur){
		
		if(enregistreur == null){
			
			throw new IllegalArgumentException("enregistreur est à null");
		}
		
		this.enregistreur = enregistreur;
	}

	/**
	 * Ordonne à l'enregistreur d'arrêter d'enregistrer les commandes qui lui sont adressées
	 */
	@Override
	public void executer() {
		
		enregistreur.desactiver();
	}
}