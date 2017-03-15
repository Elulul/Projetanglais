package Vuecours;

import javax.swing.JButton;
import javax.swing.JPanel;

import ControlerVersCours.ContinuerVersCoursRegleAsLike;
import ControlerVersCours.ContinuerVersCoursVocabulaireATable;
import ControlerVersCours.ContinuerVersCoursVocabulaireHabit;
import Vue.Vue;
import anglais.Modele;

public class VueCours extends JPanel implements Vue {

	Modele m;
	private JButton RegleAsLike = new JButton();
	private JButton VocabulaireATable = new JButton();
	private JButton VocabulaireHabit = new JButton();
	
	
	public VueCours(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(RegleAsLike);
		this.add(VocabulaireATable);
		this.add(VocabulaireHabit);
		
		RegleAsLike.setText("AS LIKE");
		RegleAsLike.setBounds(20, 50, 138, 36);
		RegleAsLike.addActionListener(new ContinuerVersCoursRegleAsLike(m,this));
		
		VocabulaireATable.setText("A table !");
		VocabulaireATable.setBounds(1000, 50, 138, 36);
		VocabulaireATable.addActionListener(new ContinuerVersCoursVocabulaireATable(m,this));
		
		VocabulaireHabit.setText("Habit");
		VocabulaireHabit.setBounds(1000, 100, 138, 36);
		VocabulaireHabit.addActionListener(new ContinuerVersCoursVocabulaireHabit(m,this));
		
		
		
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}