package anglais;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Modele {

	private ArrayList<String> CorrectionExoATrouAsLike = new ArrayList<String>() ;
	private ArrayList<ArrayList<String>> ListeVocATable = new ArrayList<ArrayList<String>>();
	private Fenetre f;
	
	public Modele(Fenetre f){
		this.f = f;
		
		//Initialisation de toutes les données
		
		// Initialisation de la liste contenant les reponses de l'exercice AS LIKE 
		
		CorrectionExoATrouAsLike.add(0,"LIKE");
		CorrectionExoATrouAsLike.add(1,"AS");
		CorrectionExoATrouAsLike.add(2,"AS AN");
		CorrectionExoATrouAsLike.add(3,"AS IF");
		CorrectionExoATrouAsLike.add(4,"LIKE A");
		CorrectionExoATrouAsLike.add(5,"LIKE");
		CorrectionExoATrouAsLike.add(6,"AS THOUGH");
		CorrectionExoATrouAsLike.add(7,"AS");
		CorrectionExoATrouAsLike.add(8,"AS A");
		CorrectionExoATrouAsLike.add(9,"LIKE");
		
		// Initialisation Voc A table
		ArrayList<String> tampon = new ArrayList<String>();
		tampon.add(0,"beurre");
		tampon.add(1,"butter");
		ListeVocATable.add(0,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"eau");
		tampon.add(1,"water");
		ListeVocATable.add(1,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"épice");
		tampon.add(1,"spice");
		ListeVocATable.add(2,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"le petit déjeuner");
		tampon.add(1,"the breakfast");
		ListeVocATable.add(3,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"épicé");
		tampon.add(1,"spicy");
		ListeVocATable.add(4,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"frire");
		tampon.add(1,"to fry");
		ListeVocATable.add(5,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"la nourriture");
		tampon.add(1,"the food");
		ListeVocATable.add(6,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"la table");
		tampon.add(1,"the table");
		ListeVocATable.add(7,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"lait");
		tampon.add(1,"milk");
		ListeVocATable.add(8,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"le déjeuner");
		tampon.add(1,"the lunch");
		ListeVocATable.add(9,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"le dessert");
		tampon.add(1,"the dessert");
		ListeVocATable.add(10,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"le dîner");
		tampon.add(1,"the dinner");
		ListeVocATable.add(11,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"le fromage");
		tampon.add(1,"the cheese");
		ListeVocATable.add(12,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"le goûter");
		tampon.add(1,"the snack");
		ListeVocATable.add(13,tampon);
		
		tampon = new ArrayList<String>();
		tampon.add(0,"le pain");
		tampon.add(1,"the bread");
		ListeVocATable.add(14,tampon);
	}
	
	public Fenetre getFenetre(){
		return (Fenetre) f;
	}

	public boolean Nouvelutilisateur(String utilisateur,String mdp) throws IOException{

		boolean res = true;
		
		FileReader f = new FileReader("./sauvegarde/user2.csv");
		BufferedReader r = new BufferedReader(f);
		
		FileWriter fw= new FileWriter("./sauvegarde/user2.csv",true);
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
		FileReader f = new FileReader("./sauvegarde/user2.csv");
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
	
	public ArrayList<String> getCorrectionExoATrouAsLike(){
		return this. CorrectionExoATrouAsLike;
	}
	
	
	public ArrayList<ArrayList<Object>> compareReponseExoATrouAsLike(ArrayList<ArrayList<Object>> reponse){
		ArrayList<Object> tampon ;
		ArrayList<ArrayList<Object>> res = new ArrayList<ArrayList<Object>>();
		for(int i = 0; i < reponse.size();i++){
			if(reponse.get(i).get(0).toString().equals(this.CorrectionExoATrouAsLike.get(i))){
				tampon = new ArrayList<Object>();
				tampon.add(0,true);
				tampon.add(1,reponse.get(i).get(1));
				tampon.add(2,reponse.get(i).get(2));
				tampon.add(3,this.CorrectionExoATrouAsLike.get(i));
				tampon.add(4,reponse.get(i).get(0));
				res.add(i, tampon );
				
			}
			else{
				tampon = new ArrayList<Object>();
				tampon.add(false);
				tampon.add(1, reponse.get(i).get(1));
				tampon.add(2, reponse.get(i).get(2));
				tampon.add(3,this.CorrectionExoATrouAsLike.get(i));
				tampon.add(4,reponse.get(i).get(0));
				res.add(i, tampon );
				
			}
			
		}
		
		
		return res;
		
	}
	
	public ArrayList<Double> nbalea(int taille){
		ArrayList<Double> res = new ArrayList<Double>();
		Random r = new Random();
		for (int i =0; i< taille;i++){
			r = new Random();
			res.add(i,r.nextDouble());
		}
		return res;
	}
	
	public ArrayList<ArrayList<String>> getListeVocATable(){
		return this.ListeVocATable;
	}
	
	public boolean appartientRect(int xhghd,int xbgbd,int yhgbg,int yhdbd,int xa,int ya){
		boolean res = false;
		
		if(xa > xhghd && xa < xbgbd && ya > yhgbg && ya <yhdbd ){
			res = true;
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
