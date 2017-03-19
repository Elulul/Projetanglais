package ControlerVersPageExoVoltaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExoVoltaire.VuePageExoVoltaireCorrection;
import anglais.Modele;

public class ContinuerVersPageExoVoltaireCorrection implements ActionListener {

	
	Modele m;
	Vue v;
	
	boolean trouve;

	
	public ContinuerVersPageExoVoltaireCorrection(Modele m,Vue v){
		this.m = m;
		this.v= v;
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		
			trouve = m.aTrouverLaRepAvecBoutton(true);// true a modifier
		
		
		
		VuePageExoVoltaireCorrection vueEATAL = new VuePageExoVoltaireCorrection(m,trouve,false,false);
		vueEATAL.update();
	}
}
