package VuePageExo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ControlerVersPageExo.ContinuerVersPageExo;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoc extends JPanel implements Vue {

	Modele m;
	
	ArrayList<ArrayList<Object>> aAfficher = new ArrayList<ArrayList<Object>>();
	ArrayList<ArrayList<String>> mot = new ArrayList<ArrayList<String>>();
	private JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	private BufferedImage image;

	public VuePageExoVoc (Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		try {
			 
	          image = ImageIO.read(new File("./images/motivation4.jpg"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		
		this.add(retour);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersPageExo(m,this));
		retour.setBorderPainted(false);
		mot = m.getListeVocATable();
		
		for(int i=0; i <15 ; i++){
			ArrayList<Object> tampon = new ArrayList<Object>();
			ArrayList<Double> choix = m.nbalea(15);
			if(choix.get(i)>0.5){
				tampon = new ArrayList<Object>();
				tampon.add(0,new JLabel());
				tampon.add(1,new JTextField());
				((JLabel) tampon.get(0)).setText(mot.get(i).get(0));
				this.add(((JLabel) tampon.get(0)));
				this.add(( JTextField) tampon.get(1));
				((JLabel) tampon.get(0)).setBounds(200, i*40 + 40, 100, 20);
				((JTextField) tampon.get(1)).setBounds(350, i*40 + 40, 100, 20);
			}
			
			else{
				tampon = new ArrayList<Object>();
				tampon.add(0,new JTextField());
				tampon.add(1,new JLabel());
				
				((JLabel) tampon.get(1)).setText(mot.get(i).get(1));
				this.add(((JLabel) tampon.get(1)));
				this.add(( JTextField) tampon.get(0));
				((JTextField) tampon.get(0)).setBounds(200, i*40 + 40, 100, 20);
				((JLabel) tampon.get(1)).setBounds(350, i*40 + 40, 100, 20);
			}
		}
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
