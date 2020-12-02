package lecteur;



public class Lecteur extends LecteurFichier implements LecteurInterface {
	public Lecteur(String nomFichier) {
		super(nomFichier);
	}
	public void affiche (String text) {

    		System.out.println(text);
    	}
	
}