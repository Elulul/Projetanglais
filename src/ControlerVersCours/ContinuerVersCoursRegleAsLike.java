package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vuecours.VueCoursRegleAsLike;
import anglais.Modele;

public class ContinuerVersCoursRegleAsLike implements ActionListener {

	
	Modele m;
	Vue v;
	
	public ContinuerVersCoursRegleAsLike(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueCoursRegleAsLike vueCRAS = new VueCoursRegleAsLike(m);
		vueCRAS.update();
	}
}
