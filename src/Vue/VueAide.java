package Vue;

import java.awt.Color;
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

import Controler.ContinuerVersApp;
import anglais.Modele;

public class VueAide extends JPanel implements Vue{
	Modele m;
	JLabel TexteAide = new JLabel();
	JButton Retour = new JButton(new ImageIcon ("./images/TestBack.png"));
	protected BufferedImage image;
	public VueAide(Modele m){ 
		this.m = m;
				
		this.setLayout(null);
		this.add(TexteAide);
		this.add(Retour);
		try {
			image = ImageIO.read(new File("./images/fondAide.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Font f = new Font("Serif", Font.PLAIN, 26);
		TexteAide.setText("<html>In order to connect, please press the 'New User' button then choose a username and a password and </br> <br> click on 'Sign Up'.</br><br> Once you are registered, you can sign in using the username and the password you chose earlier by </br> pressing the 'Sign in' button.</html>");
		
		TexteAide.setBounds(100, 260,1100, 150);
		TexteAide.setForeground(Color.WHITE);
		TexteAide.setFont(f);
		Retour.setBounds(0, 15,80, 80);
		Retour.addActionListener(new ContinuerVersApp(m,this));
		Retour.setBorderPainted(false);
		
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
