package VuePageExo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import ControlerVersPageExo.ContinuerVersPageExo;
import ControlerVersPageExo.ContinuerVersPageExoATrouAsLike;
import ControlerVersPageExo.ContinuerVersPageExoATrouFuture;
import ControlerVersPageExo.ContinuerVersPageExoATrouPasse;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoATrou extends JPanel implements Vue{

	Modele m;
	private JButton aslike =  new JButton();
	private JButton Passe =  new JButton();
	private JButton Future =  new JButton();
	private JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	private BufferedImage image;
	
	public VuePageExoATrou(Modele m){
		this.m = m;
		this.setLayout(null);
		
		try {
			 
	          image = ImageIO.read(new File("./images/exTrou.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersPageExo(m,this));
		retour.setBorderPainted(false);
		this.add(retour);
		
		this.add(Passe);
		Passe.setContentAreaFilled(false);
		Passe.setBorderPainted(false);
		Passe.setBounds(50,188, 140, 27);
		Passe.addActionListener(new ContinuerVersPageExoATrouPasse(m,this) );
		
		this.add(Future);
		Future.setBorderPainted(false);
		Future.setContentAreaFilled(false);
		Future.setBounds(60,223, 125, 24);
		Future.addActionListener(new ContinuerVersPageExoATrouFuture(m,this));
		
		this.add(aslike);
		aslike.setContentAreaFilled(false);
		aslike.setBorderPainted(false);
		aslike.setBounds(60,150, 125, 30);
		aslike.addActionListener(new ContinuerVersPageExoATrouAsLike(m,this));
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
