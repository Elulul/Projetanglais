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

public class VueCoursAuxiliaireBe extends JPanel implements Vue {

	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 20);
	private BufferedImage image;

	
	public VueCoursAuxiliaireBe(Modele m){
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
		cours2.setText("Auxiliaire BE - cours \n \n"
				+ "L'auxiliaire BE, comme les auxiliaires 'have' et 'do' permet de conjuguer les verbes, et il peut être "
				+ "contracté. \n"
				+ "Ce sont les auxiliaires qui portent la négation et se déplacent dans les questions. \n"
				+ "Ils sont souvent associés à un verbe lexical. \n \n \n"
				+ "A/ Emplois de l'auxiliaire BE : \n "
				+ "Il a deux emplois principaux : \n\n"
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
