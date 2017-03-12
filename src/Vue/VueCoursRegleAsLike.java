package Vue;

import javax.swing.JPanel;

import anglais.Modele;

public class VueCoursRegleAsLike extends JPanel implements Vue{

	Modele m;
	
	public VueCoursRegleAsLike(Modele m){
		this.m = m;
	}
	
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
