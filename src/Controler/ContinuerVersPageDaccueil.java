package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vue.VueAide;
import Vue.VuePrincipale;
import anglais.Modele;

public class ContinuerVersPageDaccueil implements ActionListener {

	Modele m;
	Vue v;
	
	public  ContinuerVersPageDaccueil(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePrincipale vueP = new VuePrincipale(m);
		vueP.update();
	}

	
}
