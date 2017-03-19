package anglais;

import javax.swing.JFrame;

import Vuecours.VueCours;

public class Fenetre extends JFrame {
	Modele m;
	
	public Fenetre(){
		
		this.setTitle("Bring home the madness");
		this.setSize(1280, 740);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    this.m = new Modele(this);
	    
	    //VueDaccueil v = new VueDaccueil(m);
	    VueCours v= new VueCours(m);
	    this.setContentPane(v);
	    this.setVisible(true);
	    
	}
	
	
}
