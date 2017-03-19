package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Vue.Vue;
import VuePageExo.VuePageExoTrouPasse;
import VuePageExo.VuePageExoTrouPasseCorrection;
import anglais.Modele;

public class ContinuerVersPageExoATrouPasseCorrection implements ActionListener {

	Modele m;
	Vue v;
	
	public  ContinuerVersPageExoATrouPasseCorrection (Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		
	
		ArrayList<String> reponse = new ArrayList<String>();
		// Liste de reponse
		reponse.add(0,((VuePageExoTrouPasse) v).phrase1scroll.getText());
		reponse.add(1,((VuePageExoTrouPasse) v).phrase2scroll.getText());
		reponse.add(2,((VuePageExoTrouPasse) v).phrase3scroll.getText());
		reponse.add(3,((VuePageExoTrouPasse) v).phrase4scroll.getText());
		reponse.add(4,((VuePageExoTrouPasse) v).phrase5scroll.getText());
		reponse.add(5,((VuePageExoTrouPasse) v).phrase6scroll.getText());
		reponse.add(6,((VuePageExoTrouPasse) v).phrase7scroll.getText());
		reponse.add(7,((VuePageExoTrouPasse) v).phrase8scroll.getText());
		reponse.add(8,((VuePageExoTrouPasse) v).phrase9scroll.getText());
		reponse.add(9,((VuePageExoTrouPasse) v).phrase10scroll.getText());
	
		
		
		
	
		
		
		ArrayList<ArrayList<Object>> reponseAAfficher = new ArrayList<ArrayList<Object>> ();
		reponseAAfficher = m.compareReponseExoATrou(reponse);
		
		VuePageExoTrouPasseCorrection vueEATALC = new VuePageExoTrouPasseCorrection(m,reponseAAfficher);
		vueEATALC.update();
	}
	
	
}
