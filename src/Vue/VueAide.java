package Vue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controler.ContinuerVersApp;
import anglais.Modele;

public class VueAide extends JPanel implements Vue{
	Modele m;
	JLabel TexteAide = new JLabel();
	JButton Retour = new JButton();
	JLabel TexteAide2 = new JLabel();
	public VueAide(Modele m){
		this.m = m;
				
		this.setLayout(null);
		this.add(TexteAide);
		this.add(TexteAide2);
		this.add(Retour);
		
		TexteAide.setText("In order to connect, please press the 'New User' button then choose a username and a password and click on 'Sign Up'.");
		TexteAide2.setText("Once you are registered, you can sign in using the username and the password you chose earlier by pressing the 'Sign in' button.");
		TexteAide.setBounds(250, 250,800, 100);
		TexteAide2.setBounds(250, 265,800, 100);
		Retour.setText("Back");
		Retour.setBounds(0, 15,150, 40);
		Retour.addActionListener(new ContinuerVersApp(m,this));
		
		
	}
	
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
