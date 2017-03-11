package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersExoATrou;
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
		lecon.setBounds(725, 300, 125, 35);
		
		exercice.setText("Pratice");
		exercice.setBounds(575, 300, 125, 35);
		exercice.addActionListener(new ContinuerVersExoATrou(m,this));
		
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
