package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExo.VuePageExo;
import VuePageExo.VuePageExoATrou;
import anglais.Modele;

public class ContinuerVersPageExoATrou implements ActionListener {

	Modele m;
	Vue v;
	
	public   ContinuerVersPageExoATrou(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoATrou vuePEAT = new VuePageExoATrou(m);
		vuePEAT.update();
	}
	
}
