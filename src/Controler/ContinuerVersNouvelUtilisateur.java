package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vue.Vue;
import Vue.VueNouvelUtilisateur;
import anglais.Modele;

public class ContinuerVersNouvelUtilisateur implements ActionListener{

	Modele m;
	Vue v;
	
	public ContinuerVersNouvelUtilisateur(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		VueNouvelUtilisateur vueNU = new VueNouvelUtilisateur(m);
		vueNU.update();
	}
	
}
