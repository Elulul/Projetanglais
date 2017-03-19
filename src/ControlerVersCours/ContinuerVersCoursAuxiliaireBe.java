package ControlerVersCours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursAuxiliaireBe;
import anglais.Modele;

public class ContinuerVersCoursAuxiliaireBe implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersCoursAuxiliaireBe (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursAuxiliaireBe vueC = new VueCoursAuxiliaireBe(m);
		vueC.update();
	}
	
}
