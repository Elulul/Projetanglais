package anglais;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Modele {

	private Fenetre f;
	
	public Modele(Fenetre f){
		this.f = f;
	}
	
	public Fenetre getFenetre(){
		return (Fenetre) f;
	}

	public boolean Nouvelutilisateur(String utilisateur,String mdp) throws IOException{

		boolean res = true;
		
		FileReader f = new FileReader("C:/Users/lulu/Desktop/Projetanglais/sauvegarde/user2.csv");
		BufferedReader r = new BufferedReader(f);
		
		FileWriter fw= new FileWriter("C:/Users/lulu/Desktop/Projetanglais/sauvegarde/user2.csv",true);
		BufferedWriter bw = new BufferedWriter(fw);
		String l = r.readLine();
		String tampon = "0";
		while(l!= null){
			
			Scanner sc = new Scanner(l).useDelimiter(",");
			if(!l.equals("\n\r")){
				 tampon = sc.next();
			}
			
			
			if(tampon.equals(utilisateur)){
				res = false;
				
			}
			l = r.readLine();
		}
		if(res){
			
			bw.write(utilisateur);
			bw.write(",");
			bw.write(mdp);
			bw.newLine();
		}
	
		
		
		if (bw != null)
			bw.close();

		if (fw != null)
			fw.close();
		
		return res;
		
		}
	
	
	public boolean Connexion(String utilisateur,String mdp) throws IOException{
		boolean res = false;
		FileReader f = new FileReader("C:/Users/lulu/Desktop/Projetanglais/sauvegarde/user2.csv");
		BufferedReader r = new BufferedReader(f);
		String l = r.readLine();
		String tampon = "0";
		while( l != null){
			Scanner sc = new Scanner(l).useDelimiter(",");
			
			
				tampon = sc.next();
				if(tampon.equals(utilisateur)){
					tampon = sc.next();
					if(tampon.equals(mdp)){
						res = true;
					}
				}
			l = r.readLine();
		}
		
		
		return res;
	}
	
	
	/*public static void main (String [] args) throws IOException{
		Fenetre f = new Fenetre();
		System.out.println("bon lancement");
		Modele m = new Modele(f);
		m.Nouvelutilisateur("lulu6","test");
	}*/
	
}
