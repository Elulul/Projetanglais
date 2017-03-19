package ControlerVersPageExoVoltaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExoVoltaire.VuePageExoVoltaire2;
import anglais.Modele;

public class ContinuerVersPageExoVoltaire2 implements ActionListener{


	Modele m;
	Vue v;
	
	public ContinuerVersPageExoVoltaire2 (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoVoltaire2 vueEATAL = new VuePageExoVoltaire2(m);
		vueEATAL.update();
	}
	
}
