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
	boolean pasdefaute;
	boolean click;
	JLabel debut = new JLabel();
	JLabel motatrouver = new JLabel();
	JLabel fin = new JLabel();
	JLabel nofaute = new JLabel();
	Font f = new Font("Serif", Font.PLAIN, 36); 
	Font f2 = new Font("Serif", Font.PLAIN, 20); 
	
		public VuePageExoVoltaireCorrection(Modele m,boolean trouve,boolean pasdefaute,boolean click){
			this.m = m;
			this.trouve = trouve;
			this.pasdefaute = pasdefaute;
			this.click = click;
			
			this.setLayout(null);
			
			this.add(debut);
			this.add(motatrouver);
			this.add(fin);
			
			
			debut.setText("I ");
			debut.setBounds(450, 300,20, 50);
			debut.setFont(f);
			
			
			motatrouver.setText("is");
			motatrouver.setBounds(470, 300,50, 50);
			motatrouver.setFont(f);
			
			
				
			
				if(click && pasdefaute){
					this.add(nofaute);
					nofaute.setText("There is no mistake in this sentence");
					nofaute.setBounds(500, 400,400, 50);
					nofaute.setFont(f2);
				}
				
				if(click && !pasdefaute){
					if(trouve){
						motatrouver.setForeground(new Color(0,238,0));
						this.add(nofaute);
						nofaute.setText("Congratulation ! you find the mistake");
						nofaute.setBounds(500, 400,400, 50);
						nofaute.setFont(f2);
					}
					else{
						motatrouver.setForeground(new Color(238,0,0));
						
						this.add(nofaute);
						nofaute.setText("The mistake was on am");
						nofaute.setBounds(500, 400,400, 50);
						nofaute.setFont(f2);
					}
				}
				
					
				
			
			
			fin.setText("sleeping in my room.");
			fin.setBounds(502, 300,350, 50);
			fin.setFont(f);
			}
		
		
		public void update() {
			m.getFenetre().setContentPane(this);
			m.getFenetre().revalidate();
		}
}
