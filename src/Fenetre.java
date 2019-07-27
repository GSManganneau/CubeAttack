


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Fenetre extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
	public Fenetre() {
		// TODO Auto-generated constructor stub
	   this.setTitle("Conquête Spatiale");   
	   this.setSize(1000, 500);   
	   this.setLocationRelativeTo(null);    
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  
	   this.setResizable(true); 
	   this.setBackground(Color.black);
	   this.setAlwaysOnTop(true);
	   this.setUndecorated(false);
	   Decor decor = new Decor();
	   this.setContentPane(decor);
	   this.setVisible(true);
	}


}
