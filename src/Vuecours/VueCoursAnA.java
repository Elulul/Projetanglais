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

public class VueCoursAnA extends JPanel implements Vue{

	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 20);
	private BufferedImage image;

	
	public VueCoursAnA (Modele m){
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
		cours2.setText("Il faut utiliser l'article A devant un nom commençant par un son \"consonne\" et 'AN' devant un nom commençant par un son \"voyelle\"."
				+ ""
				+"\n Exemples :  \n- door (porte) > a door (une porte)  \n"
				+ "- apple (pomme) > an apple (une pomme) \n"
				+ "- kitchen (cuisine) > a kitchen (une cuisine) \n"
				+"\n\n"
				+"Exceptions :\n"
				+"1) Devant le son /j/, on utilise A et non AN. \n"
				+"Exemple : a union (ce mot commence bien par le son /j/. \n"
				+"Mais au fait, qu'est-ce que le son /j/ ? \n"
				+ "C'est le son qu'on retrouve au début de: \'yellow\', 'United States'... \n"
				+"ATTENTION ! C'est un symbole phonétique et non la lettre J. On retrouve un son proche en français  au début du mot 'Yaourt': le son \'ye\'"
				+" \n\n"
				+ "2)  Pour les mots commençant par un \"h\", il faut se demander s'il est prononcé (aspiré) ou non:\n "
				+ "Si le  'h' est aspiré, le mot commence bien par un son consonne. On utilise donc A : A horrible war.\n"
				+ "Si le 'h' n'est pas aspiré, le mot ne commence pas par un son consonne, et donc, on utilise AN : an hour.\n"
				+ "Si cette notion vous pose problème, il y a un cours ici : h aspiré ou non?\n" );

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
