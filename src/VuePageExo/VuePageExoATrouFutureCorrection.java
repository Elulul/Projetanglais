package VuePageExo;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controler.ContinuerVersPageDaccueil;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoATrouFutureCorrection extends JPanel implements Vue {

Modele m;
	
	ArrayList<JLabel> reponseAAfficher = new ArrayList<JLabel>();
	ArrayList<JLabel> Correction = new ArrayList<JLabel>();
	
	private JLabel phrase1 = new JLabel();

	private JLabel phrase2 = new JLabel();

	private JLabel phrase3= new JLabel();

	private JLabel phrase4 = new JLabel();

	private JLabel phrase5= new JLabel();

	private JLabel phrase6 = new JLabel();

	private JLabel phrase7 = new JLabel();

	private JLabel phrase8 = new JLabel();

	private JLabel phrase9 = new JLabel();

	private JLabel phrase10 = new JLabel();

	private JButton retourAccueil = new JButton(new ImageIcon("./images/Home.png"));
	
	
	
	public VuePageExoATrouFutureCorrection (Modele m,ArrayList<ArrayList<Object>> reponse){
		this.initreponseAAfficher();
		this.initCorrection();
		this.m = m;
		
		this.setLayout(null);
		
		this.add(retourAccueil);
		
		this.add(phrase1);
		this.add(phrase2);
		this.add(phrase3);
		this.add(phrase4);
		this.add(phrase5);
		this.add(phrase6);
		this.add(phrase7);
		this.add(phrase8);
		this.add(phrase9);
		this.add(phrase10);
		
		
		phrase1.setText("1. Tony a friend tomorrow.(meet) . ");
		phrase1.setBounds(25, 25,1200, 40);
		
		phrase2.setText("2. I think it  soon.(snow) ");
		phrase2.setBounds(25, 75, 1200, 35);
		

		phrase3.setText("3. Perhaps I New York one day.(visit) ");
		phrase3.setBounds(25, 125, 1200, 35);
		
	
		phrase4.setText("4. What time  tomorrow?(leave/you) ");
		phrase4.setBounds(25, 175, 1200, 35);
		
		phrase5.setText("5. Who the next World Cup? (win) ");
		phrase5.setBounds(25, 225, 1200, 35);
		
	
		phrase6.setText("6. I'm sure you  the exam next week. (not fail) ");
		phrase6.setBounds(25, 275, 1200, 35);
		
		
		phrase7.setText("7. I my parents at the week-end. (visit) ");
		phrase7.setBounds(25, 325, 1200, 35);
		
		phrase8.setText("8. Don't touch that dog. It you. (bite) ");
		phrase8.setBounds(25, 375, 1200, 35);

		phrase9.setText("9. They for a meal tonight.(come) ");
		phrase9.setBounds(25, 425, 1200, 35);

		phrase10.setText("10. Look at those clouds, it .(rain)  ");
		phrase10.setBounds(25, 475, 1200, 35);
		

	
		for(int i =0 ; i < reponse.size();i++){
			if((boolean) reponse.get(i).get(0)){
				reponseAAfficher.get(i).setText((String )reponse.get(i).get(1));
				reponseAAfficher.get(i).setForeground(new Color(0,238,0));
				this.add(reponseAAfficher.get(i));
				reponseAAfficher.get(i).setBounds(800,50*i + 35, 100, 20);
			}
			
			
			else{
				reponseAAfficher.get(i).setText((String) reponse.get(i).get(1));
				reponseAAfficher.get(i).setForeground(new Color(238,0,0));
				this.add(reponseAAfficher.get(i));
				reponseAAfficher.get(i).setBounds(800,50*i +35 , 100, 20);
				Correction.get(i).setText((i+1)+"."+ "Good answer :"+ m.CorrectionExoATrouFuture.get(i));
				this.add(Correction.get(i));
				Correction.get(i).setBounds(1000,50*i + 35,400,20 );
			}
	
		
		}
		

		retourAccueil.setBounds(1000, 600, 80, 79);
		retourAccueil.addActionListener(new ContinuerVersPageDaccueil(m,this));
	
	}
	
	
	
	
	public void initreponseAAfficher(){
		for (int i =0; i <10 ; i++){
			reponseAAfficher.add(new JLabel());
			
		}
	}
	
	public void initCorrection(){
		for (int i =0; i <10 ; i++){
			Correction.add(new JLabel());
			
		}
	}
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
	
	
}
