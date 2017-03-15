package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExo.VuePageExoVocATable;
import anglais.Modele;

public class ContinuerVersPageExoVocATable implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersPageExoVocATable(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoVocATable vueEATAL = new VuePageExoVocATable(m);
		vueEATAL.update();
	}
	
}
