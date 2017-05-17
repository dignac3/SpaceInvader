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

	public Vaisseau(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean occupeLaPosition(int x, int y) {
		return (this.x == x) && (this.y == y);
	}
	
	public void seDeplacerVersLaDroite() {
		// TODO Auto-generated method stub
		 this.x = this.x + 1 ;
	}

	public int abscisse() {
		// TODO Auto-generated method stub
		return x;
	}

	public void seDeplacerVersLaGauche() {
		// TODO Auto-generated method stub
		this.x = this.x - 1 ;
	}

}