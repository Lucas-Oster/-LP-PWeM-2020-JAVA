package lecteur;

import java.io.IOException;

public class TestAllLecteurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LecteurFichier a = new Lecteur("test.txt");
		LecteurFichier b = new LecteurReverse("test.txt");
		LecteurFichier c = new LecteurMirroir("test.txt");
		LecteurFichier d = new LecteurPalindrome("test.txt");
		try {
			System.out.println("Affichage normal");  
			a.affiche(a.lecture());
			System.out.println("Affichage reverse");
			  b.affiche(b.lecture());
			  System.out.println("Affichage mirroir");
			  c.affiche(c.lecture());
			  System.out.println("Affichage palindrome");
			  d.affiche(d.lecture());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
