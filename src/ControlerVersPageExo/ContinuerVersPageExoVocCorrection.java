package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Vue.Vue;
import VuePageExo.VuePageExoVocCorrection;
import anglais.Modele;

public class ContinuerVersPageExoVocCorrection implements ActionListener {

	
	Modele m;
	Vue v;
	ArrayList<String> resultat;
	 ArrayList<ArrayList<Object>> Aafficher;
	 ArrayList<ArrayList<String>> ListeVoc;
	
	public ContinuerVersPageExoVocCorrection(Modele m,Vue v,ArrayList<ArrayList<String>> ListeVoc,ArrayList<ArrayList<Object>> Aafficher){
		this.m = m;
		this.v = v;
		this.Aafficher = Aafficher;
		this.ListeVoc = ListeVoc;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		
		//faire resultat
		VuePageExoVocCorrection vueEATAL = new VuePageExoVocCorrection(m,ListeVoc,Aafficher);
		vueEATAL.update();
	}
}
