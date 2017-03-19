package VuePageExo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ContinuerVersPageDaccueil;
import ControlerVersPageExo.ContinuerVersPageExoATrou;
import ControlerVersPageExo.ContinuerVersPageExoATrouAsLike;
import ControlerVersPageExo.ContinuerVersPageExoVoc;
import ControlerVersPageExo.ContinuerVersPageExoVocATable;
import ControlerVersPageExoVoltaire.ContinuerVersPageExoVoltaire;
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
	private BufferedImage image;
	
	public VuePageExo(Modele m){
		this.m =m;
		
		this.setLayout(null);
		
		
		try {
			 
	          image = ImageIO.read(new File("./images/exercice.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		
		Home.setBounds(20, 20, 80, 79);
		Home.setBorderPainted(false);
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
		
		
		
		VocabulaireHabit.setContentAreaFilled(false);
		VocabulaireHabit.setBorderPainted(false);
		VocabulaireHabit.setBounds(1067, 177, 140, 30);
		VocabulaireHabit.addActionListener(new ContinuerVersPageExoVoc(m,this));
		

		VocabulaireAnimauxSauvage.setContentAreaFilled(false);
		VocabulaireAnimauxSauvage.setBorderPainted(false);
		VocabulaireAnimauxSauvage.setBounds(1062, 217, 150, 30);
		VocabulaireAnimauxSauvage.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireBricolage.setContentAreaFilled(false);
		VocabulaireBricolage.setBorderPainted(false);
		VocabulaireBricolage.setBounds(1108, 260, 58, 27);
		VocabulaireBricolage.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireCalendrier.setContentAreaFilled(false);
		VocabulaireCalendrier.setBorderPainted(false);
		VocabulaireCalendrier.setBounds(1052, 300, 170, 28);
		VocabulaireCalendrier.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireMaterielInformatique.setContentAreaFilled(false);
		VocabulaireMaterielInformatique.setBorderPainted(false);
		VocabulaireMaterielInformatique.setBounds(1045, 340, 180, 63);
		VocabulaireMaterielInformatique.addActionListener(new ContinuerVersPageExoVoc(m,this));
		

		VocabulaireNourriture.setContentAreaFilled(false);
		VocabulaireNourriture.setBorderPainted(false);
		VocabulaireNourriture.setBounds(1091, 420, 92, 22);
		VocabulaireNourriture.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireNourritureSuite.setContentAreaFilled(false);
		VocabulaireNourritureSuite.setBorderPainted(false);
		VocabulaireNourritureSuite.setBounds(1020, 455, 230, 30);
		VocabulaireNourritureSuite.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireSentiment.setContentAreaFilled(false);
		VocabulaireSentiment.setBorderPainted(false);
		VocabulaireSentiment.setBounds(1054, 498, 163, 24);
		VocabulaireSentiment.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireSport.setContentAreaFilled(false);
		VocabulaireSport.setBorderPainted(false);
		VocabulaireSport.setBounds(1080, 537, 110, 25);
		VocabulaireSport.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		VocabulaireTransport.setContentAreaFilled(false);
		VocabulaireTransport.setBorderPainted(false);
		VocabulaireTransport.setBounds(1041, 575, 190, 25);
		VocabulaireTransport.addActionListener(new ContinuerVersPageExoVoc(m,this));
		
		
		exoATrou.setContentAreaFilled(false);
		exoATrou.setBorderPainted(false);
		exoATrou.setBounds(520,140, 330, 35);
		exoATrou.addActionListener(new ContinuerVersPageExoATrou(m,this));
		
		exoVocATable.setContentAreaFilled(false);
		exoVocATable.setBorderPainted(false);
		exoVocATable.setBounds(1018, 614, 236, 29);
		exoVocATable.addActionListener(new ContinuerVersPageExoVocATable(m,this));
		
		exoVoltaire.setContentAreaFilled(false);
		exoVoltaire.setBorderPainted(false);
		exoVoltaire.setBounds(100,145, 240, 35);
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
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
	
}
