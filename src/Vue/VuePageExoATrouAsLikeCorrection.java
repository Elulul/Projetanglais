package Vue;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import anglais.Modele;

public class VuePageExoATrouAsLikeCorrection extends JPanel implements Vue{

	Modele m;
	
	ArrayList<JLabel> reponseAAfficher = new ArrayList<JLabel>();
	ArrayList<JLabel> Correction = new ArrayList<JLabel>();
	
	private JLabel phrase1deb = new JLabel();
	private JLabel phrase1fin = new JLabel();

	
	private JLabel phrase2deb = new JLabel();
	private JLabel phrase2fin = new JLabel();

	
	private JLabel phrase3deb = new JLabel();
	private JLabel phrase3fin = new JLabel();

	
	private JLabel phrase4deb = new JLabel();
	private JLabel phrase4fin = new JLabel();

	
	private JLabel phrase5deb = new JLabel();
	private JLabel phrase5fin = new JLabel();

	private JLabel phrase6deb = new JLabel();
	private JLabel phrase6fin = new JLabel();

	
	private JLabel phrase7deb = new JLabel();
	private JLabel phrase7fin = new JLabel();

	
	private JLabel phrase8deb = new JLabel();
	private JLabel phrase8fin = new JLabel();

	
	private JLabel phrase9deb = new JLabel();
	private JLabel phrase9fin = new JLabel();

	private JLabel phrase10deb = new JLabel();
	private JLabel phrase10fin = new JLabel();

	
	
	public VuePageExoATrouAsLikeCorrection(Modele m,ArrayList<ArrayList<Object>> reponse){
		this.initreponseAAfficher();
		this.initCorrection();
		this.m = m;
		
		this.setLayout(null);
		
		this.add(phrase1deb);
		this.add(phrase1fin);
		this.add(phrase2deb);
		this.add(phrase2fin);
		this.add(phrase3deb);
		this.add(phrase3fin);
		this.add(phrase4deb);
		this.add(phrase4fin);
		this.add(phrase5deb);
		this.add(phrase5fin);
		this.add(phrase6deb);
		this.add(phrase6fin);
		this.add(phrase7deb);
		this.add(phrase7fin);
		this.add(phrase8deb);
		this.add(phrase8fin);
		this.add(phrase9deb);
		this.add(phrase9fin);
		this.add(phrase10deb);
		this.add(phrase10fin);
		
		phrase1deb.setText("1. Really, there are very few people ");
		phrase1deb.setBounds(25, 25, 400, 35);
		
		

		phrase1fin.setText("you... and that's why you're my best friend!");
		phrase1fin.setBounds( 350,25, 400, 35);
		
		
		
		phrase2deb.setText("2. You must really do");
		phrase2deb.setBounds(25, 75, 200, 35);
		
		

		phrase2fin.setText("the doctor told you. Follow his advice, and you will be fine.");
		phrase2fin.setBounds( 260,75, 400, 35);
		
		
		
		
		phrase3deb.setText("3. He's going to work");
		phrase3deb.setBounds(25, 125, 200, 35);
		
		

		phrase3fin.setText("English guide during the summer holiday.");
		phrase3fin.setBounds( 260,125, 400, 35);
		
		
		
		
		phrase4deb.setText("4. Look at Bob eating his meal... He looks");
		phrase4deb.setBounds(25, 175, 400, 35);
		
		

		phrase4fin.setText("English guide during the summer holiday.");
		phrase4fin.setBounds( 380,175, 400, 35);
		
		
		
		phrase5deb.setText("5.Behave");
		phrase5deb.setBounds(25, 225, 75, 35);
		

		phrase5fin.setText("real brother and help her out of this situation... ");
		phrase5fin.setBounds( 200,225, 400, 35);
		
		
		phrase6deb.setText("6.Jerry doesn't feel");
		phrase6deb.setBounds(25, 275, 175, 35);
		
		

		phrase6fin.setText("coming to my party... Try to persuade him! ");
		phrase6fin.setBounds( 260,275, 400, 35);
		
		phrase7deb.setText("7. It looks");
		phrase7deb.setBounds(25, 325, 100, 35);
		

		

		phrase7fin.setText("a storm is going to break out. Let's hurry home! ");
		phrase7fin.setBounds( 210,325, 400, 35);
		
		
		phrase8deb.setText("8. 'I'm the boss',");
		phrase8deb.setBounds(25, 375, 175, 35);
		

		

		phrase8fin.setText("my father used to say...");
		phrase8fin.setBounds( 240,375, 400, 35);
		
		phrase9deb.setText("9. She can be regarded");
		phrase9deb.setBounds(25, 425, 225, 35);
		

		

		phrase9fin.setText("my father used to say...");
		phrase9fin.setBounds( 280,425, 400, 35);
		
		phrase10deb.setText("10. 'I wanna be");
		phrase10deb.setBounds(25, 475, 175, 35);
		
		

		phrase10fin.setText("you!");
		phrase10fin.setBounds( 240,475, 400, 35);
		
	
		for(int i =0 ; i < reponse.size();i++){
			if((boolean) reponse.get(i).get(0)){
				reponseAAfficher.get(i).setText((String )reponse.get(i).get(4).toString());
				reponseAAfficher.get(i).setForeground(new Color(0,238,0));
				this.add(reponseAAfficher.get(i));
				reponseAAfficher.get(i).setBounds((int)reponse.get(i).get(1),(int) reponse.get(i).get(2), 100, 20);
			}
			
			
			else{
				reponseAAfficher.get(i).setText((String )reponse.get(i).get(4).toString());
				reponseAAfficher.get(i).setForeground(new Color(238,0,0));
				this.add(reponseAAfficher.get(i));
				reponseAAfficher.get(i).setBounds((int)reponse.get(i).get(1),(int) reponse.get(i).get(2), 100, 20);
				Correction.get(i).setText("Good answer :"+ (String) reponse.get(i).get(3).toString());
				this.add(Correction.get(i));
				Correction.get(i).setBounds(900,50*i + 25,400,20 );
			}
	
		
		}
	
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
