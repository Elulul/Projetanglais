package Vuecours;

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
import javax.swing.JTextArea;

import ControlerVersCours.ContinuerVersCours;
import Vue.Vue;
import anglais.Modele;

public class VueCoursRegleAsLike extends JPanel implements Vue{

	Modele m;
	JButton retour = new JButton(new ImageIcon("./images/TestBack.png"));
	JLabel cours = new JLabel();
	private BufferedImage image;

	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 17);
	public VueCoursRegleAsLike(Modele m){
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		try {
			 
	          image = ImageIO.read(new File("./images/coursGrammaire.png"));
	          
	    	  
	       } catch (IOException ex) {
	    	   ex.printStackTrace();
	       }
		cours2.setText("1) LIKE  +  nom ou pronom = COMME = ressemblance à une personne/une chose."
		+  "\n"
		+"ex: Your daughter isn't blond and blue-eyed like her father...  She's more like you! = "
		+ "Ta fille n'est pas blonde aux yeux bleus comme son père ... Elle est plus comme toi ! "
		+  "\n"
		+  "\n"
		+ "-  description d'un objet, d'une personne, d'un lieu : "
		+  "\n" 
		+"ex: What's his car like? It's big, white... and brand new! = A quoi ressemble sa voiture ? Elle est grosse, blanche ... et toute neuve !"
		+  "\n" 
		+  "\n"
		+ "-  dans l'expression : avoir envie de + ing = to feel like + V + ing : "
		+  "\n"
		+"ex: He must really feel like having a good rest = Il a vraiment envie d'un bon repos."
		+"\n" 
		+"\n" 
		+  "\n" 
		+"2) AS + proposition  (sujet + verbe) et AS + préposition. = COMME."
		+"\n"
		+ " ex: It all happened as in a real nightmare. = Tout s'est passé comme dans un vrai cauchemar. "
		+"\n"
		+ "ex: As he told you, he's never late = Comme il vous l'a dit, il n'est jamais en retard. "
		+"\n"
		+"ex: Do as you're told, and don't discuss, please! = Fais-ce que l'on te dit et ne discute pas, s'il te plaît !"
		+"\n"
		+ "Dans ces deux dernières phrases, aux Etats-Unis, vous entendrez ‘Like he told you' ou ‘Do like you're told'."
		+"\n"
		+"Ceci n'est pas considéré correct en anglais britannique et dans les examens et concours européens... A éviter à tout prix. (mais à connaître !)"
		+"\n"
		+"\n"
		+ "- devant un nom (titre ou fonction ) = en tant que :"
		+"\n"
		+" ex: As a doctor, he ordered you to stop smoking because of your asthma... = En tant que médecin, il t'a ordonné d'arrêter de fumer à cause de ton asthme."
		+"\n"
		+"\n"
		+"- les verbes : 'to regard', ‘to consider'  se construisent avec ‘as'. "
		+"\n"
		+"ex: He's considered as the best pianist of his generation = On le considère comme le meilleur pianiste de sa génération. "
		+"\n"
		+"\n"
		+"3) AS IF/ AS THOUGH : COMME SI : souvent employés après  look, seem et  feel pour exprimer une impression = avoir l'air = on dirait que."
		+"\n"
	    + "ex: He looks as if he's having a good time! On dirait qu'il s'amuse bien."
	    +"\n"
		+"\n"
	    + "- le prétérit modal indique une supposition ;"
	    +"\n"
	    + "ex: He behaves as if he were the boss. = Il se conduit comme s'il était chef. => il ne l'est  pas = mode irréel. "		
				);
		
		cours2.setBounds(120, 20, 1150, 800);
		cours2.setOpaque(false);
		cours2.setFont(f2);
		cours2.setForeground(Color.white);
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
