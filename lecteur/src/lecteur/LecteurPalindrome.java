package lecteur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecteurPalindrome {

	public File f;
	public LecteurPalindrome(String nomFichier) {

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
			String separateur = "\r\n"; //(version windows)
			String lignes[]= text.split(separateur);
			for (int i = 0; i < lignes.length; i++) {
				String uneLigne = lignes[i];

				for(int j=0;j<uneLigne.length();j++) {
					System.out.print(uneLigne.charAt(uneLigne.length()-1-j));
				}
				System.out.println();
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
		LecteurPalindrome monLecteur = new LecteurPalindrome("test.txt");
		try {
			monLecteur.affiche();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}