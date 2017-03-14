package VuePageExo;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Vue.Vue;
import anglais.Modele;

public class VuePageExoVocATable extends JPanel implements Vue {

	Modele m;
	
	ArrayList<ArrayList<Object>> aAfficher = new ArrayList<ArrayList<Object>>();
	ArrayList<ArrayList<String>> mot = new ArrayList<ArrayList<String>>();
	
	public VuePageExoVocATable (Modele m){
		this.m = m;
		
		this.setLayout(null);
		
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
				((JLabel) tampon.get(0)).setBounds(20, i*40 + 40, 100, 20);
				((JTextField) tampon.get(1)).setBounds(150, i*40 + 40, 100, 20);
			}
			
			else{
				tampon = new ArrayList<Object>();
				tampon.add(0,new JTextField());
				tampon.add(1,new JLabel());
				
				((JLabel) tampon.get(1)).setText(mot.get(i).get(1));
				this.add(((JLabel) tampon.get(1)));
				this.add(( JTextField) tampon.get(0));
				((JTextField) tampon.get(0)).setBounds(20, i*40 + 40, 100, 20);
				((JLabel) tampon.get(1)).setBounds(150, i*40 + 40, 100, 20);
			}
		}
	}
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
