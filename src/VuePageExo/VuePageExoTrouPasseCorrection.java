package VuePageExo;

import java.awt.Color;
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
import Vue.Vue;
import anglais.Modele;

public class VuePageExoTrouPasseCorrection extends JPanel implements Vue {

Modele m;
	private BufferedImage image;
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
	
	
	
	public VuePageExoTrouPasseCorrection (Modele m,ArrayList<ArrayList<Object>> reponse){
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
		
		phrase1.setText("1. Sonia (be) the most beautiful girl in my campus. ");
		phrase1.setBounds(25, 25,1200, 40);
		
		
		phrase2.setText("2. Look at the door! Tom (open) it now.");
		phrase2.setBounds(25, 75, 1200, 35);
		
		

		phrase3.setText("3. I (run) as soon as they told me so. ");
		phrase3.setBounds(25, 125, 1200, 35);
	
		
	
		phrase4.setText("4. Koffi and Mary (win) National cup of Tennis two months ago.");
		phrase4.setBounds(25, 175, 1200, 35);
		
	
		phrase5.setText("5. We (never swim) in the Pacific Ocean.");
		phrase5.setBounds(25, 225, 1200, 35);
		
		
	
		phrase6.setText("6. Joe didn't go to Germany with USA football team.He wishes he (be) their goalkeeper.");
		phrase6.setBounds(25, 275, 1200, 35);
		
		
		phrase7.setText("7. When I (play) tennis last morning,I won every match. ");
		phrase7.setBounds(25, 325, 1200, 35);
		

		
		phrase8.setText("8. My sister often  (cook) delicious cakes. ");
		phrase8.setBounds(25, 375, 1200, 35);
		
		

		phrase9.setText("9. I (become) a pilot if I was very good at Mathematics. ");
		phrase9.setBounds(25, 425, 1200, 35);
		

		phrase10.setText("10. Anna (show) me the right way to come back from school on Mondays. ");
		phrase10.setBounds(25, 475, 1200, 35);
		try {
			 
	          image = ImageIO.read(new File("./images/exTrou2.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }

	
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
				Correction.get(i).setText((i+1)+"."+ "Good answer :"+ m.CorrectionExoATrouPasse.get(i));
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
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
