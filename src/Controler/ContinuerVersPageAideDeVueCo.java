package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vue.VueAide;
import anglais.Modele;

public class ContinuerVersPageAideDeVueCo implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersPageAideDeVueCo(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueAide vueA = new VueAide(m);
		vueA.update();
	}

	
}
