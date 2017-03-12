package Controler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

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
