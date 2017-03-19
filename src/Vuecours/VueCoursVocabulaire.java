package Vuecours;

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

import Controler.ContinuerVersPageDaccueil;
import ControlerVersCours.ContinuerVersCours;
import Vue.Vue;
import anglais.Modele;

public class VueCoursVocabulaire extends JPanel implements Vue {
	
	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	ArrayList<ArrayList<String>> listeVoc = new  ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<JLabel>> listeVocAAfficher = new  ArrayList<ArrayList<JLabel>>();
	Font f2 = new Font("Serif", Font.PLAIN, 23);
	private BufferedImage image;

	public VueCoursVocabulaire(Modele m,ArrayList<ArrayList<String>> listeVoc) {
		this.m = m;
		
		this.iniListeVocAAfficher();
		
		this.setLayout(null);
		
		
		this.add(retour);
		
		try {
			 
	          image = ImageIO.read(new File("./images/coursVocab.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }

		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		
		this.listeVoc = listeVoc ;//m.getListeVocHabit();
		
		for (int i =0; i < 15;i++){
			listeVocAAfficher.get(i).get(0).setText(listeVoc.get(i).get(0) + " :");
			listeVocAAfficher.get(i).get(0).setBounds(150, 40*i +40, 300, 30);
			listeVocAAfficher.get(i).get(0).setFont(f2);
			listeVocAAfficher.get(i).get(0).setForeground(Color.blue);
			this.add(listeVocAAfficher.get(i).get(0));
			
			listeVocAAfficher.get(i).get(1).setText(listeVoc.get(i).get(1) );
			listeVocAAfficher.get(i).get(1).setBounds(450, 40*i +40, 200, 30);
			listeVocAAfficher.get(i).get(1).setFont(f2);
			listeVocAAfficher.get(i).get(1).setForeground(Color.magenta);
			this.add(listeVocAAfficher.get(i).get(1));
		}
		
		for (int i =0; i < (listeVoc.size()-15);i++){
			
			listeVocAAfficher.get(i +15).get(0).setText(listeVoc.get(i+15).get(0) + " :");
			listeVocAAfficher.get(i+15).get(0).setBounds(765, 40*i +40, 300, 30);
			listeVocAAfficher.get(i+15).get(0).setFont(f2);
			listeVocAAfficher.get(i+15).get(0).setForeground(Color.blue);
			this.add(listeVocAAfficher.get(i+15).get(0));
			
			listeVocAAfficher.get(i+15).get(1).setText(listeVoc.get(i+15).get(1) );
			listeVocAAfficher.get(i+15).get(1).setBounds(1100, 40*i +40, 400, 30);
			listeVocAAfficher.get(i+15).get(1).setFont(f2);
			listeVocAAfficher.get(i+15).get(1).setForeground(Color.magenta);
			this.add(listeVocAAfficher.get(i+15).get(1));
		}
		
		
	}
	
	
	
	
	
	public void iniListeVocAAfficher(){
		ArrayList<JLabel> tampon = new ArrayList<JLabel>();
		listeVocAAfficher = new  ArrayList<ArrayList<JLabel>>();
		for(int i = 0; i< 31 ; i++){
			tampon = new ArrayList<JLabel>();
			tampon.add(0,new JLabel());
			tampon.add(1,new JLabel());
			listeVocAAfficher.add(i,tampon);
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


