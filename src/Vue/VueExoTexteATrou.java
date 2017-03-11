package Vue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import anglais.Modele;

public class VueExoTexteATrou extends JPanel implements Vue{
	
	Modele m;
	private JButton Valider = new JButton();
	private JLabel phrase1deb = new JLabel();
	private JLabel phrase1fin = new JLabel();
	private JComboBox phrase1scroll = new JComboBox();
	
	public VueExoTexteATrou(Modele m){
		this.m = m;
		Object[] elements = new Object[]{"AS","LIKE","AS THOUGH","LIKES","AS IF"};
		
		this.setLayout(null);
		
		this.add(Valider);
		this.add(phrase1deb);
		this.add(phrase1fin);
		phrase1scroll = new JComboBox(elements);
		this.add(phrase1scroll);
		
		
		phrase1deb.setText("1. Really, there are very few people ");
		phrase1deb.setBounds(25, 25, 400, 35);
		
		phrase1scroll.setBounds( 235,35, 100, 20);

		phrase1fin.setText("you... and that's why you're my best friend!");
		phrase1fin.setBounds( 350,25, 400, 35);
		
		Valider.setText("Validate");
		Valider.setBounds(1000, 600, 125, 35);
		
		
		
		
		
		
		
	}
	
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
	
}
