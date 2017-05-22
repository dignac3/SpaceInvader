import fr.unilim.iut.spaceinvaders.DessinSpaceInvaders;
import fr.unilim.iut.spaceinvaders.SpaceInvaders;
import moteurjeu.MoteurGraphique;

/**
 * 
 */

/**
 * @author iut
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// creation du jeu particulier et de son afficheur
				SpaceInvaders jeu = new SpaceInvaders(10,10);
				DessinSpaceInvaders aff = new DessinSpaceInvaders(jeu);

				// classe qui lance le moteur de jeu generique
				MoteurGraphique moteur = new MoteurGraphique(jeu, aff);
				moteur.lancerJeu(400,400);

	}

}
