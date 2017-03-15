package ControlerVersCoursVoc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursVocabulaire;
import Vuecours.VueCoursVocabulaireATable;
import anglais.Modele;

public class ContinuerVersCoursVocabulaireBricolage implements ActionListener{

	
	Modele m;
	Vue v;
	
	public ContinuerVersCoursVocabulaireBricolage (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursVocabulaire  vueCVAT = new VueCoursVocabulaire(m,m.getListeBricolage());
		vueCVAT.update();
	}
}
