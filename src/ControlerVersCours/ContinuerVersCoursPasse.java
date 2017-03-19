package ControlerVersCours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursPassé;
import anglais.Modele;

public class ContinuerVersCoursPasse implements ActionListener {

	Modele m;
	Vue v;
	
	public ContinuerVersCoursPasse (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursPassé vueC = new VueCoursPassé(m);
		vueC.update();
	}
	
}
