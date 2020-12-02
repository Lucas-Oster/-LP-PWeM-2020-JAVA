package lecteur;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

abstract public class LecteurFichier implements LecteurInterface {
	public File f;
	public LecteurFichier(String nomFichier) {
		f = new File(nomFichier);
	}
	public String lecture() throws IOException{
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
		}catch (FileNotFoundException e) {
			System.out.println("le fichier n'existe pas");
		} 
		finally {
			if (in != null) {
				in.close ();
			}
		}
		return text;
	}	
}


	
	