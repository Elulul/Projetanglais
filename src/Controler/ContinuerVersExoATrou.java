package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vue.VueConnexion;
import Vue.VueExoTexteATrou;
import anglais.Modele;

public class ContinuerVersExoATrou implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersExoATrou(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueExoTexteATrou vueEAT = new VueExoTexteATrou(m);
		vueEAT.update();
	}
	
	
}
