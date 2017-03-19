package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Vue.Vue;
import VuePageExo.VuePageExoATrouFuture;
import VuePageExo.VuePageExoATrouFutureCorrection;
import VuePageExo.VuePageExoTrouPasse;
import anglais.Modele;

public class ContinuerVersPageExoATrouFutureCorrection implements ActionListener{


	Modele m;
	Vue v;
	
	public  ContinuerVersPageExoATrouFutureCorrection (Modele m,Vue v){
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
		reponse.add(0,((VuePageExoATrouFuture) v).phrase1scroll.getText());
		reponse.add(1,((VuePageExoATrouFuture) v).phrase2scroll.getText());
		reponse.add(2,((VuePageExoATrouFuture) v).phrase3scroll.getText());
		reponse.add(3,((VuePageExoATrouFuture) v).phrase4scroll.getText());
		reponse.add(4,((VuePageExoATrouFuture) v).phrase5scroll.getText());
		reponse.add(5,((VuePageExoATrouFuture) v).phrase6scroll.getText());
		reponse.add(6,((VuePageExoATrouFuture) v).phrase7scroll.getText());
		reponse.add(7,((VuePageExoATrouFuture) v).phrase8scroll.getText());
		reponse.add(8,((VuePageExoATrouFuture) v).phrase9scroll.getText());
		reponse.add(9,((VuePageExoATrouFuture) v).phrase10scroll.getText());
	
		
		
		
	
		
		
		ArrayList<ArrayList<Object>> reponseAAfficher = new ArrayList<ArrayList<Object>> ();
		reponseAAfficher = m.compareReponseExoATrouFuture(reponse);
		
		VuePageExoATrouFutureCorrection vueEATALC = new VuePageExoATrouFutureCorrection(m,reponseAAfficher);
		vueEATALC.update();
	}
	
}
