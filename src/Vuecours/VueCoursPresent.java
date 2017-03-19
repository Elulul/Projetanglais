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

public class VueCoursPresent extends JPanel implements Vue {
	
	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 14);
	
	public VueCoursPresent(Modele m){
		this.m = m;
		
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		
		cours2.setText("Les deux principaux pr�sents en anglais\n\n\n\n\n"
				+ "Le pr�sent simple s'emploie pour parler de ce qui n'est pas limit� au contexte actuel: donc\n\n"
				+ "-des faits plus ou moins permanents\n\n"
				+ "-des actions qui se r�p�tent\n\n"
				+ "- des habitudes.\n\n"
				+ "Le pr�sent en BE+ING  s'emploie\n\n"
				+ "- dans un contexte temporaire / transitoire et en cours\n\n"
				+ "(que ce soit une situation de dur�e limit�e, une action ou une br�ve s�rie d'actions).\n\n\n"
				+ "Un exemple pour cerner la diff�rence entre les deux pr�sents:\n\n"
				+ "Water boils at 100�C => l'eau bout � 100�C  (C'est un fait permanent).\n\n	"
				+ "Maintenant imaginez que vous �tes dans votre cuisine en train de pr�parer du th�, l'eau se met � bouillir, tant mieux, c'est \n"
				+ "ce que vous attendiez, mais vous la retirez du feu pour pr�parer votre boisson. Ce n'est donc plus un fait permanent mais  \n"
				+ "temporaire. Vous direz:\n\n"
				+ "The water is boiling I'll make my tea. => L'eau bout, je vais faire mon th�.\n"
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
