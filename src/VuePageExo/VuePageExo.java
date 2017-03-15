package VuePageExo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersPageDaccueil;
import ControlerVersPageExo.ContinuerVersPageExoATrou;
import ControlerVersPageExo.ContinuerVersPageExoATrouAsLike;
import ControlerVersPageExo.ContinuerVersPageExoVoc;
import ControlerVersPageExo.ContinuerVersPageExoVocATable;
import ControlerVersPageExo.ContinuerVersPageExoVoltaire;
import Vue.Vue;
import anglais.Modele;

public class VuePageExo extends JPanel implements Vue{
	
	Modele m;
	
	private JButton exoATrou = new JButton();
	private JButton exoVocATable = new JButton();
	private JButton exoVoltaire= new JButton();
	private JButton Home = new JButton(new ImageIcon("./images/Home.png"));
	
	
	
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
	
	public VuePageExo(Modele m){
		this.m =m;
		
		this.setLayout(null);
		
		
		Home.setBounds(20, 20, 80, 79);
		Home.addActionListener(new ContinuerVersPageDaccueil(m,this));
		
		this.add(exoATrou);
		this.add(exoVocATable);
		this.add(exoVoltaire);
		this.add(Home);
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
		
		
		
		VocabulaireHabit.setText("Habit");
		VocabulaireHabit.setBounds(1000, 100, 138, 36);
		VocabulaireHabit.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireAnimauxSauvage.setText("Animaux");
		VocabulaireAnimauxSauvage.setBounds(1000, 150, 138, 36);
		VocabulaireAnimauxSauvage.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireBricolage.setText("Bricolage");
		VocabulaireBricolage.setBounds(1000, 200, 138, 36);
		VocabulaireBricolage.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireCalendrier.setText("Calendrier");
		VocabulaireCalendrier.setBounds(1000, 250, 138, 36);
		VocabulaireCalendrier.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireMaterielInformatique.setText("Materiel informatique");
		VocabulaireMaterielInformatique.setBounds(1000, 300, 138, 36);
		VocabulaireMaterielInformatique.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireNourriture.setText("Nourriture");
		VocabulaireNourriture.setBounds(1000, 350, 138, 36);
		VocabulaireNourriture.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireNourritureSuite.setText("NourritureSuite");
		VocabulaireNourritureSuite.setBounds(1000, 400, 138, 36);
		VocabulaireNourritureSuite.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireSentiment.setText("Sentiment");
		VocabulaireSentiment.setBounds(1000, 450, 138, 36);
		VocabulaireSentiment.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireSport.setText("Sport");
		VocabulaireSport.setBounds(1000, 500, 138, 36);
		VocabulaireSport.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireTransport.setText("Transport");
		VocabulaireTransport.setBounds(1000, 550, 138, 36);
		VocabulaireTransport.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		
		
		
		
		
		
		exoATrou.setText("Exercice with multiple choices");
		exoATrou.setBounds(15,100, 225, 35);
		exoATrou.addActionListener(new ContinuerVersPageExoATrou(m,this));
		
		exoVocATable.setText("A table !");
		exoVocATable.setBounds(800,350, 225, 35);
		exoVocATable.addActionListener(new ContinuerVersPageExoVocATable(m,this));
		
		exoVoltaire.setText("ExoVoltaire");
		exoVoltaire.setBounds(15,150, 225, 35);
		exoVoltaire.addActionListener(new ContinuerVersPageExoVoltaire(m,this));
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}


	public JButton getVocabulaireAnimauxSauvage() {
		return VocabulaireAnimauxSauvage;
	}


	public void setVocabulaireAnimauxSauvage(JButton vocabulaireAnimauxSauvage) {
		VocabulaireAnimauxSauvage = vocabulaireAnimauxSauvage;
	}


	public JButton getVocabulaireBricolage() {
		return VocabulaireBricolage;
	}


	public void setVocabulaireBricolage(JButton vocabulaireBricolage) {
		VocabulaireBricolage = vocabulaireBricolage;
	}


	public JButton getVocabulaireCalendrier() {
		return VocabulaireCalendrier;
	}


	public void setVocabulaireCalendrier(JButton vocabulaireCalendrier) {
		VocabulaireCalendrier = vocabulaireCalendrier;
	}


	public JButton getVocabulaireMaterielInformatique() {
		return VocabulaireMaterielInformatique;
	}


	public void setVocabulaireMaterielInformatique(JButton vocabulaireMaterielInformatique) {
		VocabulaireMaterielInformatique = vocabulaireMaterielInformatique;
	}


	public JButton getVocabulaireNourriture() {
		return VocabulaireNourriture;
	}


	public void setVocabulaireNourriture(JButton vocabulaireNourriture) {
		VocabulaireNourriture = vocabulaireNourriture;
	}


	public JButton getVocabulaireNourritureSuite() {
		return VocabulaireNourritureSuite;
	}


	public void setVocabulaireNourritureSuite(JButton vocabulaireNourritureSuite) {
		VocabulaireNourritureSuite = vocabulaireNourritureSuite;
	}


	public JButton getVocabulaireSentiment() {
		return VocabulaireSentiment;
	}


	public void setVocabulaireSentiment(JButton vocabulaireSentiment) {
		VocabulaireSentiment = vocabulaireSentiment;
	}


	public JButton getVocabulaireSport() {
		return VocabulaireSport;
	}


	public void setVocabulaireSport(JButton vocabulaireSport) {
		VocabulaireSport = vocabulaireSport;
	}


	public JButton getVocabulaireTransport() {
		return VocabulaireTransport;
	}


	public void setVocabulaireTransport(JButton vocabulaireTransport) {
		VocabulaireTransport = vocabulaireTransport;
	}


	public JButton getVocabulaireHabit() {
		return VocabulaireHabit;
	}


	public void setVocabulaireHabit(JButton vocabulaireHabit) {
		VocabulaireHabit = vocabulaireHabit;
	}
	
}
