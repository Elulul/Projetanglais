package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vue.VueAide;
import Vue.VuePageExo;
import anglais.Modele;

public class ContinuerVersPageExo implements ActionListener {

	Modele m;
	Vue v;
	
	public  ContinuerVersPageExo(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VuePageExo vuePE = new VuePageExo(m);
		vuePE.update();
	}

	
	
}
