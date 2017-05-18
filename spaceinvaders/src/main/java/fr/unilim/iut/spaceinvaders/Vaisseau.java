/**
 * 
 */
package fr.unilim.iut.spaceinvaders;

/**
 * @author doria
 *
 */
public class Vaisseau {

	int x;
	int y;
	int longueur;
	int hauteur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur = longueur;
		this.hauteur = hauteur;
		this.x = x;
		this.y = y;
	}

	public boolean occupeLaPosition(int x, int y) {
		if (estAbscisseCouverte(x))
			if (estOrdonneeCouverte(y))
				return true;

		return false;
	}

	public boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse() <= y) && (y <= ordonneeLaPlusHaute());
	}

	public int ordonneeLaPlusHaute() {
		return this.y;
	}

	public int ordonneeLaPlusBasse() {
		return ordonneeLaPlusHaute() - this.hauteur + 1;
	}

	public boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	}

	public int abscisseLaPlusADroite() {
		return this.x + this.longueur - 1;
	}

	public void seDeplacerVersLaDroite() {
		// TODO Auto-generated method stub
		this.x = this.x + 1;
	}

	public int abscisseLaPlusAGauche() {
		// TODO Auto-generated method stub
		return x;
	}

	public void seDeplacerVersLaGauche() {
		// TODO Auto-generated method stub
		this.x = this.x - 1;
	}

	public void positionner(int x, int y) {
		this.x = x;
		this.y = y;
	}

}