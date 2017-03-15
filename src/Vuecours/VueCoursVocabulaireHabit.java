package Vuecours;

import java.awt.Font;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Vue.Vue;
import anglais.Modele;

public class VueCoursVocabulaireHabit extends JPanel implements Vue {
	
	Modele m;
	
	ArrayList<ArrayList<String>> listeVocHabit = new  ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<JLabel>> listeVocAAfficher = new  ArrayList<ArrayList<JLabel>>();
	Font f2 = new Font("Serif", Font.PLAIN, 20);
	
	public VueCoursVocabulaireHabit(Modele m) {
		this.m = m;
		
		this.iniListeVocAAfficher();
		
		this.setLayout(null);
		
		listeVocHabit = m.getListeVocHabit();
		
		for (int i =0; i < 15;i++){
			listeVocAAfficher.get(i).get(0).setText(listeVocHabit.get(i).get(0) + " :");
			listeVocAAfficher.get(i).get(0).setBounds(220, 40*i +40, 200, 20);
			listeVocAAfficher.get(i).get(0).setFont(f2);
			this.add(listeVocAAfficher.get(i).get(0));
			
			listeVocAAfficher.get(i).get(1).setText(listeVocHabit.get(i).get(1) );
			listeVocAAfficher.get(i).get(1).setBounds(400, 40*i +40, 200, 20);
			listeVocAAfficher.get(i).get(1).setFont(f2);
			this.add(listeVocAAfficher.get(i).get(1));
		}
		
		for (int i =0; i < 15;i++){
			
			listeVocAAfficher.get(i +15).get(0).setText(listeVocHabit.get(i+15).get(0) + " :");
			listeVocAAfficher.get(i+15).get(0).setBounds(665, 40*i +40, 200, 20);
			listeVocAAfficher.get(i+15).get(0).setFont(f2);
			this.add(listeVocAAfficher.get(i+15).get(0));
			
			listeVocAAfficher.get(i+15).get(1).setText(listeVocHabit.get(i+15).get(1) );
			listeVocAAfficher.get(i+15).get(1).setBounds(850, 40*i +40, 200, 20);
			listeVocAAfficher.get(i+15).get(1).setFont(f2);
			this.add(listeVocAAfficher.get(i+15).get(1));
		}
		
		
	}
	
	
	
	
	
	public void iniListeVocAAfficher(){
		ArrayList<JLabel> tampon = new ArrayList<JLabel>();
		listeVocAAfficher = new  ArrayList<ArrayList<JLabel>>();
		for(int i = 0; i< 30 ; i++){
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


