package Vuecours;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ControlerVersCours.ContinuerVersCours;
import Vue.Vue;
import anglais.Modele;

public class VueCoursPassé2  extends JPanel implements Vue{

	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 14);
	
	public VueCoursPassé2(Modele m){
		this.m = m;
		
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		
		cours2.setText("LE PRESENT PERFECT\n\n"
				+ "EMPLOIS\n"
				+ "a) Action qui a commencé dans le passé et qui se poursuit dans le présent; b) action dont on fait le bilan\n"
				+ "CONJUGAISON\n"
				+ "Forme affirmative\n"
				+ "auxiliaire HAVE (HAS à la 3e personne du singulier) + participe passé\n"
				+ "Ex: a) I have lived in Paris since 1992.\n"
				+ "b) Sarah has eaten all the cakes. (There is no cake left).\n"
				+ "Formes interrogative et négative: pour les questions, on fait simplement l'inversion et le changement de pronom\n"
				+ "Ex: Have you broken my vase?\n"
				+ "-> Yes, I have. / No, I haven't (broken the vase).\n\n"
				+ "LE PLUS-QUE-PARFAIT (plu/past-perfect)\n\n"
				+ "EMPLOI\n"
				+ "Action qui s'est déroulée avant une autre action passée\n"
				+ "CONJUGAISON\n"
				+ "Forme affirmative\n"
				+ "auxiliaire HAD + participe passé\n"
				+ "Ex: Peter went to Sydney in 2002. I had been there two years before. \n"
				+ "Formes interrogative et négative: pour les questions, on fait simplement l'inversion et le changement de pronom\n"
				+ "Ex: Had you bought a car?\n"
				+ "-> Yes, I had. / No, I hadn't (bought a car).\n"
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
			
				
				
				
				);
		
		cours2.setBounds(120, 20, 800, 800);
		cours2.setBackground(null);
		cours2.setFont(f2);
		
	}
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
	
}
