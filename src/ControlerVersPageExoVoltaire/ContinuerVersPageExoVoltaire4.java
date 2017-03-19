package ControlerVersPageExoVoltaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExoVoltaire.VuePageExoVoltaire4;
import anglais.Modele;

public class ContinuerVersPageExoVoltaire4 implements ActionListener{

	Modele m;
	Vue v;
	
	public ContinuerVersPageExoVoltaire4(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoVoltaire4 vueEATAL = new VuePageExoVoltaire4(m);
		vueEATAL.update();
	}
	
	
}
