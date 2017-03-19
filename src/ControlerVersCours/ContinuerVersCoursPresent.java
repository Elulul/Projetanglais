package ControlerVersCours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursPresent;
import anglais.Modele;

public class ContinuerVersCoursPresent implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersCoursPresent(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursPresent vueC = new VueCoursPresent(m);
		vueC.update();
	}
	
	
}
