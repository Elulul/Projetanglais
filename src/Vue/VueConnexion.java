package Vue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controler.ContinuerVersNouvelUtilisateur;
import Controler.ContinuerVersPageAideDeVueCo;
import Controler.SeConnecter;
import Controler.mouseListener;
import anglais.Modele;

public class VueConnexion extends JPanel implements Vue{

	Modele m;
	private JTextField TxtNomUtilisateur= new JTextField();
	private JPasswordField Mdp = new JPasswordField();
	private JButton Connexion = new JButton();
	private JButton Help = new JButton();
	private JButton NouvelUtilisateur = new JButton();
	private BufferedImage image;
	
	public VueConnexion(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(TxtNomUtilisateur);
		this.add(Connexion);
		this.add(Mdp);
		this.add(Help);
		this.add(NouvelUtilisateur);
		try {
			 
	          image = ImageIO.read(new File("./images/motivation1.jpg"));
	          
	    	  
	       } catch (IOException ex) {
	       
	       }
		
		TxtNomUtilisateur.setBounds(530, 225, 160, 25);
		TxtNomUtilisateur.addMouseListener(new mouseListener(TxtNomUtilisateur));

		Mdp.setBounds(530, 275, 160, 25);
		Mdp.addMouseListener(new mouseListener(Mdp));
		
		Connexion.setBounds(725, 275, 100, 25);
		Connexion.setText("Sign In");
		Connexion.addActionListener(new SeConnecter(m,this));
		
		Help.setText("Help");
		Help.setBounds(1150, 10, 100, 35);
		Help.addActionListener(new ContinuerVersPageAideDeVueCo(m,this));
		
		
		NouvelUtilisateur.setText("New User");
		NouvelUtilisateur.setBounds(835, 275, 100, 25);
		NouvelUtilisateur.addActionListener(new ContinuerVersNouvelUtilisateur(m,this));
	}
	
	
	public String getTxtNomUtilisateur(){
		return TxtNomUtilisateur.getText();
	}
	
	public String getMdp(){
		return Mdp.getText();
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
