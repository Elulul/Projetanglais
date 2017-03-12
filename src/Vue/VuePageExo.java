package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersPageExoATrou;
import anglais.Modele;

public class VuePageExo extends JPanel implements Vue{
	
	Modele m;
	private JButton exoATrou = new JButton();
	
	public VuePageExo(Modele m){
		this.m =m;
		
		this.setLayout(null);
		
		this.add(exoATrou);
		
		exoATrou.setText("Exercice with multiple choices");
		exoATrou.setBounds(15,15, 225, 35);
		exoATrou.addActionListener(new ContinuerVersPageExoATrou(m,this));
		
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
