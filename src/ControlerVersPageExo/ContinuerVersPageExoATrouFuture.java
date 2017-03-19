package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExo.VuePageExoATrouFuture;
import anglais.Modele;

public class ContinuerVersPageExoATrouFuture implements ActionListener{

	Modele m;
	Vue v;
	
	public ContinuerVersPageExoATrouFuture(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoATrouFuture vueEATAL = new VuePageExoATrouFuture(m);
		vueEATAL.update();
	}
	
	
}
