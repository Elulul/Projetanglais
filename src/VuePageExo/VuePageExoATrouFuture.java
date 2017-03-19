package VuePageExo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ControlerVersPageExo.ContinuerVersPageExoATrouFutureCorrection;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoATrouFuture extends JPanel implements Vue{

	Modele m;
	private JButton Valider = new JButton();
	private JLabel phrase1 = new JLabel();
	public JTextField phrase1scroll = new JTextField();
	
	private JLabel phrase2 = new JLabel();
	public JTextField phrase2scroll = new JTextField();
	
	private JLabel phrase3 = new JLabel();
	public JTextField phrase3scroll = new JTextField();
	
	private JLabel phrase4 = new JLabel();
	public JTextField phrase4scroll = new JTextField();
	
	private JLabel phrase5 = new JLabel();
	public JTextField phrase5scroll = new JTextField();
	
	private JLabel phrase6 = new JLabel();
	public JTextField phrase6scroll = new JTextField();
	
	private JLabel phrase7= new JLabel();
	public JTextField phrase7scroll = new JTextField();
	
	private JLabel phrase8 = new JLabel();

	public JTextField phrase8scroll = new JTextField();
	
	private JLabel phrase9 = new JLabel();

	public JTextField phrase9scroll = new JTextField();
	
	private JLabel phrase10= new JLabel();

	public JTextField phrase10scroll = new JTextField();
	
	
	public VuePageExoATrouFuture (Modele m){
		this.m = m;
		
		this.setLayout(null);
		
		this.add(Valider);
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
		
		this.add(phrase1scroll);
		this.add(phrase2scroll);
		this.add(phrase3scroll);
		this.add(phrase4scroll);
		this.add(phrase5scroll);
		this.add(phrase6scroll);
		this.add(phrase7scroll);
		this.add(phrase8scroll);
		this.add(phrase9scroll);
		this.add(phrase10scroll);
		
		 
		 
		
		phrase1.setText("1. Tony a friend tomorrow.(meet) . ");
		phrase1.setBounds(25, 25,1200, 40);
		
		phrase1scroll.setBounds( 1000,35, 100, 20);
		
		phrase2.setText("2. I think it  soon.(snow) ");
		phrase2.setBounds(25, 75, 1200, 35);
		
		phrase2scroll.setBounds( 1000,85, 100, 20);
		

		phrase3.setText("3. Perhaps I New York one day.(visit) ");
		phrase3.setBounds(25, 125, 1200, 35);
		
		phrase3scroll.setBounds( 1000,135, 100, 20);
		
	
		phrase4.setText("4. What time  tomorrow?(leave/you) ");
		phrase4.setBounds(25, 175, 1200, 35);
		
		phrase4scroll.setBounds( 1000,185, 100, 20);
	
		phrase5.setText("5. Who the next World Cup? (win) ");
		phrase5.setBounds(25, 225, 1200, 35);
		
		phrase5scroll.setBounds( 1000,235, 100, 20);
		
	
		phrase6.setText("6. I'm sure you  the exam next week. (not fail) ");
		phrase6.setBounds(25, 275, 1200, 35);
		
		phrase6scroll.setBounds(1000,285, 100, 20);
		
		phrase7.setText("7. I my parents at the week-end. (visit) ");
		phrase7.setBounds(25, 325, 1200, 35);
		
		phrase7scroll.setBounds( 1000,335, 100, 20);
		

		
		phrase8.setText("8. Don't touch that dog. It you. (bite) ");
		phrase8.setBounds(25, 375, 1200, 35);
		
		phrase8scroll.setBounds( 1000,385, 100, 20);
		

		phrase9.setText("9. They for a meal tonight.(come) ");
		phrase9.setBounds(25, 425, 1200, 35);
		
		phrase9scroll.setBounds( 1000,435, 100, 20);

		phrase10.setText("10. Look at those clouds, it .(rain)  ");
		phrase10.setBounds(25, 475, 1200, 35);
		
		phrase10scroll.setBounds(1000,485, 100, 20);


		
		
		
		Valider.setText("Validate");
		Valider.setBounds(1000, 600, 125, 35);
		Valider.addActionListener(new ContinuerVersPageExoATrouFutureCorrection(m,this));
		
		

		
		
	}
	
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
	
}
