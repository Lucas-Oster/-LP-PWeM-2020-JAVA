
public class Carte implements Comparable{
	public static String[] tabCouleur = {"pique", "coeur", "careau", "tréfle"};
	public static String[] tabValeur = {"deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf","dix", "valet", "dame", "roi", "as"};
	private String couleur;
	private int valeur;
	@Override
	public String toString() {
		return "" +tabValeur[valeur]+ " de " + couleur;
	}
	public Carte(String couleur,int valeur)
	{
		 this.couleur = couleur;
		  this.valeur = valeur;//la position dans le tableau tabValeur
		 
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Carte c = (Carte)arg0;
		return this.valeur-c.valeur;
	}
	
}
