package ControlerVersCours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursAnA;
import anglais.Modele;

public class ContinuerVersCoursAnA implements ActionListener{
	Modele m;
	Vue v;
	
	public ContinuerVersCoursAnA(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursAnA vueC = new VueCoursAnA(m);
		vueC.update();
	}
	
	
}
