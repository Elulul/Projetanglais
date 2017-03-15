package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExo.VuePageExo;
import VuePageExo.VuePageExoVoc2;
import anglais.Modele;

public class ContinuerVersPageExoVoc implements ActionListener{

	Modele m;
	Vue v;
	
	public  ContinuerVersPageExoVoc(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action(e);
		
	}
	
	public void action(ActionEvent e)
	{
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireAnimauxSauvage())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocAnimauxSauvage());
			vuePE.update();
		}
		
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireBricolage())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeBricolage());
			vuePE.update();
		}
		
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireCalendrier())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocCalendrier());
			vuePE.update();
		}
		
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireHabit())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocHabit());
			vuePE.update();
		}
		

		if(e.getSource().equals(((VuePageExo) v).getVocabulaireMaterielInformatique())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocMaterielinformatique());
			vuePE.update();
		}
		
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireNourriture())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocNourriture());
			vuePE.update();
		}
		
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireNourritureSuite())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocNourritureSuite());
			vuePE.update();
		}
		
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireSentiment())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocSentiment());
			vuePE.update();
		}
		
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireSport())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocSport());
			vuePE.update();
		}
		
		if(e.getSource().equals(((VuePageExo) v).getVocabulaireTransport())){
			VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocTransport());
			vuePE.update();
		}
	}
	
}
