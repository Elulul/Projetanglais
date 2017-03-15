package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
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
		action();
		
	}
	
	public void action()
	{
		
		VuePageExoVoc2 vuePE = new VuePageExoVoc2(m,m.getListeVocAnimauxSauvage());
		vuePE.update();
	}
	
}
