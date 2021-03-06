package VuePageExoVoltaire;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ControlerVersPageExo.ContinuerVersPageExo;
import ControlerVersPageExoVoltaire.ContinuerVersPageExoVoltaire4;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoltaireCorrection3 extends JPanel implements Vue{

	Modele m;
	boolean trouve;
	boolean pasdefaute;
	boolean click;
	private JButton retour= new JButton(new ImageIcon("./images/TestBack.png"));
	private JButton next = new JButton(new ImageIcon("./images/next.png"));
	JLabel debut = new JLabel();
	JLabel motatrouver = new JLabel();
	JLabel fin = new JLabel();
	JLabel nofaute = new JLabel();
	Font f = new Font("Serif", Font.PLAIN, 36); 
	Font f2 = new Font("Serif", Font.PLAIN, 20); 
	private BufferedImage image;

		public VuePageExoVoltaireCorrection3(Modele m,boolean trouve,boolean pasdefaute,boolean click){
			this.m = m;
			this.trouve = trouve;
			this.pasdefaute = pasdefaute;
			this.click = click;
			
			this.setLayout(null);
			
			try {
				 
		          image = ImageIO.read(new File("./images/Voltaire.png"));
		          
		    	  
		       } catch (IOException ex) {
		    	   ex.printStackTrace();
		       }
			this.add(next);
			this.add(debut);
			this.add(motatrouver);
			this.add(fin);
			this.add(retour);
			retour.setBounds(20, 20, 80, 80);
			retour.addActionListener(new ContinuerVersPageExo(m,this));
			retour.setBorderPainted(false);
			
			
			debut.setText("When I was young, I ");
			debut.setBounds(450, 300,400, 50);
			debut.setFont(f);
			
			
			motatrouver.setText("use");
			motatrouver.setBounds(750, 300,100, 50);
			motatrouver.setFont(f);
			
			fin.setText("to sleep alone.");
			fin.setBounds(805, 300,350, 50);
			fin.setFont(f);
			
			next.setBounds(1000, 300, 100, 60);
			next.addActionListener(new ContinuerVersPageExoVoltaire4(m,this));
				
			
				if(click && pasdefaute){
					this.add(nofaute);
					nofaute.setText("There were no mistakes in this sentence");
					nofaute.setBounds(500, 400,400, 50);
					nofaute.setFont(f2);
				}
				
				if(click && !pasdefaute){
					if(trouve){
						motatrouver.setForeground(new Color(0,238,0));
						this.add(nofaute);
						nofaute.setText("Congratulations ! You spotted the mistake");
						nofaute.setBounds(500, 400,400, 50);
						nofaute.setFont(f2);
					}
					else{
						motatrouver.setForeground(new Color(238,0,0));
						
						this.add(nofaute);
						nofaute.setText("The mistake was on the word 'use' which should be 'used'");
						nofaute.setBounds(450, 400,800, 50);
						nofaute.setFont(f2);
					}
				}
				
				
				if(!click && pasdefaute){
					this.add(nofaute);
					nofaute.setText("Congratulations ! There were no mistakes in the sentence");
					nofaute.setBounds(500, 400,400, 50);
					nofaute.setFont(f2);
				}
				
				if(!click && !pasdefaute){
				
						motatrouver.setForeground(new Color(238,0,0));
						this.add(nofaute);
						nofaute.setText("The mistake was on the word 'use' which should be 'used'");
						nofaute.setBounds(500, 400,800, 50);
						nofaute.setFont(f2);
					
				}
					
				
			
			
		
			}
		
		
		public void update() {
			m.getFenetre().setContentPane(this);
			m.getFenetre().revalidate();
		}
		
		protected void paintComponent(Graphics g) {
	        super.paintComponent(g); 
	        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
	    }
	
}
