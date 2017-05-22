/**
 * 
 */
package fr.unilim.iut.spaceinvaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import moteurjeu.Commande;
import moteurjeu.DessinJeu;


/**
 * @author iut
 *
 */
public class DessinSpaceInvaders implements DessinJeu {
	/**
	 * constante pour gerer la taille des cases
	 */
	private static int TAILLE_CASE = 25;

	/**
	 * lien vers le jeu a afficher
	 */
	private SpaceInvaders jeu;

	/**
	 * appelle constructeur parent
	 * 
	 * @param j
	 *            le jeutest a afficher
	 */
	public DessinSpaceInvaders(SpaceInvaders j) {
		this.jeu = j;
	}

	/**
	 * dessiner un objet consiste a dessiner sur l'image suivante methode
	 * redefinie de Afficheur
	 */
	private void dessinerObjet(String s, int x, int y, BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		switch (s) {
		case "V":
			crayon.setColor(Color.blue);
			crayon.fillRect(x * TAILLE_CASE, y * TAILLE_CASE, TAILLE_CASE,
					TAILLE_CASE);
			break;
		case "MUR":
			crayon.setColor(Color.gray);
			crayon.fillRect(x * TAILLE_CASE, y * TAILLE_CASE, TAILLE_CASE,
					TAILLE_CASE);
			break;
		default:
			throw new AssertionError("objet inexistant");
		}
	
	}

	public void dessiner(BufferedImage image) {
		// no sait que c'est un jeuTest
				SpaceInvaders j = (SpaceInvaders) jeu;
				
				this.dessinerObjet("V", 0, 0, image);
		
	}

}
