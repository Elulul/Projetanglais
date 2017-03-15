package ControlerVersPageExo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Vue.Vue;
import VuePageExo.VuePageExoATrouAsLike;
import VuePageExo.VuePageExoATrouAsLikeCorrection;
import anglais.Modele;

public class ContinuerVersPageExoATrouAsLikeCorrection implements ActionListener {

	Modele m;
	Vue v;
	
	public  ContinuerVersPageExoATrouAsLikeCorrection(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		action();
		
	}
	
	public void action()
	{
		
		ArrayList<ArrayList<Object>> reponse = new ArrayList<ArrayList<Object>>();
		ArrayList<Object> tampon = new ArrayList<Object>();
		// Liste de reponse
		tampon.add(0, ((VuePageExoATrouAsLike) v).getPhrase1scroll().getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).getPhrase1scroll().getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).getPhrase1scroll().getY());
		reponse.add(0, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase2scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase2scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase2scroll.getY());
		reponse.add(1, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase3scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase3scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase3scroll.getY());
		reponse.add(2, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase4scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase4scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase4scroll.getY());
		reponse.add(3, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase5scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase5scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase5scroll.getY());
		reponse.add(4, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase6scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase6scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase6scroll.getY());
		reponse.add(5, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase7scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase7scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase7scroll.getY());
		reponse.add(6, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase8scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase8scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase8scroll.getY());
		reponse.add(7, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase9scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase9scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase9scroll.getY());
		reponse.add(8, tampon);
		
		tampon = new ArrayList<Object>();
		tampon.add(0, ((VuePageExoATrouAsLike) v).phrase10scroll.getSelectedItem() );
		tampon.add(1, ((VuePageExoATrouAsLike) v).phrase10scroll.getX());
		tampon.add(2, ((VuePageExoATrouAsLike) v).phrase10scroll.getY());
		reponse.add(9, tampon);
		
	
		
		
		ArrayList<ArrayList<Object>> reponseAAfficher = new ArrayList<ArrayList<Object>> ();
		reponseAAfficher = m.compareReponseExoATrouAsLike(reponse);
		
		VuePageExoATrouAsLikeCorrection vueEATALC = new VuePageExoATrouAsLikeCorrection(m,reponseAAfficher);
		vueEATALC.update();
	}
	
	
}
