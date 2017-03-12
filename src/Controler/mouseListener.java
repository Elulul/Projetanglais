package Controler;

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

public class mouseListener implements MouseListener{
	JTextField txtfieldachanger;
	String ancientexte;

	public mouseListener(JTextField txt)
	{
		this.txtfieldachanger=txt;
		this.ancientexte=txt.getText();
	}
	public void mouseClicked(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
		txtfieldachanger.setText("");
	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

