package Vuecours;

import javax.swing.JButton;
import javax.swing.JPanel;

import ControlerVersCours.ContinuerVersCours;
import ControlerVersCours.ContinuerVersCoursRegleAsLike;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireATable;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireAnimaux;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireBricolage;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireCalendrier;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireHabit;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireMaterielInformatique;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireNourriture;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireNourritureSuite;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireSentiment;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireSport;
import ControlerVersCoursVoc.ContinuerVersCoursVocabulaireTransport;
import Vue.Vue;
import anglais.Modele;

public class VueCours extends JPanel implements Vue {

	Modele m;
	
	private JButton retour = new JButton();
	private JButton RegleAsLike = new JButton();
	private JButton VocabulaireATable = new JButton();
	private JButton VocabulaireAnimauxSauvage = new JButton();
	private JButton VocabulaireBricolage = new JButton();
	private JButton VocabulaireCalendrier = new JButton();
	private JButton VocabulaireMaterielInformatique = new JButton();
	private JButton VocabulaireNourriture = new JButton();
	private JButton VocabulaireNourritureSuite = new JButton();
	private JButton VocabulaireSentiment = new JButton();
	private JButton VocabulaireSport = new JButton();
	private JButton VocabulaireTransport = new JButton();
	private JButton VocabulaireHabit = new JButton();
	
	
	
	
	public VueCours(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(retour);
		this.add(RegleAsLike);
		this.add(VocabulaireATable);
		this.add(VocabulaireHabit);
		this.add(VocabulaireAnimauxSauvage);
		this.add(VocabulaireBricolage);
		this.add(VocabulaireCalendrier);
		this.add(VocabulaireMaterielInformatique);
		this.add(VocabulaireNourriture);
		this.add(VocabulaireNourritureSuite);
		this.add(VocabulaireSentiment);
		this.add(VocabulaireSport);
		this.add(VocabulaireTransport);
		
		retour.setText("Home");
		retour.setBounds(20, 20, 138, 36);
		retour.addActionListener(new ContinuerVersCours(m,this));
		
		RegleAsLike.setText("AS LIKE");
		RegleAsLike.setBounds(75, 75, 138, 36);
		RegleAsLike.addActionListener(new ContinuerVersCoursRegleAsLike(m,this));
		
		VocabulaireATable.setText("A table !");
		VocabulaireATable.setBounds(1000, 50, 138, 36);
		VocabulaireATable.addActionListener(new ContinuerVersCoursVocabulaireATable(m,this));
		
		VocabulaireHabit.setText("Habit");
		VocabulaireHabit.setBounds(1000, 100, 138, 36);
		VocabulaireHabit.addActionListener(new ContinuerVersCoursVocabulaireHabit(m,this));
		
		VocabulaireAnimauxSauvage.setText("Animaux");
		VocabulaireAnimauxSauvage.setBounds(1000, 150, 138, 36);
		VocabulaireAnimauxSauvage.addActionListener(new ContinuerVersCoursVocabulaireAnimaux(m,this));
		
		VocabulaireBricolage.setText("Bricolage");
		VocabulaireBricolage.setBounds(1000, 200, 138, 36);
		VocabulaireBricolage.addActionListener(new ContinuerVersCoursVocabulaireBricolage(m,this));
		
		VocabulaireCalendrier.setText("Calendrier");
		VocabulaireCalendrier.setBounds(1000, 250, 138, 36);
		VocabulaireCalendrier.addActionListener(new ContinuerVersCoursVocabulaireCalendrier(m,this));
		
		VocabulaireMaterielInformatique.setText("Materiel informatique");
		VocabulaireMaterielInformatique.setBounds(1000, 300, 138, 36);
		VocabulaireMaterielInformatique.addActionListener(new ContinuerVersCoursVocabulaireMaterielInformatique(m,this));
		
		VocabulaireNourriture.setText("Nourriture");
		VocabulaireNourriture.setBounds(1000, 350, 138, 36);
		VocabulaireNourriture.addActionListener(new ContinuerVersCoursVocabulaireNourriture(m,this));
		
		VocabulaireNourritureSuite.setText("NourritureSuite");
		VocabulaireNourritureSuite.setBounds(1000, 400, 138, 36);
		VocabulaireNourritureSuite.addActionListener(new ContinuerVersCoursVocabulaireNourritureSuite(m,this));
		
		VocabulaireSentiment.setText("Sentiment");
		VocabulaireSentiment.setBounds(1000, 450, 138, 36);
		VocabulaireSentiment.addActionListener(new ContinuerVersCoursVocabulaireSentiment(m,this));
		
		VocabulaireSport.setText("Sport");
		VocabulaireSport.setBounds(1000, 500, 138, 36);
		VocabulaireSport.addActionListener(new ContinuerVersCoursVocabulaireSport(m,this));
		
		VocabulaireTransport.setText("Transport");
		VocabulaireTransport.setBounds(1000, 550, 138, 36);
		VocabulaireTransport.addActionListener(new ContinuerVersCoursVocabulaireTransport(m,this));
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
