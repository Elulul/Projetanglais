package VuePageExo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import ControlerVersPageExo.ContinuerVersPageExo;
import ControlerVersPageExo.ContinuerVersPageExoATrouAsLike;
import ControlerVersPageExo.ContinuerVersPageExoATrouFuture;
import ControlerVersPageExo.ContinuerVersPageExoATrouPasse;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoATrou extends JPanel implements Vue{

	Modele m;
	private JButton aslike =  new JButton();
	private JButton Passe =  new JButton();
	private JButton Future =  new JButton();
	private JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	
	
	public VuePageExoATrou(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersPageExo(m,this));
		retour.setBorderPainted(false);
		this.add(retour);
		
		this.add(Passe);
		Passe.setText("Preterit");
		Passe.setBounds(15,190, 125, 35);
		Passe.addActionListener(new ContinuerVersPageExoATrouPasse(m,this) );
		
		this.add(Future);
		Future.setText("Future");
		Future.setBounds(15,230, 125, 35);
		Future.addActionListener(new ContinuerVersPageExoATrouFuture(m,this));
		
		this.add(aslike);
		aslike.setText("rule AS/LIKE");
		aslike.setBounds(15,150, 125, 35);
		aslike.addActionListener(new ContinuerVersPageExoATrouAsLike(m,this));
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
