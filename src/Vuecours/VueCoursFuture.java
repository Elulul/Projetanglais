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

public class VueCoursFuture extends JPanel implements Vue{

	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 14);
	
	public VueCoursFuture(Modele m){
		this.m = m;
		
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		
		cours2.setText("CE PRESENT FRAN�AIS QUI DEVIENT FUTUR EN ANGLAIS \n"
				+ "Lorsque le fran�ais se r�f�re � des intentions ou attitudes envers autrui, on emploie will ou shall en anglais. \n "
				+ "1/ WILL ou 'LL \n "
				+ "Pour exprimer une menace ou une promesse.\n\n"
				+ "If you say that again you'll be fired.\n"
				+ "Si vous dites � nouveau ceci  vous serez renvoy�.\n\n"
				+ "I'll write to you tomorrow.\n"
				+ "Je t'�crirai demain.\n\n"
				+ " Pour parler d'une action que l'on d�cide sur le moment.\n "
				+ "(Pour les autres actions on emploie un temps pr�sent ou to be going to).\n"
				+ "La cloche sonne -> I'll stand up -> je me l�ve.\n\n"
				+ "2/ WILL YOU ...?\n"
				+ "Will you buy me some bread? -> Tu m'ach�tes du pain?\n"
				+ "Will you marry me?  / Yes, I will. -> Veux-tu m'�pouser? / Oui (je le veux).\n"
				+ "3/ SHALL + pronom personnel ...?\n\n"
				+ "Lorsque l'on se demande, ou qu'on demande � quelqu'un d'autre, ce que l'on doit faire.\n"
				+ "What shall I do now? -> Qu'est-ce que je dois faire maintenant ?\n\n"
				+ "Ou pour proposer son aide ou faire une suggestion.\n"
				+ "Shall I help you? -> Je t'aide?\n"
				+ "Shall we go? -> On y va?\n"
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
