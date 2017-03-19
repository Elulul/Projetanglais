package ControlerVersCours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursFuture;
import anglais.Modele;

public class ContinuerVersCoursFuture implements ActionListener{

	Modele m;
	Vue v;
	
	public  ContinuerVersCoursFuture (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursFuture vueC = new VueCoursFuture(m);
		vueC.update();
	}
	
}
