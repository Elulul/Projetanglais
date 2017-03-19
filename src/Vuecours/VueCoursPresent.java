package Vuecours;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
	Font f2 = new Font("Serif", Font.PLAIN, 18);
	private BufferedImage image;

	public VueCoursPresent(Modele m){
		this.m = m;
		
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		try {
			 
	          image = ImageIO.read(new File("./images/coursGrammaire.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		cours2.setText("Les deux principaux présents en anglais\n\n"
				+ "Le présent simple s'emploie pour parler de ce qui n'est pas limité au contexte actuel: donc :\n"
				+ "-des faits plus ou moins permanents\n"
				+ "-des actions qui se répètent\n"
				+ "- des habitudes.\n\n"
				+ "Le présent en BE+ING  s'emploie\n"
				+ "- dans un contexte temporaire / transitoire et en cours\n"
				+ "(que ce soit une situation de durée limitée, une action ou une brève série d'actions).\n"
				+ "Un exemple pour cerner la différence entre les deux présents:\n\n"
				+ "Water boils at 100°C => l'eau bout à 100°C  (C'est un fait permanent).\n\n	"
				+ "Maintenant imaginez que vous êtes dans votre cuisine en train de préparer du thé, l'eau se met à bouillir, tant mieux, c'est \n"
				+ "ce que vous attendiez, mais vous la retirez du feu pour préparer votre boisson. Ce n'est donc plus un fait permanent mais  \n"
				+ "temporaire. Vous direz:\n\n"
				+ "The water is boiling I'll make my tea. => L'eau bout, je vais faire mon thé.\n"
				+ ""
				+ ""
				+ "");
				cours2.setBounds(120, 20, 1150, 800);
				cours2.setOpaque(false);
				cours2.setFont(f2);
				cours2.setForeground(Color.white);

				
			}
			
			public void update() {
				m.getFenetre().setContentPane(this);
				m.getFenetre().revalidate();
			}
			protected void paintComponent(Graphics g) {
		        super.paintComponent(g); 
		        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		    }

}
