package Vuecours;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import ControlerVersCours.ContinuerVersCours;
import Vue.Vue;
import anglais.Modele;

public class VueCoursRegleAsLike extends JPanel implements Vue{

	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	
	public VueCoursRegleAsLike(Modele m){
		this.m = m;
		this.add(retour);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
	}
	
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
