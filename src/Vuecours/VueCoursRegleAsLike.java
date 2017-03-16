package Vuecours;

import java.awt.Font;

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
	
	JTextArea cours2 = new JTextArea();
	Font f2 = new Font("Serif", Font.PLAIN, 14);
	public VueCoursRegleAsLike(Modele m){
		this.m = m;
		this.add(retour);
		this.add(cours2);
		this.setLayout(null);
		retour.setBounds(20, 20, 80, 80);
		retour.addActionListener(new ContinuerVersCours(m,this));
		retour.setBorderPainted(false);
		
		cours2.setText("1  LIKE  +  nom ou pronom = COMME = ressemblance � une personne /"
		+  "\n"
		+  "\n" 
		+" une chose.ex: Your daughter isn't blond and blue-eyed like her father...  She's more like you! = "
		+ "Ta fille n'est pas blonde aux yeux bleus comme son p�re ... Elle est plus comme toi ! "
		+  "\n" 
		+ "-  description d'un objet, d'une personne, d'un lieu : "
		+  "\n" 
		+  "\n"
		+"ex: What's his car like? It's big, white... and brand new! = A quoi ressemble sa voiture ? Elle est grosse, blanche ... et toute neuve !"
		+  "\n" 
		+  "\n"
		+ "-  dans l'expression : avoir envie de + ing = to feel like + V + ing : "
		+  "\n"
		+"ex: He must really feel like having a good rest = Il a vraiment envie d'un bon repos."
		+"\n" 
		+"\n" 
		 
		+"2) AS + proposition  (sujet + verbe) et AS + pr�position. = COMME."
		+"\n"
		+ " ex: It all happened as in a real nightmare. = Tout s'est pass� comme dans un vrai cauchemar. "
		+"\n"
		+ "ex: As he told you, he's never late = Comme il vous l'a dit, il n'est jamais en retard. "
		+"\n"
		+"ex: Do as you're told, and don't discuss, please! = Fais-ce que l'on te dit et ne discute pas, s'il te pla�t !"	

		+ "Dans ces deux derni�res phrases, aux Etats-Unis, vous entendrez �Like he told you' ou �Do like you're told'. Ceci n'est pas consid�r� correct en anglais britannique et dans les examens et concours europ�ens \n ... A �viter � tout prix. (mais � conna�tre !) (Ne pas vous habituer � cet emploi tant que vous avez des examens � passer ou des discours importants � faire en milieu international.)"
		+"\n"
		+"\n"
		+ "- devant un nom (titre ou fonction ) = en tant que :"
		+"\n"
		+" ex: As a doctor, he ordered you to stop smoking because of your asthma... = En tant que m�decin, il t'a ordonn� d'arr�ter de fumer � cause de ton asthme."
		+"\n"
		+"\n"
		+"- les verbes : 'to regard', �to consider'  se construisent avec �as'. "
		+"ex: He's considered as the best pianist of his generation = On le consid�re comme le meilleur pianiste de sa g�n�ration. "
		+"\n"
		+"\n"
		+"3) AS IF/ AS THOUGH : COMME SI : souvent employ�s apr�s  look, seem et  feel pour exprimer une impression = avoir l'air = on dirait que."
		+"\n"
		+"\n"
		+"\n"
	    + "ex: He looks as if he's having a good time! On dirait qu'il s'amuse bien."
	    +"\n"
		+"\n"
	    + "- le pr�t�rit modal indique une supposition ;"
	    +"\n"
		+"\n"

	     + "ex: He behaves as if he were the boss. = Il se conduit comme s'il �tait chef. => il ne l'est  pas = mode irr�el. "

    

     


				
				
				);
		
		cours2.setBounds(120, 20, 800, 800);
		cours2.setBackground(null);
		cours2.setFont(f2);
	}
	
	
	
	public void update() {
		m.getFenetre().setContentPane(this);
		m.getFenetre().revalidate();
	}
}
