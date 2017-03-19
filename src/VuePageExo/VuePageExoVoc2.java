package VuePageExo;

import java.awt.Color;
import java.awt.Font;
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
import ControlerVersPageExo.ContinuerVersPageExoVocCorrection;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoc2 extends JPanel implements Vue {

	Modele m;
	private JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JButton valider = new JButton(new ImageIcon("./images/Validate.png"));
	ArrayList<ArrayList<String>> listeVoc = new  ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<Object>> listeVocAAfficher = new  ArrayList<ArrayList<Object>>();
	ArrayList<Double> choix = new ArrayList<Double>();
	Font f2 = new Font("Serif", Font.BOLD, 22);
	private BufferedImage image;

	
	public VuePageExoVoc2(Modele m,ArrayList<ArrayList<String>> listeVoc) {
		this.m = m;
		
		choix = m.nbalea(30); 
		
		this.setLayout(null);

		try {
			 
	          image = ImageIO.read(new File("./images/vocab.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		
		this.add(retour);
		this.add(valider);
		
		valider.setBounds(1080, 640, 160, 45);
		valider.addActionListener( new ContinuerVersPageExoVocCorrection(m,this,listeVoc,listeVocAAfficher));
		
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersPageExo(m,this));
		retour.setBorderPainted(false);
		
		this.listeVoc = listeVoc ;//m.getListeVocHabit();
		
		
		ArrayList<Object> tampon = new ArrayList<Object>();
		for (int i =0; i < 15;i++){ 
			
			if(choix.get(i)>0.5){
				tampon = new ArrayList<Object>();
				tampon.add(0,new JLabel());
				tampon.add(1,new JTextField());
			
				((JLabel) tampon.get(0)).setText(listeVoc.get(i).get(0) + " :");
				this.add(((JLabel) tampon.get(0)));
				this.add(( JTextField) tampon.get(1));
				((JLabel) tampon.get(0)).setBounds(150, 40*i +40, 300, 30);
				((JLabel) tampon.get(0)).setFont(f2);
				((JLabel) tampon.get(0)).setForeground(Color.white);
				((JTextField) tampon.get(1)).setBounds(450, 40*i +40, 150, 30);
				((JTextField) tampon.get(1)).setOpaque(false);
				((JTextField) tampon.get(1)).setForeground(Color.white);
				listeVocAAfficher.add(i,tampon);
			}
			
			else{
				tampon = new ArrayList<Object>();
				tampon.add(0,new JTextField());
				tampon.add(1,new JLabel());
				
				((JLabel) tampon.get(1)).setText(listeVoc.get(i).get(1));
				this.add(((JLabel) tampon.get(1)));
				this.add(( JTextField) tampon.get(0));
				((JTextField) tampon.get(0)).setBounds(150, 40*i +40, 150, 30);
				((JTextField) tampon.get(0)).setOpaque(false);
				((JTextField) tampon.get(0)).setForeground(Color.white);
				((JLabel) tampon.get(1)).setBounds(450, i*40 + 40, 300, 30);
				((JLabel) tampon.get(1)).setFont(f2);
				((JLabel) tampon.get(1)).setForeground(Color.white);
				listeVocAAfficher.add(i,tampon);
			}
			
			
		
		}
		
		for (int i =0; i < (listeVoc.size()-15);i++){
			
			if(choix.get(i+15)>0.5){
				tampon = new ArrayList<Object>();
				tampon.add(0,new JLabel());
				tampon.add(1,new JTextField());
			
				((JLabel) tampon.get(0)).setText(listeVoc.get(i+15).get(0) + " :");
				this.add(((JLabel) tampon.get(0)));
				this.add(( JTextField) tampon.get(1));
				((JLabel) tampon.get(0)).setBounds(700, 40*i +40, 400, 30);
				((JLabel) tampon.get(0)).setFont(f2);
				((JLabel) tampon.get(0)).setForeground(Color.white);
				((JTextField) tampon.get(1)).setBounds(1000, i*40 + 40, 150, 30);
				((JTextField) tampon.get(1)).setOpaque(false);
				((JTextField) tampon.get(1)).setForeground(Color.white);
				listeVocAAfficher.add(i+15,tampon);
			}
			
			else{
				tampon = new ArrayList<Object>();
				tampon.add(0,new JTextField());
				tampon.add(1,new JLabel());
				
				((JLabel) tampon.get(1)).setText(listeVoc.get(i+15).get(1));
				this.add(((JLabel) tampon.get(1)));
				this.add(( JTextField) tampon.get(0));
				((JTextField) tampon.get(0)).setBounds(700, 40*i +40, 150, 30);
				((JTextField) tampon.get(0)).setOpaque(false);
				((JTextField) tampon.get(0)).setForeground(Color.white);
				((JLabel) tampon.get(1)).setFont(f2);
				((JLabel) tampon.get(1)).setForeground(Color.white);
				((JLabel) tampon.get(1)).setBounds(1000, i*40 + 40, 400, 30);
				listeVocAAfficher.add(i+15,tampon);
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