package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import Vue.Vue;
import Vue.VueAide;
import Vue.VueConnexion;
import Vue.VueNouvelUtilisateur;
import Vue.VuePrincipale;
import anglais.Modele;

public class SeConnecter implements ActionListener {

	Modele m;
	Vue v;
	
	public SeConnecter(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		try {
			action();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void action() throws IOException
	{
		
		boolean b = m.Connexion(((VueConnexion) v).getTxtNomUtilisateur(),((VueConnexion) v).getMdp());
		if(b){
			VuePrincipale vueP = new VuePrincipale(m);
			vueP.update();
		}
		else{
			JOptionPane.showMessageDialog(null, "Username or password is incorrect.Please try logging in again.");
		}
		
	}

	
}
