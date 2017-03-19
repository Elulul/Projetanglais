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

public class VueCoursAnA extends JPanel implements Vue{

	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 14);
	
	public VueCoursAnA (Modele m){
		this.m = m;
		
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		
		cours2.setText("il faut utiliser l'article A devant un nom commençant par un son \"consonne\" et 'AN' devant un nom commençant par un son \"voyelle\"."
				+ "Exemples :  \n - door (porte) > a door (une porte)  \n /d/ est un son consonne"
				+ "Exemples :  \n  - door (porte) > a door (une porte) \n  /d/ est un son consonne"
				+ "- apple (pomme) > an apple (une pomme) \n"
				+ "/a/ est un son voyelle \n"
				+ "/a/ est un son voyelle \n"
				+ "- kitchen (cuisine) > a kitchen (une cuisine) \n"
				+"/k/ est un son consonne. \n"
				+"\n\n\n"
				+"Exceptions :\n"
				+"1) Devant le son /j/, on utilise A et non AN. \n"
				+"Exemple : a union (ce mot commence bien par le son /j/. \n"
				+"Mais au fait, qu'est-ce que le son /j/ ? \n"
				+ "C'est le son qu'on retrouve au début de: \'yellow\', 'United States'... \n"
				+"ATTENTION ! C'est un symbole phonétique et non la lettre J. On retrouve un son proche en français  au début du mot 'Yaourt': le son 'ye' \n"
				+ "	2)  Pour les mots commençant par un \"h\", il faut se demander s'il est prononcé (aspiré) ou non:\n \n \n"
				+ "Si le  'h' est aspiré, le mot commence bien par un son consonne. On utilise donc A : A horrible war.\n"
				+ "Si le 'h' n'est pas aspiré, le mot ne commence pas par un son consonne, et donc, on utilise AN : an hour.\n"
				+ "Si cette notion vous pose problème, il y a un cours ici : h aspiré ou non?\n" );

		
		

		




	
		
		



		

		
		
	}
}
