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
	
	public VueAide(Modele m){
		this.m = m;
				
		this.setLayout(null);
		this.add(TexteAide);
		this.add(Retour);
		
		TexteAide.setText("message d'aide");
		TexteAide.setBounds(400, 250,200, 40);
		
		Retour.setText("Return");
		Retour.setBounds(0, 15,150, 40);
		Retour.addActionListener(new ContinuerVersApp(m,this));
		
		
	}
	
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
