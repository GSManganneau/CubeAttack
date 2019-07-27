import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Decor extends JPanel implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double[][] temporaireHaut = new double[2][100];
	private double[][] temporaireBas = new double[2][100];
	public double[][] decorHaut = new double[2][100];
	public double[][] decorBas = new double[2][100];
	public double var1 = 250;
	Random rnd = new Random();
	int x = 0;
	private int depart = 1;
	public int temps = 0;
	public int vitesse = 100;

	private Color rouge = new Color(255, 0, 0);
	private Color bleue = new Color(0, 0, 255);
	private Color violet = new Color(255, 0, 255);
	private Color decor= new Color(68, 107, 108);
	public void setdepart(int x) {
		depart = x;
	}
	

	

	// ____________Mise en place du décor__________________

	public void paintComponent(Graphics g) {

		if (depart == 1) {
			createPointsDecor();
			afficherDecor(decorHaut, decorBas, g);
			//play = new Vaisseau(g);
			setdepart(0);
			scroll(decorHaut, temporaireHaut, decorBas, temporaireBas);
		}
		scroll(temporaireHaut, temporaireHaut, temporaireBas, temporaireBas);
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		afficherDecor(temporaireHaut, temporaireBas, g);
		try {
			Thread.sleep(vitesse);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		temps++;
		if (temps == 150) {
			temps = 0;
			vitesse = (int) (vitesse * 0.5);
			if (vitesse < 25) {
				vitesse = 100;
			}
		}
		System.out.println("vitesse=" + vitesse);
		//play.etat(g);
		this.repaint();
	}

	// ____________________________________Création aléatoire des hauteurs de
	// chaque rectangle servant d'obstacle__________________

	public void createPointsDecor() {
		decorHaut[1][0] = 0;
		decorBas[1][0] = 0;
		for (int j = 1; j <= 20; j++) {
			decorHaut[0][j] = 0;
			decorHaut[1][j] = decorHaut[1][j - 1] + 20;
			decorBas[0][j] = 500;
			decorBas[1][j] = decorBas[1][j - 1] + 20;
		}

		double var = 250;
		for (int j = 21; j <= 99; j++) {

			decorHaut[0][j] = var - 125;
			decorHaut[1][j] = decorHaut[1][j - 1] + 20;
			decorBas[0][j] = var + 125;
			decorBas[1][j] = decorBas[1][j - 1] + 20;
			int k = rnd.nextInt(2);
			int l = rnd.nextInt(5);
			if (var > 100 && var < 300) {
				if (k == 1) {
					var = var - l - 10;
				} else {
					var = var + l + 10;
				}
			} else if (var > 300) {
				var = var - 10;
			} else if (var <= 100) {
				var = var + 10;
			}

		}
	}

	// ___________________________________SCROLLING__________________________________

	public void scroll(double[][] tab, double[][] newtab, double[][] tab1,
			double[][] newtab1) {

		for (int j = 0; j <= 98; j++) {
			newtab[0][j] = tab[0][j + 1];
			newtab1[0][j] = tab1[0][j + 1];
			newtab[1][j] = tab[1][j];
			newtab1[1][j] = tab1[1][j];
		}
		int ale1 = rnd.nextInt(25);
		int ale2 = rnd.nextInt(25);
		newtab[0][99] = var1 - 125;
		newtab1[0][99] = var1 + 125;
		newtab[1][99] = tab[1][99];
		newtab1[1][99] = tab1[1][99];
		int k = rnd.nextInt(2);
		int l = rnd.nextInt(5);
		if (var1 > 100 && var1 <= 300) {
			if (k == 1) {
				var1 = var1 - l - 10;
			} else {
				var1 = var1 + l + 10;
			}
		} else if (var1 > 300) {
			var1 = var1 - 10;
		} else {
			var1 = var1 + 10;
		}

	}

	public void afficherDecor(double[][] tab, double[][] tab1, Graphics g) {

		g.setColor(Color.black);
		for (int j = 0; j <= 99; j++) {
			g.fillOval((int) tab[1][j], 0, 80, (int) tab[0][j]);
			g.fillOval((int) tab1[1][j], (int) tab1[0][j], 80,
					500 - (int) tab1[0][j]);
			if (vitesse == 100) {
				g.setColor(bleue);
			} else if (vitesse == 50) {
				g.setColor(violet);
			} else if (vitesse == 25) {
				g.setColor(rouge);
			}

			g.drawOval((int) tab[1][j], 0, 80, (int) tab[0][j]);
			g.drawOval((int) tab1[1][j], (int) tab1[0][j], 80,
					500 - (int) tab1[0][j]);
			g.setColor(Color.black);
		}
	}
	
	@Override
	public void run() {
		
	}
}
