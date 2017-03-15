package Vue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import ControlerVersCours.ContinuerVersCours;
import ControlerVersPageExo.ContinuerVersPageExo;
import anglais.Modele;

public class VuePrincipale extends JPanel implements Vue {

	Modele m;
	JButton lecon = new JButton();
	JButton exercice = new JButton();
	protected BufferedImage	image;
	
	public VuePrincipale(Modele m){
		this.m = m;
		this.setLayout(null);	
		this.add(lecon);
		this.add(exercice);
		
		lecon.setOpaque(false);
		lecon.setContentAreaFilled(false);
		lecon.setBounds(114, 305, 169, 50);
		lecon.addActionListener(new ContinuerVersCours(m,this));
		
		exercice.setOpaque(false);
		exercice.setContentAreaFilled(false);
		exercice.setBounds(970, 308, 199, 50);
		exercice.addActionListener(new ContinuerVersPageExo(m,this));
		
		try {
			 
	          image = ImageIO.read(new File("./images/motivation3.jpg"));
	          
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
