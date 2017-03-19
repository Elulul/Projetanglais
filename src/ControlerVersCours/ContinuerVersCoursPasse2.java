package ControlerVersCours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursPassé2;
import anglais.Modele;

public class ContinuerVersCoursPasse2 implements ActionListener{
	Modele m;
	Vue v;
	
	public ContinuerVersCoursPasse2 (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursPassé2 vueC = new VueCoursPassé2(m);
		vueC.update();
	}
	
}
