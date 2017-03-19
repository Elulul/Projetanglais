package ControlerVersPageExoVoltaire;

import java.awt.event.ActionEvent;

import Vue.Vue;
import VuePageExoVoltaire.VuePageExoVoltaireCorrection3;
import anglais.Modele;

public class ContinuerVersPageExoVoltaireCorrection3 {

	Modele m;
	Vue v;
	
	boolean trouve;

	
	public ContinuerVersPageExoVoltaireCorrection3(Modele m,Vue v){
		this.m = m;
		this.v= v;
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		
			trouve = m.aTrouverLaRepAvecBoutton(true);// true a modifier
		
		
		
		VuePageExoVoltaireCorrection3 vueEATAL = new VuePageExoVoltaireCorrection3(m,trouve,false,false);
		vueEATAL.update();
	}
	
}
