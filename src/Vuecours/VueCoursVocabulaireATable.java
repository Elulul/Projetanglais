package Vuecours;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controler.ContinuerVersPageDaccueil;
import Vue.Vue;
import anglais.Modele;

public class VueCoursVocabulaireATable extends JPanel implements Vue{

	Modele m;
	
	ArrayList<ArrayList<String>> listeVoc = new  ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<JLabel>> listeVocAAfficher = new  ArrayList<ArrayList<JLabel>>();
	
	JButton retour = new JButton();
	public VueCoursVocabulaireATable(Modele m){
		this.m = m;
		
		this.iniListeVocAAfficher();
	
		this.setLayout(null);
		
		this.add(retour);
		
		
		retour.setText("Practice");
		retour.setBounds(20, 20, 138, 36);
		retour.addActionListener(new ContinuerVersPageDaccueil(m,this));
		
		
		listeVoc = m.getListeVocATable();
		
		for (int i =0; i < listeVoc.size();i++){
			listeVocAAfficher.get(i).get(0).setText(listeVoc.get(i).get(0) + " :");
			listeVocAAfficher.get(i).get(0).setBounds(20, 40*i +40, 100, 20);
			this.add(listeVocAAfficher.get(i).get(0));
			
			listeVocAAfficher.get(i).get(1).setText(listeVoc.get(i).get(1) );
			listeVocAAfficher.get(i).get(1).setBounds(100, 40*i +40, 100, 20);
			this.add(listeVocAAfficher.get(i).get(1));
		}
		
	}
	
	
	public void iniListeVocAAfficher(){
		ArrayList<JLabel> tampon = new ArrayList<JLabel>();
		listeVocAAfficher = new  ArrayList<ArrayList<JLabel>>();
		for(int i = 0; i< 15 ; i++){
			tampon = new ArrayList<JLabel>();
			tampon.add(0,new JLabel());
			tampon.add(1,new JLabel());
			listeVocAAfficher.add(i,tampon);
		}
	}
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
