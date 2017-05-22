package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.utils.HorsEspaceJeuException;
import moteurjeu.Commande;
import moteurjeu.Jeu;

public class SpaceInvaders implements Jeu{

	private static final char MARQUE_VIDE = '.';
	private static final char MARQUE_VAISEEAU = 'V';
	int longueur;
	int hauteur;
	Vaisseau vaisseau;

	public SpaceInvaders(int longueur, int hauteur) {
		this.longueur = longueur;
		this.hauteur = hauteur;
	}

public void positionnerUnNouveauVaisseau(int x, int y) {
		
		if (!estDansEspaceJeu(x, y))
			throw new HorsEspaceJeuException("Vous êtes en dehors de l'espace jeu");
		
		vaisseau = new Vaisseau(x, y); 


	}


public Vaisseau getVaisseau() {
	return vaisseau;
}

public boolean estDansEspaceJeu(int x, int y) {
	return (x >= 0) && (x < longueur) && (y >= 0) && (y < hauteur);
}

	@Override
	public String toString() {
		return recupererEspaceJeuDansChaineASCII();
	}

	public String recupererEspaceJeuDansChaineASCII() {
		StringBuilder espaceDeJeu = new StringBuilder();

		for (int y = 0; y < hauteur; y++) {
			for (int x = 0; x < longueur; x++) {
				espaceDeJeu.append(recupererMarqueDeLaPosition(x, y));
			}
			espaceDeJeu.append("\n");
		}

		return espaceDeJeu.toString();
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	public char recupererMarqueDeLaPosition(int x, int y) {
		char marque;

		if (this.aUnVaisseauQuiOccupeLaPosition(x, y))
			marque = MARQUE_VAISEEAU;
		else
			marque = MARQUE_VIDE;
		return marque;
	}

	private boolean aUnVaisseauQuiOccupeLaPosition(int x, int y) {

		return this.aUnVaisseau() && vaisseau.occupeLaPosition(x, y);

	}

	/**
	 * @return
	 */
	public boolean aUnVaisseau() {
		return vaisseau != null;
	}

	public void deplacerVaisseauVersLaDroite() {
		   if (vaisseau.abscisse()< (longueur-1)) vaisseau.seDeplacerVersLaDroite();
	    }

	public void deplacerVaisseauVersLaGauche() {
		if (vaisseau.abscisse()> 0) vaisseau.seDeplacerVersLaGauche();
	}

	@Override
	public void evoluer(Commande commande) {
		// TODO Auto-generated method stub
		this.getVaisseau().deplacer(commande);
	}

	@Override
	public boolean etreFini() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
