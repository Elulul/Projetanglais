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

public class VueCoursAuxiliaireBe extends JPanel implements Vue {

	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 14);
	
	public VueCoursAuxiliaireBe(Modele m){
		this.m = m;
		
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		
		cours2.setText("Auxiliaire BE - cours \n \n"
				+ "L'auxiliaire be \n"
				+ "L'auxiliaire BE, comme les auxiliaires 'have' et 'do' permet de conjuguer les verbes, et il peut être \n"
				+ "contracté. \n"
				+ "Ce sont les auxiliaires qui portent la négation et se déplacent dans les questions. \n"
				+ "Ils sont souvent associés à un verbe lexical. \n \n \n"
				+ "A/ Emplois de l'auxiliaire BE : \n "
				+ "Il a trois emplois principaux : \n"
				+ "1) Il permet de construire une phrase simple : \n"
				+ "I am happy. / Je suis content. \n "
				+ "She is 16. / Elle a 16 ans. \n \n"
				+ "2)  Il s'utilise pour conjuguer les verbes lexicaux à la forme continue, aussi appelée forme progressive ou \n"
				+ "encore forme en BE + ING. \n"
				+ "On le trouve donc conjugué au :\n"
				+ "- présent en BE + -ING \n"
				+ "- prétérit en BE + -ING \n "
				+ "- present perfect en BE + -ING \n"
				+"- past perfect en BE + -ING \n");
			



















				
		cours2.setBounds(120, 20, 800, 800);
		cours2.setBackground(null);
		cours2.setFont(f2);
		
	}
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
	
}
