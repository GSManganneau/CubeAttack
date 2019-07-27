/*import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Vaisseau  {

	// Attributs

	/**
	 * 
	 */
	/*private static final long serialVersionUID = 1L;

	private int energieVital;

	private String couleur;

	public int x = 50;
	public int y = 250;
	public int dx, dy;
	public int collision = 0;
	

	private Image vaisseau;

	// __________ Affiche les différents mouvements du vaisseau_________
	public void avance(Graphics g) {
		try {
			Image img = ImageIO.read(new File("resources/avance.PNG"));
			g.drawImage(img, x, y, new Decor());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void monte(Graphics g) {
		try {
			Image img = ImageIO.read(new File("resources/monte.PNG"));
			g.drawImage(img, x, y, new Decor());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void basDroite(Graphics g) {
		try {
			Image img = ImageIO.read(new File("resources/basDroite.PNG"));
			g.drawImage(img, x, y, new Decor());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void surPlace(Graphics g) {
		try {
			Image img = ImageIO.read(new File("resources/surPlace.PNG"));
			g.drawImage(img, x, y, new Decor());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void bas(Graphics g) {
		try {
			Image img = ImageIO.read(new File("resources/bas.PNG"));
			g.drawImage(img, x, y, new Decor());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void gauche(Graphics g) {
		try {
			Image img = ImageIO.read(new File("resources/gauche.PNG"));
			g.drawImage(img, x, y, new Decor());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void hautDroite(Graphics g) {
		try {
			Image img = ImageIO.read(new File("resources/hautDroite.PNG"));
			g.drawImage(img, x, y, new Decor());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void hautGauche(Graphics g) {
		try {
			Image img = ImageIO.read(new File("resources/hautGauche.PNG"));
			g.drawImage(img, x, y, new Decor());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void etat(Graphics g) {
		if (dx > 0 && dy < 0) {
			hautDroite(g);
		} else if (dx > 0 && dy > 0) {
			basDroite(g);
		} else if (dx < 0 && dy < 0) {
			monte(g);
		} else if (dx < 0 && dy > 0) {
			bas(g);
		} else if (dx == 0 && dy == 0) {
			surPlace(g);
		} else if (dx > 0)
			avance(g);
		else if (dy > 0) {
			bas(g);
		} else if (dx < 0) {
			gauche(g);
		} else if (dy < 0) {
			monte(g);
		}
	}

	public Vaisseau(Graphics g) {

		avance(g);

	}

	// Accesseurs

	public int getVie() {

		return energieVital;

	}

	public void setVie(int v) {

		energieVital = v;

	}

	public void setX(int v) {

		x = v;

	}

	public int getX() {

		return x;

	}

	public int getY() {

		return y;

	}

	public Image getImage() {

		return vaisseau;

	}

	// Methodes

	public void deplacement() {
		if (x <= 0 && dx < 0) {

		} else if (x >= 850 && dx > 0) {

		} else {
			x = x + dx;
		}
		if (y <= 0 && dy < 0) {

		} else if (y >= 500 && dy > 0) {

		} else {
			y = y + dy;
		}

	}

	public String toString() {

		return "Unite d'energie vital = " + energieVital;

	}

	public void toucheTap(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_Q) {

			dx = -3;

		}

		if (key == KeyEvent.VK_D) {

			dx = 3;

		}

		if (key == KeyEvent.VK_S) {

			dy = 3;

		}

		if (key == KeyEvent.VK_Z) {

			dy = -3;

		}

	}

	public void toucheAppuyer(KeyEvent e) {

		int key = e.getKeyCode();
		if (key == KeyEvent.VK_Q) {

			dx = -3;

		}

		if (key == KeyEvent.VK_D) {

			dx = 3;

		}

		if (key == KeyEvent.VK_S) {

			dy = 3;

		}

		if (key == KeyEvent.VK_Z) {

			dy = -3;

		}

	}

	public void toucheLacher(KeyEvent e) {

		int key = e.getKeyCode();
		if (key == KeyEvent.VK_Q) {

			dx = 0;

		}

		if (key == KeyEvent.VK_D) {

			dx = 0;

		}

		if (key == KeyEvent.VK_S) {

			dy = 0;

		}

		if (key == KeyEvent.VK_Z) {

			dy = 0;

		}

	}
	

		public void keyTyped(KeyEvent e) {
			this.toucheTap(e);
			this.deplacement();
		}

		public void keyPressed(KeyEvent e) {

			this.toucheAppuyer(e);
		        this.deplacement();
		}

		public void keyReleased(KeyEvent e) {

			this.keyReleased(e);
			this.deplacement();
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	
	
	}

*/