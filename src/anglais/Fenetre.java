package anglais;

import javax.swing.JFrame;

import Vue.VueDaccueil;

public class Fenetre extends JFrame {
	Modele m;
	
	public Fenetre(){
		
		this.setTitle("LearNglish");
		this.setSize(1280, 740);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.m = new Modele(this);
	    
	    VueDaccueil v = new VueDaccueil(m);

	    
	    this.setContentPane(v);
	    this.setVisible(true);
	    
	}
	
	
}
