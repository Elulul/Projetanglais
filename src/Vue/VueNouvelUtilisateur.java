package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controler.CreerNouvelUtilisateur;
import anglais.Modele;

public class VueNouvelUtilisateur extends JPanel implements Vue{
	
	Modele m;
	private JTextField TxtNomUtilisateur= new JTextField();
	private JTextField Mdp = new JTextField();
	private JButton Cr�er = new JButton();
	
	public VueNouvelUtilisateur(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(TxtNomUtilisateur);
		this.add(Mdp);
		this.add(Cr�er);
		
		
		TxtNomUtilisateur.setText("User");
		TxtNomUtilisateur.setBounds(575, 225, 125, 35);
		
		Mdp.setText("Password");
		Mdp.setBounds(575, 300, 125, 35);
		
		
		Cr�er.setBounds(975, 500, 150, 50);
		Cr�er.setText("Sign up");
		Cr�er.addActionListener(new CreerNouvelUtilisateur(m,this));
		
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
