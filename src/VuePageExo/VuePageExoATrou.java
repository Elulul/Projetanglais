package VuePageExo;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersPageExo;
import Controler.ContinuerVersPageExoATrouAsLike;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoATrou extends JPanel implements Vue{

	Modele m;
	private JButton aslike =  new JButton();
	
	
	public VuePageExoATrou(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(aslike);
		aslike.setText("rule AS/LIKE");
		aslike.setBounds(15,15, 125, 35);
		aslike.addActionListener(new ContinuerVersPageExoATrouAsLike(m,this));
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
