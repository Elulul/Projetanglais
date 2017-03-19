package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExo.VuePageExoTrouPasse;
import anglais.Modele;

public class ContinuerVersPageExoATrouPasse implements ActionListener{

	Modele m;
	Vue v;
	
	public ContinuerVersPageExoATrouPasse(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoTrouPasse vueEATAL = new VuePageExoTrouPasse(m);
		vueEATAL.update();
	}
	
	
}
