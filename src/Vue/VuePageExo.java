package Vue;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersPageExoATrou;
import Controler.ContinuerVersPageExoVocATable;
import anglais.Modele;

public class VuePageExo extends JPanel implements Vue{
	
	Modele m;
	private JButton exoATrou = new JButton();
	private JButton exoVocATable = new JButton();
	
	public VuePageExo(Modele m){
		this.m =m;
		
		this.setLayout(null);
		
		this.add(exoATrou);
		this.add(exoVocATable);
		
		exoATrou.setText("Exercice with multiple choices");
		exoATrou.setBounds(15,15, 225, 35);
		exoATrou.addActionListener(new ContinuerVersPageExoATrou(m,this));
		
		exoVocATable.setText("A table !");
		exoVocATable.setBounds(800,15, 225, 35);
		exoVocATable.addActionListener(new ContinuerVersPageExoVocATable(m,this));
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
