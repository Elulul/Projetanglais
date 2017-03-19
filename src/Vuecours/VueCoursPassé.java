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

public class VueCoursPassé extends JPanel implements Vue{
	
	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 14);
	
	public VueCoursPassé(Modele m){
		this.m = m;
		
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		
		cours2.setText("LE PRETERIT SIMPLE \n\n"
				+ "EMPLOI\n"
				+ "Action passée, terminée, datée soit par le contexte, soit par un marqueur de temps\n"
				+ "CONJUGAISON\n"
				+ "Forme affirmative\n"
				+ "-> Verbes réguliers: base verbale + -ED\n"
				+ "Ex: Yesterday, I played football.\n"
				+ "-> Verbes irréguliers: à apprendre par coeur\n"
				+ "Ex: In 1998, I went to Australia.\n"
				+ "Formes interrogative et négative: on utilise DID\n"
				+ "Ex: -> Did you go to Australia?\n"
				+ "-> Yes, I did. No, I didn't (go to Australia).\n\n"
				+ "LE PRETERIT EN BE + -ING\n\n"
				+ "EMPLOI\n"
				+ "Action qui était en cours dans le passé et qui a été interrompue par une autre action\n"
				+ "CONJUGAISON\n"
				+ "Forme affirmative\n"
				+ "auxiliaire BE conjugué au prétérit (WAS/WERE) + verbe en -ING\n"
				+ "Ex: I was taking a shower when the phone rang.\n"
				+ "Formes interrogative et négative: pour les questions, on fait simplement l'inversion et le changement de pronom\n"
				+ "Ex: Were you listening to the radio when he arrived?\n"
				+ ""
				+ "-> Yes, I was. / No, I wasn't (listening to the radio).\n\n"
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
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "");
		
		
		cours2.setBounds(120, 20, 800, 800);
		cours2.setBackground(null);
		cours2.setFont(f2);
		
	}
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}

}
