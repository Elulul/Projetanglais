package ControlerVersPageExoVoltaire;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Vue.Vue;
import VuePageExoVoltaire.VuePageExoVoltaireCorrection3;
import anglais.Modele;

public class recupererPosVoltaire3 implements MouseListener {

	Modele m;
	Vue v;
	boolean trouve;
	
	public recupererPosVoltaire3(Modele m, Vue v){
		this.v = v;
		this.m = m;
	}
	
	public void mouseClicked(MouseEvent arg0) {
		action(arg0);
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void action(MouseEvent arg0){
		System.out.println(arg0.getX());
		System.out.println(arg0.getY());
		int xa = arg0.getX();
		int ya = arg0.getY();
		
		
		
	
		
		
		System.out.println((m.appartientRect(298, 367, 15, 43, xa, ya)));
		
		trouve = m.aTrouverLaRepSansBoutton(false, (m.appartientRect(298, 367, 15, 43, xa, ya)), 298, 367, 15, 43, xa, ya);

		
		VuePageExoVoltaireCorrection3 vueEATAL = new VuePageExoVoltaireCorrection3(m,trouve,false,true);// m.getyapasdefaute a faire
		vueEATAL.update();
	}
	
}
