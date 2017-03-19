package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExo.VuePageExoVoltaireCorrection2;
import anglais.Modele;

public class ContinuerVersPageExoVoltaireCorrection2 implements ActionListener {


	Modele m;
	Vue v;
	
	boolean trouve;

	
	public ContinuerVersPageExoVoltaireCorrection2 (Modele m,Vue v){
		this.m = m;
		this.v= v;
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		
			trouve = m.aTrouverLaRepAvecBoutton(true);// true a modifier
		
		
		
		VuePageExoVoltaireCorrection2 vueEATAL = new VuePageExoVoltaireCorrection2(m,trouve,true,false);
		vueEATAL.update();
	}
	
}
