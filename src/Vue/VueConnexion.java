package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controler.*;
import anglais.Modele;

public class VueConnexion extends JPanel implements Vue{

	Modele m;
	private JTextField TxtNomUtilisateur= new JTextField();
	private JTextField Mdp = new JTextField();
	private JButton Connexion = new JButton();
	private JButton Help = new JButton();
	private JButton NouvelUtilisateur = new JButton();
	
	public VueConnexion(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(TxtNomUtilisateur);
		this.add(Connexion);
		this.add(Mdp);
		this.add(Help);
		this.add(NouvelUtilisateur);
		
		
		TxtNomUtilisateur.setText("User");
		TxtNomUtilisateur.setBounds(575, 225, 125, 35);
		TxtNomUtilisateur.addMouseListener(new mouseListener(TxtNomUtilisateur));

		Mdp.setText("Password");
		Mdp.setBounds(575, 300, 125, 35);
		Mdp.addMouseListener(new mouseListener(Mdp));
		
		Connexion.setBounds(975, 500, 150, 50);
		Connexion.setText("Connect");
		Connexion.addActionListener(new SeConnecter(m,this));
		
		Help.setText("Help");
		Help.setBounds(1150, 10, 100, 35);
		Help.addActionListener(new ContinuerVersPageAideDeVueCo(m,this));
		
		
		NouvelUtilisateur.setText("New User");
		NouvelUtilisateur.setBounds(975, 600, 150, 50);
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
}
