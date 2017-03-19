package ControlerVersPageExoVoltaire;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExoVoltaire.VuePageExoVoltaireCorrection4;
import anglais.Modele;

public class ContinuerVersPageExoVoltaireCorrection4 implements ActionListener {

	Modele m;
	Vue v;
	
	boolean trouve;

	
	public ContinuerVersPageExoVoltaireCorrection4(Modele m,Vue v){
		this.m = m;
		this.v= v;
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		
			trouve = m.aTrouverLaRepAvecBoutton(true);// true a modifier
		
		
		
		VuePageExoVoltaireCorrection4 vueEATAL = new VuePageExoVoltaireCorrection4(m,trouve,false,false);
		vueEATAL.update();
	}
	
}
