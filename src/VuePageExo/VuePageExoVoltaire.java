package VuePageExo;

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
import ControlerVersPageExo.recupererPosVoltaire;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoltaire extends JPanel implements Vue{

	Modele m;
	String maphras = " I is sleeping in my room.";
	JLabel maphrase = new JLabel();
	private JButton retour= new JButton(new ImageIcon("./images/TestBack.png"));
	Font f = new Font("Serif", Font.PLAIN, 36); // par exemple 
	private BufferedImage image;

	 

	public VuePageExoVoltaire(Modele m){
		this.m = m;
		try {
			 
	          image = ImageIO.read(new File("./images/Voltaire.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		
		this.setLayout(null);
		
		this.add(retour);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersPageExo(m,this));
		retour.setBorderPainted(false);
		
		this.add(maphrase);
		maphrase.setText("I is sleeping in my room.");
		maphrase.setBounds(450, 300,800, 50);
		maphrase.setBackground(null);
		maphrase.addMouseListener(new recupererPosVoltaire(m,this));
		maphrase.setFont(f);
		}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
	
	public JLabel getmaphrase(){
		return this.maphrase;
	}
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
