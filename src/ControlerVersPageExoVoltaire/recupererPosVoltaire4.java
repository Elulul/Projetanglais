package ControlerVersPageExoVoltaire;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Vue.Vue;
import VuePageExoVoltaire.VuePageExoVoltaireCorrection4;
import anglais.Modele;

public class recupererPosVoltaire4 implements MouseListener{

	Modele m;
	Vue v;
	boolean trouve;
	
	public recupererPosVoltaire4(Modele m, Vue v){
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
		
		

	
		
		
		System.out.println((m.appartientRect(45, 162, 9, 38, xa, ya)));
		
		trouve = m.aTrouverLaRepSansBoutton(false, (m.appartientRect(45, 162, 9, 38, xa, ya)),45, 162, 9, 38, xa, ya);

		
		VuePageExoVoltaireCorrection4 vueEATAL = new VuePageExoVoltaireCorrection4(m,trouve,false,true);// m.getyapasdefaute a faire
		vueEATAL.update();
	}
	
}
