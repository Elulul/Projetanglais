package ControlerVersCoursVoc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Vue.Vue;
import Vuecours.VueCoursVocabulaire;
import anglais.Modele;

public class ContinuerVersCoursVocabulaireHabit implements ActionListener{

	
	Modele m;
	Vue v;
	
	public ContinuerVersCoursVocabulaireHabit (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
			action();
		
		
	}
	
	public void action()
	{
		VueCoursVocabulaire  vueCVAT = new VueCoursVocabulaire(m,m.getListeVocHabit());
		vueCVAT.update();
	}
}
