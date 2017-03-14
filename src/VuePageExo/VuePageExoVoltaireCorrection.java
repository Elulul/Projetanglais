package VuePageExo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoltaireCorrection extends JPanel implements Vue {

	Modele m;
	boolean trouve;
	JLabel debut = new JLabel();
	JLabel motatrouver = new JLabel();
	JLabel fin = new JLabel();
	Font f = new Font("Serif", Font.PLAIN, 36); 
	
		public VuePageExoVoltaireCorrection(Modele m,boolean trouve){
			this.m = m;
			this.trouve = trouve;
			
			this.setLayout(null);
			
			this.add(debut);
			this.add(motatrouver);
			this.add(fin);
			
			debut.setText("I ");
			debut.setBounds(450, 300,20, 50);
			debut.setFont(f);
			
			
			motatrouver.setText("am");
			motatrouver.setBounds(470, 300,15, 50);
			motatrouver.setFont(f);
			
			if(trouve){
				motatrouver.setForeground(new Color(0,238,0));
			}
			else{
				motatrouver.setForeground(new Color(238,0,0));
			}
			
			fin.setText("sleeping in my room.");
			fin.setBounds(490, 300,15, 50);
			fin.setFont(f);
			
		}
}
