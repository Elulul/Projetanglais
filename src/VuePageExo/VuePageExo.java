package VuePageExo;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersPageDaccueil;
import ControlerVersPageExo.ContinuerVersPageExoATrou;
import ControlerVersPageExo.ContinuerVersPageExoVocATable;
import ControlerVersPageExo.ContinuerVersPageExoVoltaire;
import Vue.Vue;
import anglais.Modele;

public class VuePageExo extends JPanel implements Vue{
	
	Modele m;
	private JButton exoATrou = new JButton();
	private JButton exoVocATable = new JButton();
	private JButton exoVoltaire= new JButton();
	private JButton Home = new JButton();
	
	public VuePageExo(Modele m){
		this.m =m;
		
		this.setLayout(null);
		
		Home.setText("Home");
		Home.setBounds(20, 20, 138, 36);
		Home.addActionListener(new ContinuerVersPageDaccueil(m,this));
		
		this.add(exoATrou);
		this.add(exoVocATable);
		this.add(exoVoltaire);
		this.add(Home);
		
		exoATrou.setText("Exercice with multiple choices");
		exoATrou.setBounds(15,100, 225, 35);
		exoATrou.addActionListener(new ContinuerVersPageExoATrou(m,this));
		
		exoVocATable.setText("A table !");
		exoVocATable.setBounds(800,150, 225, 35);
		exoVocATable.addActionListener(new ContinuerVersPageExoVocATable(m,this));
		
		exoVoltaire.setText("ExoVoltaire");
		exoVoltaire.setBounds(15,70, 225, 35);
		exoVoltaire.addActionListener(new ContinuerVersPageExoVoltaire(m,this));
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
