package VuePageExo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ControlerVersPageExo.ContinuerVersPageExoATrouAsLikeCorrection;
import Vue.Vue;
import anglais.Modele;

public class VuePageExoATrouAsLike extends JPanel implements Vue{
	
	Modele m;
	private JButton Valider = new JButton(new ImageIcon("./images/validate.png"));
	private JLabel phrase1deb = new JLabel();
	private JLabel phrase1fin = new JLabel();
	private JComboBox phrase1scroll = new JComboBox();
	
	private JLabel phrase2deb = new JLabel();
	private JLabel phrase2fin = new JLabel();
	public JComboBox phrase2scroll = new JComboBox();
	
	private JLabel phrase3deb = new JLabel();
	private JLabel phrase3fin = new JLabel();
	public JComboBox phrase3scroll = new JComboBox();
	
	private JLabel phrase4deb = new JLabel();
	private JLabel phrase4fin = new JLabel();
	public JComboBox phrase4scroll = new JComboBox();
	
	private JLabel phrase5deb = new JLabel();
	private JLabel phrase5fin = new JLabel();
	public JComboBox phrase5scroll = new JComboBox();
	
	private JLabel phrase6deb = new JLabel();
	private JLabel phrase6fin = new JLabel();
	public JComboBox phrase6scroll = new JComboBox();
	
	private JLabel phrase7deb = new JLabel();
	private JLabel phrase7fin = new JLabel();
	public JComboBox phrase7scroll = new JComboBox();
	
	private JLabel phrase8deb = new JLabel();
	private JLabel phrase8fin = new JLabel();
	public JComboBox phrase8scroll = new JComboBox();
	
	private JLabel phrase9deb = new JLabel();
	private JLabel phrase9fin = new JLabel();
	public JComboBox phrase9scroll = new JComboBox();
	
	private JLabel phrase10deb = new JLabel();
	private JLabel phrase10fin = new JLabel();
	public JComboBox phrase10scroll = new JComboBox();
	private BufferedImage image;
	
	public VuePageExoATrouAsLike(Modele m){
		this.m = m;
		Object[] elements = new Object[]{"AS","LIKE","AS THOUGH","LIKES","AS IF","HAS","LIKE IF","AS A","LIKE A","AS AN","LIKED","AS LIKE"};
		
		this.setLayout(null);
		
		this.add(Valider);
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
		
		try {
			 
	          image = ImageIO.read(new File("./images/exTrou2.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		setPhrase1scroll(new JComboBox(elements));
		this.add(getPhrase1scroll());
		 phrase2scroll =  new JComboBox(elements);
		 this.add(phrase2scroll);
		 phrase3scroll =  new JComboBox(elements);
		 this.add(phrase3scroll);
		 phrase4scroll =  new JComboBox(elements);
		 this.add(phrase4scroll);
		 phrase5scroll =  new JComboBox(elements);
		 this.add(phrase5scroll);
		 phrase6scroll =  new JComboBox(elements);
		 this.add(phrase6scroll);
		 phrase7scroll =  new JComboBox(elements);
		 this.add(phrase7scroll);
		 phrase8scroll =  new JComboBox(elements);
		 this.add(phrase8scroll);
		 phrase9scroll =  new JComboBox(elements);
		 this.add(phrase9scroll);
		 phrase10scroll =  new JComboBox(elements);
		 this.add(phrase10scroll);
		 
		 
		
		phrase1deb.setText("1. Really, there are very few people ");
		phrase1deb.setBounds(25, 25, 400, 35);
		getPhrase1scroll().setBounds( 235,35, 100, 20);
		

		phrase1fin.setText("you... and that's why you're my best friend!");
		phrase1fin.setBounds( 350,25, 400, 35);
		
		
		phrase2deb.setText("2. You must really do");
		phrase2deb.setBounds(25, 75, 200, 35);
		phrase2scroll.setBounds( 150,85, 100, 20);
		

		phrase2fin.setText("the doctor told you. Follow his advice, and you will be fine.");
		phrase2fin.setBounds( 260,75, 400, 35);
		
		
		phrase3deb.setText("3. He's going to work");
		phrase3deb.setBounds(25, 125, 200, 35);
		phrase3scroll.setBounds( 150,135, 100, 20);
		

		phrase3fin.setText("English guide during the summer holiday.");
		phrase3fin.setBounds( 260,125, 400, 35);
		
		
		
		phrase4deb.setText("4. Look at Bob eating his meal... He looks");
		phrase4deb.setBounds(25, 175, 400, 35);
		phrase4scroll.setBounds( 265,185, 100, 20);
		

		phrase4fin.setText("English guide during the summer holiday.");
		phrase4fin.setBounds( 380,175, 400, 35);
		
		
		phrase5deb.setText("5.Behave");
		phrase5deb.setBounds(25, 225, 75, 35);
		phrase5scroll.setBounds( 90,235, 100, 20);
		

		phrase5fin.setText("real brother and help her out of this situation... ");
		phrase5fin.setBounds( 200,225, 400, 35);
		
		phrase6deb.setText("6.Jerry doesn't feel");
		phrase6deb.setBounds(25, 275, 175, 35);
		phrase6scroll.setBounds( 145,285, 100, 20);
		

		phrase6fin.setText("coming to my party... Try to persuade him! ");
		phrase6fin.setBounds( 260,275, 400, 35);
		phrase7deb.setText("7. It looks");
		phrase7deb.setBounds(25, 325, 100, 35);
		phrase7scroll.setBounds( 90,335, 100, 20);
		

		phrase7fin.setText("a storm is going to break out. Let's hurry home! ");
		phrase7fin.setBounds( 210,325, 400, 35);
		
		phrase8deb.setText("8. 'I'm the boss',");
		phrase8deb.setBounds(25, 375, 175, 35);
		phrase8scroll.setBounds( 125,385, 100, 20);
		

		phrase8fin.setText("my father used to say...");
		phrase8fin.setBounds( 240,375, 400, 35);
		phrase9deb.setText("9. She can be regarded");
		phrase9deb.setBounds(25, 425, 225, 35);
		phrase9scroll.setBounds( 165,435, 100, 20);
		

		phrase9fin.setText("my father used to say...");
		phrase9fin.setBounds( 280,425, 400, 35);
		phrase10deb.setText("10. 'I wanna be");
		phrase10deb.setBounds(25, 475, 175, 35);
		phrase10scroll.setBounds( 125,485, 100, 20);
		

		phrase10fin.setText("you!");
		phrase10fin.setBounds( 240,475, 400, 35);

		

		Valider.setBounds(1000, 600, 160, 45);
		Valider.addActionListener(new ContinuerVersPageExoATrouAsLikeCorrection(m,this));
		

		
		
	}
	
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}



	public JComboBox getPhrase1scroll() {
		return phrase1scroll;
	}



	public void setPhrase1scroll(JComboBox phrase1scroll) {
		this.phrase1scroll = phrase1scroll;
	}
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
