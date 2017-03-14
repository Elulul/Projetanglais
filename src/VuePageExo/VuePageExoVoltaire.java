package VuePageExo;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Controler.recupererPosVoltaire;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoltaire extends JPanel implements Vue{

	Modele m;
	String maphras = " I am sleeping in my room.";
	JLabel maphrase = new JLabel();
	
	Font f = new Font("Serif", Font.PLAIN, 36); // par exemple 

	 

	public VuePageExoVoltaire(Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(maphrase);
		
		maphrase.setText("I am sleeping in my room.");
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
}
