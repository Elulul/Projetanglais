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
import ControlerVersPageExoVoltaire.ContinuerVersPageExoVoltaire2;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoltaireCorrection extends JPanel implements Vue {

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

		public VuePageExoVoltaireCorrection(Modele m,boolean trouve,boolean pasdefaute,boolean click){
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
			
			this.add(debut);
			this.add(motatrouver);
			this.add(fin);
			this.add(retour);
			this.add(next);
			
			next.setBounds(1000, 300, 100, 60);
			next.addActionListener(new ContinuerVersPageExoVoltaire2(m,this));
			
			retour.setBounds(20, 20, 80, 80);
			retour.addActionListener(new ContinuerVersPageExo(m,this));
			retour.setBorderPainted(false);
			
			
			debut.setText("I ");
			debut.setBounds(430, 300,20, 50);
			debut.setFont(f);
			
			
			motatrouver.setText("is");
			motatrouver.setBounds(450, 300,50, 50);
			motatrouver.setFont(f);
			
			
				
			
				if(click && pasdefaute){
					this.add(nofaute);
					nofaute.setText("There is no mistake in this sentence");
					nofaute.setBounds(480, 400,400, 50);
					nofaute.setFont(f2);
				}
				
				if(click && !pasdefaute){
					if(trouve){
						motatrouver.setForeground(new Color(0,238,0));
						this.add(nofaute);
						nofaute.setText("Congratulations ! You spotted the mistake");
						nofaute.setBounds(480, 400,400, 50);
						nofaute.setFont(f2);
					}
					else{
						motatrouver.setForeground(new Color(238,0,0));
						
						this.add(nofaute);
						nofaute.setText("The mistake was on the word 'is' which should be 'am'");
						nofaute.setBounds(430, 400,800, 50);
						nofaute.setFont(f2);
					}
				}
				
				
				if(!click && pasdefaute){
					this.add(nofaute);
					nofaute.setText("Congratulations ! There were no mistakes in the sentence");
					nofaute.setBounds(480, 400,400, 50);
					nofaute.setFont(f2);
				}
				
				if(!click && !pasdefaute){
				
						motatrouver.setForeground(new Color(238,0,0));
						this.add(nofaute);
						nofaute.setText("The mistake was on the word 'is' which should be 'am'");
						nofaute.setBounds(480, 400,800, 50);
						nofaute.setFont(f2);
					
				}
					
				
			
			
			fin.setText("sleeping in my room.");
			fin.setBounds(482, 300,350, 50);
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
