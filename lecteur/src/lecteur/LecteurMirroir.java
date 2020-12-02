package lecteur;

public class LecteurMirroir extends LecteurFichier implements LecteurInterface {
	public LecteurMirroir(String nomFichier) {
		super(nomFichier);
	}
	public void affiche (String text) {

		String separateur = "\r\n"; //(version windows)
		String lignes[]= text.split(separateur);
		for (int i = 0; i < lignes.length; i++) {
			System.out.println(lignes[lignes.length-1-i]);
		}
	}
}