package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import anglais.Modele;

public class VueConnexion extends JPanel implements Vue{

	Modele m;
	private JTextField TxtNomUtilisateur= new JTextField();
	private JTextField Mdp = new JTextField();
	private JButton Connexion = new JButton();
	
	public VueConnexion(Modele m){
		this.add(TxtNomUtilisateur);
		this.add(Connexion);
		
		
		TxtNomUtilisateur.setText("User");
		TxtNomUtilisateur.setBounds(575, 300, 300, 150);
		
		Mdp.setText("Password");
		Mdp.setBounds(775, 300, 300, 150);
	}
}
