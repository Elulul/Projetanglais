package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import VuePageExo.VuePageExoVoltaire3;
import anglais.Modele;

public class ContinuerVersPageExoVoltaire3 implements ActionListener{


	Modele m;
	Vue v;
	
	public ContinuerVersPageExoVoltaire3(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExoVoltaire3 vueEATAL = new VuePageExoVoltaire3(m);
		vueEATAL.update();
	}
	
}
