package ControlerVersCours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursRegleAsLike;
import Vuecours.VueCoursVocabulaireATable;
import anglais.Modele;

public class ContinuerVersCoursVocabulaireATable implements ActionListener{

	Modele m;
	Vue v;
	
	public ContinuerVersCoursVocabulaireATable (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursVocabulaireATable  vueCVAT = new VueCoursVocabulaireATable (m);
		vueCVAT.update();
	}
}
