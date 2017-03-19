package ControlerVersPageExoVoltaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExoVoltaire.VuePageExoVoltaire;
import anglais.Modele;

public class ContinuerVersPageExoVoltaire implements ActionListener{

	Modele m;
	Vue v;
	
	public ContinuerVersPageExoVoltaire(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoVoltaire vueEATAL = new VuePageExoVoltaire(m);
		vueEATAL.update();
	}
}
