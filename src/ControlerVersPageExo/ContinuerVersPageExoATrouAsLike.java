package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vue.VueConnexion;
import VuePageExo.VuePageExoATrouAsLike;
import anglais.Modele;

public class ContinuerVersPageExoATrouAsLike implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersPageExoATrouAsLike(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoATrouAsLike vueEATAL = new VuePageExoATrouAsLike(m);
		vueEATAL.update();
	}
	
	
}
