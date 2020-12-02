package lecteur;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class LecteurFichier {
	
	public File f;
    public LecteurFichier(String nomFichier) {
  
    f = new File(nomFichier);
    }
    public void affiche () throws IOException{
    	
    	FileInputStream in = null;
    try {
    	in = new FileInputStream(f);
    	// la lecture
    	int data;
    	while ((data = in.read())>=0) {
    		System.out.print((char)data);
    	}
    		
    } catch (FileNotFoundException e) {
		System.out.println("le fichier n'existe pas");
	} 
    	finally {
    		if (in != null) {
    			in.close ();
    		}
    		
    	}
    }
    public static void main(String[] args) {
    	LecteurFichier monLecteur = new LecteurFichier("test.txt");
    	try {
			monLecteur.affiche();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}