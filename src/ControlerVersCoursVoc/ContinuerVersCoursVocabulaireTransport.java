package ControlerVersCoursVoc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursVocabulaire;
import anglais.Modele;

public class ContinuerVersCoursVocabulaireTransport implements ActionListener {

	
	Modele m;
	Vue v;
	
	public ContinuerVersCoursVocabulaireTransport(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursVocabulaire  vueCVAT = new VueCoursVocabulaire(m,m.getListeVocTransport());
		vueCVAT.update();
	}
}
