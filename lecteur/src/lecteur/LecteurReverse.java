package lecteur;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class LecteurReverse {
	
	public File f;
    public LecteurReverse(String nomFichier) {
  
    f = new File(nomFichier);
    }
    public void affiche () throws IOException{
    	String text ="";
    	FileInputStream in = null;
    try {
    	in = new FileInputStream(f);
    	// la lecture
    	int data;
    	while ((data = in.read())>=0) {
    		String s = ""+(char)data;
    		text = text+s;
    		
    	}
    		for(int i=0;i<text.length();i++) {
    			System.out.print(text.charAt(text.length()-1-i));
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
    	LecteurReverse monLecteur = new LecteurReverse("test.txt");
    	try {
			monLecteur.affiche();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}