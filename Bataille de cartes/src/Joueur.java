
public class Joueur {
	private Carte[] tabCartes = new Carte[26];
	private int comptePoints;
	
	public Carte tireUneCarte(int i) {
			Carte uneCarte = tabCartes[i];
			tabCartes[i] = null;
			return uneCarte;
	}
	public void addUneCarte(Carte uneCarte, int i) {
			tabCartes[i] = uneCarte; 
	}
	public int getComptePoints() {
		return comptePoints;
	}
	public void setComptePoints(int comptePoints) {
		this.comptePoints = comptePoints;
	}

}
