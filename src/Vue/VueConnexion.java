package Vue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
	private JButton Connexion = new JButton(new ImageIcon ("./images/SignIN.png"));
	private JButton Help = new JButton(new ImageIcon ("./images/Help.png"));
	private JButton NouvelUtilisateur = new JButton(new ImageIcon ("./images/NewUser.png"));
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
	    	   ex.printStackTrace();
	       }
		
		TxtNomUtilisateur.setBounds(530, 225, 160, 25);
		TxtNomUtilisateur.addActionListener(new SeConnecter(m,this));

		Mdp.setBounds(530, 275, 160, 25);
		Mdp.addActionListener(new SeConnecter(m,this));
		
		Connexion.setBounds(725, 275, 147, 25);
		Connexion.addActionListener(new SeConnecter(m,this));
		
		Help.setBounds(1170, 10, 80, 74);
		Help.addActionListener(new ContinuerVersPageAideDeVueCo(m,this));
		Help.setBorderPainted(false);
		
		
		NouvelUtilisateur.setBounds(882, 275, 147, 25);
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
