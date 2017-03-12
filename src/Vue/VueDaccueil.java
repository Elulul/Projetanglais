package Vue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersApp;
import anglais.Modele;

public class VueDaccueil extends JPanel implements Vue	 {
	BufferedImage image;
	Modele m;
	private JButton Continuer = new JButton();

	
	
	
	public VueDaccueil(Modele m){
		this.m = m ;
		try {
			 
	          image = ImageIO.read(new File("./images/testfond3.jpg"));
	          
	    	  
	       } catch (IOException ex) {
	       
	       }
		
		this.setLayout(null);
		this.add(Continuer);
		
	
		
		Continuer.setBounds(205, 460, 830, 120);
		Continuer.setToolTipText("Click here to enter the core of the application");
		Continuer.setVisible(true);
		Continuer.setOpaque(false);
		Continuer.setContentAreaFilled(false);
		Continuer.setBorder(null);
		Continuer.addActionListener(new ContinuerVersApp(m,this));
	}
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(image, 0, 0, this); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
