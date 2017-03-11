package Vue;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import anglais.Modele;

public class VueDaccueil extends JPanel implements Vue	 {

	private JButton Continuer = new JButton();
	JLabel TexteBienvenue = new JLabel();
	
	
	
	public VueDaccueil(Modele m){
		this.setLayout(null);
		this.add(Continuer);
		this.add(TexteBienvenue);
		
		
		TexteBienvenue.setText("Welcome on the best application of the world to learn english");
		TexteBienvenue.setBounds(400, 250,600, 40);
		TexteBienvenue.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,18));
		
		Continuer.setBounds(575, 300, 138, 36);
		Continuer.setToolTipText("clic here to continue on the application");
		Continuer.setText("Continue");
		Continuer.setVisible(true);
		//Continuer.addActionListener(l);
		
	}
			
}
