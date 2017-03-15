package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Vue.Vue;
import Vue.VueConnexion;
import Vue.VuePrincipale;
import anglais.Modele;

public class SeConnecter implements ActionListener,KeyListener,MouseListener {

	Modele m;
	Vue v;
	JTextField txtfieldachanger;
	
	public SeConnecter(Modele m,Vue v){
		this.m = m;
		this.v= v;
	}
	
	public SeConnecter(Modele m,Vue v, JTextField txt)
	{
		this.m = m;
		this.v= v;
		this.txtfieldachanger=txt;
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			action();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void action() throws IOException
	{
		
		boolean b = m.Connexion(((VueConnexion) v).getTxtNomUtilisateur(),((VueConnexion) v).getMdp());
		if(b){
			VuePrincipale vueP = new VuePrincipale(m);
			vueP.update();
		}
		else{
			JOptionPane.showMessageDialog(null, "Username or password is incorrect.Please try logging in again.");
		}
		
	}


	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
			try {
				action();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mousePressed(MouseEvent e) {
		txtfieldachanger.setText("");
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
