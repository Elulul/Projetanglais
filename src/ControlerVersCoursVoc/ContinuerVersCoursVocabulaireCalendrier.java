package ControlerVersCoursVoc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursVocabulaire;
import anglais.Modele;

public class ContinuerVersCoursVocabulaireCalendrier implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersCoursVocabulaireCalendrier (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursVocabulaire  vueCVAT = new VueCoursVocabulaire(m,m.getListeVocCalendrier());
		vueCVAT.update();
	}
	
}
