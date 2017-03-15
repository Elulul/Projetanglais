package VuePageExo;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Vue.Vue;
import anglais.Modele;

public class VuePageExoVocCorrection extends JPanel implements Vue {
	
	Modele m;
	
	 ArrayList<ArrayList<Object>> Aafficher;
	 ArrayList<ArrayList<String>> ListeVoc;
	 Font f2 = new Font("Serif", Font.PLAIN, 20);
	
	public VuePageExoVocCorrection(Modele m,ArrayList<ArrayList<String>> ListeVoc,ArrayList<ArrayList<Object>> Aafficher){
		this.m = m;
		
		this.setLayout(null);
		
		this.Aafficher = Aafficher;
		this.ListeVoc = ListeVoc;
		
		 ArrayList<JLabel> tampon ;
		for(int i = 0; i <15 ; i ++){
			
			tampon = new ArrayList<JLabel>();
			if(Aafficher.get(i).get(0) instanceof JLabel){
				
				if(((JTextField) Aafficher.get(i).get(1)).getText().equals(ListeVoc.get(i).get(1))){
				
					tampon.add(0,new JLabel());
					tampon.add(1,new JLabel());
					
					
					tampon.get(0).setText(ListeVoc.get(i).get(0));
					tampon.get(0).setBounds(220, 40*i +40, 200, 20);
					tampon.get(0).setFont(f2);
					
					
					tampon.get(1).setText(((JTextField) Aafficher.get(i).get(1)).getText());
					tampon.get(1).setBounds(400, 40*i +40, 200, 20);
					 tampon.get(1).setFont(f2);
					tampon.get(1).setForeground(new Color(0,238,0));
					this.add(tampon.get(0));
					this.add(tampon.get(1));
					
				}
				
				else{
					
					tampon = new ArrayList<JLabel>();
					tampon.add(0,new JLabel());
					tampon.add(1,new JLabel());
					
					
					tampon.get(0).setText(ListeVoc.get(i).get(0));
					
					tampon.get(0).setBounds(220, 40*i +40, 200, 20);
					tampon.get(0).setFont(f2);
					
					 tampon.get(1).setText(((JTextField) Aafficher.get(i).get(1)).getText());
					tampon.get(1).setBounds(400, 40*i +40, 200, 20);
					 tampon.get(1).setFont(f2);
					tampon.get(1).setForeground(new Color(238,0,0));	
					
					this.add(tampon.get(0));
					this.add(tampon.get(1));
					
				}
			}
			else{
				
				if(((JTextField) Aafficher.get(i).get(0)).getText().equals(ListeVoc.get(i).get(0))){
					
					tampon = new ArrayList<JLabel>();
					tampon.add(0,new JLabel());
					tampon.add(1,new JLabel());
					
					
					tampon.get(0).setText(((JTextField) Aafficher.get(i).get(0)).getText());
					tampon.get(0).setBounds(220, 40*i +40, 200, 20);
					 tampon.get(0).setFont(f2);
					tampon.get(0).setForeground(new Color(0,238,0));	
					
					tampon.get(1).setText(ListeVoc.get(i).get(1));
					tampon.get(1).setBounds(400, 40*i +40, 200, 20);
					tampon.get(1).setFont(f2);
					
					this.add(tampon.get(0));
					this.add(tampon.get(1));
					
					
				}
				
				else{
					tampon =new  ArrayList<JLabel>();
					tampon.add(0,new JLabel());
					tampon.add(1,new JLabel());
					
					
					tampon.get(0).setText(((JTextField) Aafficher.get(i).get(0)).getText());
					tampon.get(0).setBounds(220, 40*i +40, 200, 20);
					tampon.get(0).setFont(f2);
					 tampon.get(0).setForeground(new Color(238,0,0));	
					
					tampon.get(1).setText(ListeVoc.get(i).get(1));
					tampon.get(1).setBounds(400, 40*i +40, 200, 20);
					tampon.get(1).setFont(f2);
					
					this.add(tampon.get(0));
					this.add(tampon.get(1));
					
					
				}
				
				
			}
			
		}
		
		
		
for(int i = 0; i <(ListeVoc.size()-15) ; i ++){
			
			tampon = new ArrayList<JLabel>();
			if(Aafficher.get(i+15).get(0) instanceof JLabel){
				
				if(((JTextField) Aafficher.get(i+15).get(1)).getText().equals(ListeVoc.get(i+15).get(1))){
				
					tampon.add(0,new JLabel());
					tampon.add(1,new JLabel());
					
					
					tampon.get(0).setText(ListeVoc.get(i+15).get(0));
					tampon.get(0).setBounds(700, 40*i +40, 200, 30);
					tampon.get(0).setFont(f2);
					
					
					tampon.get(1).setText(((JTextField) Aafficher.get(i+15).get(1)).getText());
					tampon.get(1).setBounds(880, i*40 + 40, 150, 30);
					 tampon.get(1).setFont(f2);
					tampon.get(1).setForeground(new Color(0,238,0));
					this.add(tampon.get(0));
					this.add(tampon.get(1));
					
				}
				
				else{
					
					tampon = new ArrayList<JLabel>();
					tampon.add(0,new JLabel());
					tampon.add(1,new JLabel());
					
					
					tampon.get(0).setText(ListeVoc.get(i+15).get(0));
					System.out.println(ListeVoc.get(i+15).get(0));
					tampon.get(0).setBounds(700, 40*i +40, 200, 30);
					tampon.get(0).setFont(f2);
					
					 tampon.get(1).setText(((JTextField) Aafficher.get(i+15).get(1)).getText());
					tampon.get(1).setBounds(880, i*40 + 40, 150, 30);
					 tampon.get(1).setFont(f2);
					tampon.get(1).setForeground(new Color(238,0,0));	
					
					this.add(tampon.get(0));
					this.add(tampon.get(1));
					
				}
			}
			else{
				
				if(((JTextField) Aafficher.get(i+15).get(0)).getText().equals(ListeVoc.get(i+15).get(0))){
					
					tampon = new ArrayList<JLabel>();
					tampon.add(0,new JLabel());
					tampon.add(1,new JLabel());
					
					
					tampon.get(0).setText(((JTextField) Aafficher.get(i+15).get(0)).getText());
					tampon.get(0).setBounds(700, 40*i +40, 200, 30);
					 tampon.get(0).setFont(f2);
					tampon.get(0).setForeground(new Color(0,238,0));	
					
					tampon.get(1).setText(ListeVoc.get(i+15).get(1));
					tampon.get(1).setBounds(880, i*40 + 40, 150, 30);
					tampon.get(1).setFont(f2);
					
					this.add(tampon.get(0));
					this.add(tampon.get(1));
					
					
				}
				
				else{
					tampon =new  ArrayList<JLabel>();
					tampon.add(0,new JLabel());
					tampon.add(1,new JLabel());
					
					
					tampon.get(0).setText(((JTextField) Aafficher.get(i+15).get(0)).getText());
					tampon.get(0).setBounds(700, 40*i +40, 200, 30);
					tampon.get(0).setFont(f2);
					 tampon.get(0).setForeground(new Color(238,0,0));	
					
					tampon.get(1).setText(ListeVoc.get(i+15).get(1));
					tampon.get(1).setBounds(880, i*40 + 40, 150, 30);
					tampon.get(1).setFont(f2);
					
					this.add(tampon.get(0));
					this.add(tampon.get(1));
					
					
				}
				
				
			}
			
		}
		
		
		
	}
	
	

	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
