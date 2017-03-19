package Vuecours;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersPageDaccueil;
import ControlerVersCours.ContinuerVersCoursAnA;
import ControlerVersCours.ContinuerVersCoursFuture;
import ControlerVersCours.ContinuerVersCoursPasse;
import ControlerVersCours.ContinuerVersCoursPasse2;
import ControlerVersCours.ContinuerVersCoursPresent;
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
	
	private JButton retour = new JButton(new ImageIcon("./images/Home.png"));
	private JButton RegleAsLike = new JButton();
	private JButton Present = new JButton();
	private JButton RegleAnA = new JButton();
	private JButton AuxiliaireBe = new JButton();
	private JButton Passe = new JButton();
	private JButton Passe2 = new JButton();
	private JButton Future = new JButton();
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
	private BufferedImage image;
	
	
	
	public VueCours(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(retour);
		this.add(RegleAsLike);
		this.add(RegleAnA);
		this.add(AuxiliaireBe);
		this.add(Present);
		this.add(Passe);
		this.add(Passe2);
		this.add(Future);
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
		
		try {
			 
	          image = ImageIO.read(new File("./images/cours.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		
		retour.setBounds(20, 20,80, 79);
		retour.setBorderPainted(false);
		retour.addActionListener(new ContinuerVersPageDaccueil(m,this));
		
		
		
		
		RegleAsLike.setContentAreaFilled(false);
		RegleAsLike.setBorderPainted(false);
		RegleAsLike.setBounds(65, 170, 118, 28);
		RegleAsLike.addActionListener(new ContinuerVersCoursRegleAsLike(m,this));
		
		RegleAnA.setContentAreaFilled(false);
		RegleAnA.setBorderPainted(false);
		RegleAnA.setBounds(100, 207, 72, 23);
		RegleAnA.addActionListener(new ContinuerVersCoursAnA(m,this));
		
		AuxiliaireBe.setContentAreaFilled(false);
		AuxiliaireBe.setBorderPainted(false);
		AuxiliaireBe.setBounds(15, 240,238, 60);
		AuxiliaireBe.addActionListener(new ContinuerVersCoursAnA(m,this));
		
		Passe.setContentAreaFilled(false);
		Passe.setBorderPainted(false);
		Passe.setBounds(65, 311, 143, 22);
		Passe.addActionListener(new ContinuerVersCoursPasse(m,this));
		
		
		Passe2.setContentAreaFilled(false);
		Passe2.setBorderPainted(false);
		Passe2.setBounds(5, 343, 265, 28);
		Passe2.addActionListener(new ContinuerVersCoursPasse2(m,this));
		
		Future.setContentAreaFilled(false);
		Future.setBorderPainted(false);
		Future.setBounds(80, 380, 115, 25);
		Future.addActionListener(new ContinuerVersCoursFuture(m,this));
		
		Present.setContentAreaFilled(false);
		Present.setBorderPainted(false);
		Present.setBounds(68, 415, 135, 23);
		Present.addActionListener(new ContinuerVersCoursPresent(m,this));
		
		
		
//		VocabulaireATable.setContentAreaFilled(false);
//		VocabulaireATable.setBorderPainted(false);
//		VocabulaireATable.setBounds(1018, 614, 236, 29);
//		VocabulaireATable.addActionListener(new ContinuerVersCoursVocabulaireATable(m,this));
		
		VocabulaireHabit.setContentAreaFilled(false);
		VocabulaireHabit.setBorderPainted(false);
		VocabulaireHabit.setBounds(1067, 177, 140, 30);
		VocabulaireHabit.addActionListener(new ContinuerVersCoursVocabulaireHabit(m,this));
		
		VocabulaireAnimauxSauvage.setContentAreaFilled(false);
		VocabulaireAnimauxSauvage.setBorderPainted(false);
		VocabulaireAnimauxSauvage.setBounds(1062, 217, 150, 30);
		VocabulaireAnimauxSauvage.addActionListener(new ContinuerVersCoursVocabulaireAnimaux(m,this));
		
		VocabulaireBricolage.setContentAreaFilled(false);
		VocabulaireBricolage.setBorderPainted(false);
		VocabulaireBricolage.setBounds(1108, 260, 58, 27);
		VocabulaireBricolage.addActionListener(new ContinuerVersCoursVocabulaireBricolage(m,this));
		
		VocabulaireCalendrier.setContentAreaFilled(false);
		VocabulaireCalendrier.setBorderPainted(false);
		VocabulaireCalendrier.setBounds(1052, 300, 170, 28);
		VocabulaireCalendrier.addActionListener(new ContinuerVersCoursVocabulaireCalendrier(m,this));
		
		VocabulaireMaterielInformatique.setContentAreaFilled(false);
		VocabulaireMaterielInformatique.setBorderPainted(false);
		VocabulaireMaterielInformatique.setBounds(1045, 340, 180, 63);
		VocabulaireMaterielInformatique.addActionListener(new ContinuerVersCoursVocabulaireMaterielInformatique(m,this));
		
		VocabulaireNourriture.setContentAreaFilled(false);
		VocabulaireNourriture.setBorderPainted(false);
		VocabulaireNourriture.setBounds(1091, 420, 92, 22);
		VocabulaireNourriture.addActionListener(new ContinuerVersCoursVocabulaireNourriture(m,this));
		
		VocabulaireNourritureSuite.setContentAreaFilled(false);
		VocabulaireNourritureSuite.setBorderPainted(false);
		VocabulaireNourritureSuite.setBounds(1020, 455, 230, 30);
		VocabulaireNourritureSuite.addActionListener(new ContinuerVersCoursVocabulaireNourritureSuite(m,this));
		
		VocabulaireSentiment.setContentAreaFilled(false);
		VocabulaireSentiment.setBorderPainted(false);
		VocabulaireSentiment.setBounds(1054, 498, 163, 24);
		VocabulaireSentiment.addActionListener(new ContinuerVersCoursVocabulaireSentiment(m,this));
		
		VocabulaireSport.setContentAreaFilled(false);
		VocabulaireSport.setBorderPainted(false);
		VocabulaireSport.setBounds(1080, 537, 110, 25);
		VocabulaireSport.addActionListener(new ContinuerVersCoursVocabulaireSport(m,this));
		
		VocabulaireTransport.setContentAreaFilled(false);
		VocabulaireTransport.setBorderPainted(false);
		VocabulaireTransport.setBounds(1041, 575, 190, 25);
		VocabulaireTransport.addActionListener(new ContinuerVersCoursVocabulaireTransport(m,this));
		
		
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
