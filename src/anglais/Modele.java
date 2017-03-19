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

	public ArrayList<String> CorrectionExoATrouPasse = new ArrayList<String>() ;
	private ArrayList<ArrayList<String>> ListeVocATable = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeBricolage = new ArrayList<ArrayList<String>>();


	private ArrayList<ArrayList<String>> ListeVocHabit = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeVocAnimauxSauvage = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeVocCalendrier = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeVocMaterielinformatique = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeVocNourriture = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeVocNourritureSuite = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeVocSentiment = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeVocSport = new ArrayList<ArrayList<String>>();
	private ArrayList<ArrayList<String>> ListeVocTransport = new ArrayList<ArrayList<String>>();
	
	
	private Fenetre f;
	
	
	public Modele(Fenetre f){
		this.f = f;
		
		//Initialisation de toutes les données
		
		// Initialisation de la liste contenant les reponses de l'exercice AS LIKE 
		
		CorrectionExoATrouPasse.add(0,"IS");
		CorrectionExoATrouPasse.add(1," IS OPENING");
		CorrectionExoATrouPasse.add(2,"WOULD RUN");
		CorrectionExoATrouPasse.add(3,"WON");
		CorrectionExoATrouPasse.add(4,"HAVE NEVER SWUM");
		CorrectionExoATrouPasse.add(5,"HAD BEEN");
		CorrectionExoATrouPasse.add(6,"PLAYED");
		CorrectionExoATrouPasse.add(7,"COOKS");
		CorrectionExoATrouPasse.add(8,"WOULD BECOME");
		CorrectionExoATrouPasse.add(9,"SHOWS");
		
		// End Initialisation de la liste contenant les reponses de l'exercice AS LIK
		
		// Initialisation de la liste contenant les reponses de l'exercice Passe
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
		
		
		// End Initialisation de la liste contenant les reponses de l'exercice AS LIK
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
		
		//End Voc A Table
		
		//Initialisation VocHabit
		
		try {
			this.setListeVocHabit(this.getListVocHabit("./sauvegarde/VocHabit.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//End VocHabit
		
		//Initialisation VocAnimauxSauvage
		try {
			this.setListeVocAnimauxSauvage(this.getListVocHabit("./sauvegarde/VocAnimauxSauvage.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocAnimauxSauvage
		
		//Initialisation VocBricolage
		
		try {
			this.setListeBricolage(this.getListVocHabit("./sauvegarde/VocBricolage.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocBricolage
		
		
		//Initialisation VocCalendrier
		
		try {
			this.setListeVocCalendrier(this.getListVocHabit("./sauvegarde/VocCalendrier.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocCalendrier
		
		//Initialisation VocMaterielInformatique
		try {
			this.setListeVocMaterielinformatique(this.getListVocHabit("./sauvegarde/VocMaterielInformatique.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocMaterielInformatique
		
		//Initialisation VocNourriture
		try {
			this.setListeVocNourriture(this.getListVocHabit("./sauvegarde/VocNourriture.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocNourriture
		
		//Initialisation VocNourritureSuite
		try {
			this.setListeVocNourritureSuite(this.getListVocHabit("./sauvegarde/VocNourritureSuite.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocNourritureSuite
		
		//Initialisation VocSentiment
		try {
			this.setListeVocSentiment(this.getListVocHabit("./sauvegarde/VocSentiment.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocSentiment

		//Initialisation VocSport
		try {
			this.setListeVocSport(this.getListVocHabit("./sauvegarde/VocSport.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocSentiment
		
		//Initialisation VocTransport
		try {
			this.setListeVocTransport(this.getListVocHabit("./sauvegarde/VocTransport.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//End VocSentiment
		
		
		
		
		
		//End Toute les données

		
	}
	public ArrayList<ArrayList<String>> getListeBricolage() {
		return ListeBricolage;
	}

	public void setListeBricolage(ArrayList<ArrayList<String>> listeBricolage) {
		ListeBricolage = listeBricolage;
	}
	
	
	public ArrayList<ArrayList<String>> getListeVocAnimauxSauvage() {
		return ListeVocAnimauxSauvage;
	}

	public void setListeVocAnimauxSauvage(ArrayList<ArrayList<String>> listeVocAnimauxSauvage) {
		ListeVocAnimauxSauvage = listeVocAnimauxSauvage;
	}

	public ArrayList<ArrayList<String>> getListeVocCalendrier() {
		return ListeVocCalendrier;
	}

	public void setListeVocCalendrier(ArrayList<ArrayList<String>> listeVocCalendrier) {
		ListeVocCalendrier = listeVocCalendrier;
	}

	public ArrayList<ArrayList<String>> getListeVocMaterielinformatique() {
		return ListeVocMaterielinformatique;
	}

	public void setListeVocMaterielinformatique(ArrayList<ArrayList<String>> listeVocMaterielinformatique) {
		ListeVocMaterielinformatique = listeVocMaterielinformatique;
	}

	public ArrayList<ArrayList<String>> getListeVocNourriture() {
		return ListeVocNourriture;
	}

	public void setListeVocNourriture(ArrayList<ArrayList<String>> listeVocNourriture) {
		ListeVocNourriture = listeVocNourriture;
	}

	public ArrayList<ArrayList<String>> getListeVocNourritureSuite() {
		return ListeVocNourritureSuite;
	}

	public void setListeVocNourritureSuite(ArrayList<ArrayList<String>> listeVocNourritureSuite) {
		ListeVocNourritureSuite = listeVocNourritureSuite;
	}

	public ArrayList<ArrayList<String>> getListeVocSentiment() {
		return ListeVocSentiment;
	}

	public void setListeVocSentiment(ArrayList<ArrayList<String>> listeVocSentiment) {
		ListeVocSentiment = listeVocSentiment;
	}

	public ArrayList<ArrayList<String>> getListeVocSport() {
		return ListeVocSport;
	}

	public void setListeVocSport(ArrayList<ArrayList<String>> listeVocSport) {
		ListeVocSport = listeVocSport;
	}

	public ArrayList<ArrayList<String>> getListeVocTransport() {
		return ListeVocTransport;
	}

	public void setListeVocTransport(ArrayList<ArrayList<String>> listeVocTransport) {
		ListeVocTransport = listeVocTransport;
	}

	public ArrayList<ArrayList<String>> getListeVocHabit() {
		return ListeVocHabit;
	}

	public void setListeVocHabit(ArrayList<ArrayList<String>> listeVocHabit) {
		ListeVocHabit = listeVocHabit;
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
	
	
	// Vocabulaire
	public ArrayList<ArrayList<String>> getListeVocATable(){
		return this.ListeVocATable;
	}
	

	public ArrayList<ArrayList<String>> getListVocHabit(String fichier) throws IOException{
		ArrayList<ArrayList<String> > res = new ArrayList<ArrayList<String>>();
		ArrayList<String> tampon = new ArrayList<String>();
		FileReader f = new FileReader(fichier);
		BufferedReader r = new BufferedReader(f);
		String u;
		String l = r.readLine();
		
		int i =0;
		
	
		while( l != null){
			Scanner sc = new Scanner(l).useDelimiter(";");
			tampon = new ArrayList<String>();
			
			u = sc.next();
			tampon.add(u);
			u = sc.next();
			tampon.add(u);
			res.add(i,tampon);
				
			l = r.readLine();
			i++;
		}
		
		return res;
		
	}
	
	//Fin Vocabulaire
	
	
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
	
	public ArrayList<ArrayList<Object>> compareReponseExoATrou(ArrayList<String> reponse){
		ArrayList<Object> tampon ;
		ArrayList<ArrayList<Object>> res = new ArrayList<ArrayList<Object>>();
		for(int i = 0; i < reponse.size();i++){
			if(reponse.get(i).equals(this.CorrectionExoATrouPasse.get(i).toUpperCase())){
				tampon = new ArrayList<Object>();
				tampon.add(0,true);
				tampon.add(1,reponse.get(i));
				res.add(i, tampon );
				
			}
			
			
			else{
				tampon = new ArrayList<Object>();
				tampon.add(0,false);
				tampon.add(1,reponse.get(i));
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
	
	
	// Voltaire
	public boolean appartientRect(int xhghd,int xbgbd,int yhgbg,int yhdbd,int xa,int ya){
		boolean res = false;
		
		if(xa > xhghd && xa < xbgbd && ya > yhgbg && ya <yhdbd ){
			res = true;
		}
		
		return res;
	}
	
	
	public boolean aTrouverLaRepSansBoutton(boolean pasdefaute,boolean appartientrec,int xhghd,int xbgbd,int yhgbg,int yhdbd,int xa,int ya){
		boolean res  = false;
		
		if(!pasdefaute){
			if(this.appartientRect(xhghd, xbgbd, yhgbg, yhdbd, xa, ya)){
				res = true;
			}
		}
		
		return res;
	}
	
	public boolean aTrouverLaRepAvecBoutton(boolean pasdefaute){
		boolean res = false;
		if(pasdefaute){
			res = true;
		}
		return res;
	}
	

	
	
	public static void affiche(ArrayList<ArrayList<String>> t){
		for (int i= 0 ; i<t.size();i++){
			for(int j =0 ; j < t.get(i).size();j++){
				System.out.println(i + t.get(i).get(j));
			}
		}
	}
	
	
	// Fin Voltaire
	
	/*public static void main (String [] args) throws IOException{
		Fenetre f = new Fenetre();
		System.out.println("bon lancement");
		Modele m = new Modele(f);
		m.Nouvelutilisateur("lulu6","test");
	}*/
	
}
