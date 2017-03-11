package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vue.VueConnexion;
import anglais.Modele;

public class ContinuerVersApp implements ActionListener {
	
	Modele m;
	Vue v;
	
	public ContinuerVersApp(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueConnexion vueCo = new VueConnexion(m);
		vueCo.update();
	}

}
