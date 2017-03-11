package anglais;

import javax.swing.JFrame;

import Vue.VueDaccueil;

public class Fenetre extends JFrame {
	
	Modele m;
	
	public Fenetre(Modele m){
		
		this.m = m;
		this.setTitle("nom appli");
		this.setSize(1280, 740);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    VueDaccueil v = new VueDaccueil(m);
	    this.setContentPane(v);
	    this.setVisible(true);
	    
	}
	
	
}
