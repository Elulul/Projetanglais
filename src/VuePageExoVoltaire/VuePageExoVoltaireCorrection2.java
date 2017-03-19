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
import ControlerVersPageExoVoltaire.ContinuerVersPageExoVoltaire3;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoltaireCorrection2 extends JPanel implements Vue  {

	Modele m;
	boolean trouve;
	boolean pasdefaute;
	boolean click;
	private JButton retour= new JButton(new ImageIcon("./images/TestBack.png"));
	private JButton next = new JButton();
	JLabel debut = new JLabel();
	JLabel motatrouver = new JLabel();
	JLabel fin = new JLabel();
	JLabel nofaute = new JLabel();
	Font f = new Font("Serif", Font.PLAIN, 36); 
	Font f2 = new Font("Serif", Font.PLAIN, 20); 
	private BufferedImage image;

		public VuePageExoVoltaireCorrection2(Modele m,boolean trouve,boolean pasdefaute,boolean click){
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
			
			
			debut.setText("I ");
			debut.setBounds(450, 300,20, 50);
			debut.setFont(f);
			
			
			motatrouver.setText("am");
			motatrouver.setBounds(470, 300,50, 50);
			motatrouver.setFont(f);
			
			next.setText("Next");
			next.setBounds(1000, 650, 100, 60);
			next.addActionListener(new ContinuerVersPageExoVoltaire3(m,this));
				
			
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
						nofaute.setText("The mistake was on the word 'is' which should be 'am'");
						nofaute.setBounds(450, 400,800, 50);
						nofaute.setFont(f2);
					}
				}
				
				
				if(!click && pasdefaute){
					this.add(nofaute);
					nofaute.setText("Congratulations ! There were no mistakes in the sentence");
					nofaute.setBounds(500, 400,800, 50);
					nofaute.setFont(f2);
				}
				
				if(!click && !pasdefaute){
				
						motatrouver.setForeground(new Color(238,0,0));
						this.add(nofaute);
						nofaute.setText("The mistake was on the word 'is' which should be 'am'");
						nofaute.setBounds(500, 400,800, 50);
						nofaute.setFont(f2);
					
				}
					
				
			
			
			fin.setText("sleeping in my room.");
			fin.setBounds(522, 300,350, 50);
			fin.setFont(f);
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
