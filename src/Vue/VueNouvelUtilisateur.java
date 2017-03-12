package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controler.*;
import anglais.Modele;

public class VueNouvelUtilisateur extends JPanel implements Vue{
	
	Modele m;
	private JTextField TxtNomUtilisateur= new JTextField();
	private JTextField Mdp = new JTextField();
	private JButton Créer = new JButton();
	JButton Retour = new JButton();
	
	public VueNouvelUtilisateur(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(TxtNomUtilisateur);
		this.add(Mdp);
		this.add(Créer);
		this.add(Retour);

		
		TxtNomUtilisateur.setText("User");
		TxtNomUtilisateur.setBounds(575, 225, 125, 35);
		TxtNomUtilisateur.addMouseListener(new mouseListener(TxtNomUtilisateur));
		
		Mdp.setText("Password");
		Mdp.setBounds(575, 300, 125, 35);
		Mdp.addMouseListener(new mouseListener(Mdp));
		
		Créer.setBounds(975, 500, 150, 50);
		Créer.setText("Sign up");
		Créer.addActionListener(new CreerNouvelUtilisateur(m,this));
		
		Retour.setText("Back");
		Retour.setBounds(0, 15,150, 40);
		Retour.addActionListener(new ContinuerVersApp(m,this));
	}
	


	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
	
	public String getTxtNomUtilisateur(){
		return TxtNomUtilisateur.getText();
	}
	
	public String getMdp(){
		return Mdp.getText();
	}
}
