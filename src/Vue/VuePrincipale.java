package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersPageExo;
import anglais.Modele;

public class VuePrincipale extends JPanel implements Vue {

	Modele m;
	JButton lecon = new JButton();
	JButton exercice = new JButton();
	
	
	public VuePrincipale(Modele m){
		this.m = m;

		this.setLayout(null);
		
		this.add(lecon);
		this.add(exercice);
		
		lecon.setText("Lesson");
		lecon.setBounds(650, 300, 125, 35);
		
		exercice.setText("Practice");
		exercice.setBounds(500, 300, 125, 35);
		exercice.addActionListener(new ContinuerVersPageExo(m,this));
		//exercice.addActionListener(new ContinuerVersExoATrouAsLike(m,this));
		
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
