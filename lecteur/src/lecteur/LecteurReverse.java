package lecteur;


import java.io.File;




public class LecteurReverse extends LecteurFichier implements LecteurInterface {
	public File f;
    public LecteurReverse(String nomFichier) {
    super(nomFichier);
    }
    public void affiche (String text){
    		for(int i=0;i<text.length();i++) {
    			System.out.print(text.charAt(text.length()-1-i));
    		}
    		System.out.println();
    }   
}