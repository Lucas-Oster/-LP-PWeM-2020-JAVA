package lecteur;



public class LecteurPalindrome extends LecteurFichier implements LecteurInterface {
	public LecteurPalindrome(String nomFichier) {
		super(nomFichier);
	}
	public void affiche (String text) {
		String separateur = "\r\n"; //(version windows)
		String lignes[]= text.split(separateur);
		for (int i = 0; i < lignes.length; i++) {
			String uneLigne = lignes[i];
			for(int j=0;j<uneLigne.length();j++) {
				System.out.print(uneLigne.charAt(uneLigne.length()-1-j));
			}
			System.out.println();
		}
	} 
}
