package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCours;
import anglais.Modele;

public class ContinuerVersCours implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersCours(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCours vueC = new VueCours(m);
		vueC.update();
	}
}
