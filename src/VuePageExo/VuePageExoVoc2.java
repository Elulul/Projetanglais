package VuePageExo;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ControlerVersCours.ContinuerVersCours;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoVoc2 extends JPanel implements Vue {

	Modele m;
	JButton retour = new JButton();
	ArrayList<ArrayList<String>> listeVoc = new  ArrayList<ArrayList<String>>();
	ArrayList<ArrayList<Object>> listeVocAAfficher = new  ArrayList<ArrayList<Object>>();
	ArrayList<Double> choix = m.nbalea(30); ;
	Font f2 = new Font("Serif", Font.PLAIN, 20);
	
	public VuePageExoVoc2(Modele m,ArrayList<ArrayList<String>> listeVoc) {
		this.m = m;
		
		
		
		this.setLayout(null);
		
		
		this.add(retour);
		
		
		retour.setText("Practice");
		retour.setBounds(20, 20, 138, 36);
		retour.addActionListener(new ContinuerVersCours(m,this));
		
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
				((JLabel) tampon.get(0)).setBounds(220, 40*i +40, 200, 20);
				((JLabel) tampon.get(0)).setBounds(220, 40*i +40, 200, 20);
				((JTextField) tampon.get(1)).setFont(f2);
			}
			
			else{
				tampon = new ArrayList<Object>();
				tampon.add(0,new JTextField());
				tampon.add(1,new JLabel());
				
				((JLabel) tampon.get(1)).setText(listeVoc.get(i).get(1));
				this.add(((JLabel) tampon.get(1)));
				this.add(( JTextField) tampon.get(0));
				((JTextField) tampon.get(0)).setBounds(220, 40*i +40, 200, 20);
				((JLabel) tampon.get(1)).setBounds(400, i*40 + 40, 200, 20);
				((JLabel) tampon.get(1)).setFont(f2);
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
				((JLabel) tampon.get(0)).setBounds(665, 40*i +40, 200, 20);
				((JLabel) tampon.get(0)).setFont(f2);
				((JTextField) tampon.get(1)).setBounds(845, i*40 + 40, 100, 20);
			}
			
			else{
				tampon = new ArrayList<Object>();
				tampon.add(0,new JTextField());
				tampon.add(1,new JLabel());
				
				((JLabel) tampon.get(1)).setText(listeVoc.get(i+15).get(1));
				this.add(((JLabel) tampon.get(1)));
				this.add(( JTextField) tampon.get(0));
				((JTextField) tampon.get(0)).setBounds(665, 40*i +40, 200, 20);
				((JTextField) tampon.get(0)).setFont(f2);
				((JLabel) tampon.get(1)).setBounds(850, i*40 + 40, 200, 20);
			}
			
		
		}
		
		
	}
	
	
	
	
	

	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	
}
}