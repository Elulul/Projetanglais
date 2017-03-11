package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import Vue.Vue;
import Vue.VueNouvelUtilisateur;
import Vue.VuePrincipale;
import anglais.Modele;

public class CreerNouvelUtilisateur implements ActionListener {

	Modele m;
	Vue v;
	
	public CreerNouvelUtilisateur(Modele m,Vue v){
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
		
		
		boolean b = m.Nouvelutilisateur(((VueNouvelUtilisateur) v).getTxtNomUtilisateur(),((VueNouvelUtilisateur) v).getMdp());
		if(b){
			VuePrincipale vueP = new VuePrincipale(m);
			vueP.update();
		}
		else{
			JOptionPane.showMessageDialog(null, "This user name is already used");
		}
	}

	
}


