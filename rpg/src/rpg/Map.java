package rpg;

public class Map {

	private int nbLigne;
	private int nbColonne;
	private char [][] map;

	public Map(int n, int p) {
		nbLigne=n;
		nbColonne=p;
		map = new char[nbLigne][nbColonne];
		for(int i=0; i<nbLigne;i++) {
			for(int j=0; j<nbColonne;j++) {
				map[i][j] = '-';
			}
		}


	}
	public char getCase(int l, int c) {
		return map[l][c];
	}
	public void afficher(){
		System.out.println();
		for(int i=0; i<nbLigne;i++) {
			for(int j=0; j<nbColonne;j++) {
				System.out.print(" | "+ map[i][j]);

			}
			System.out.println(" | ");
		}
		System.out.println();
	}
	public void placer(int l, int c, char t) {
		l = l-1;
		c = c-1;

		if (l<0 || c<0 || l>nbLigne || c>nbColonne) {
			System.out.print("Erreur de placement");
			return;
		}
		if(map[l][c] == '-') {
			map[l][c]= t;
		}
		else {
			System.out.print("Erreur, cette zone est deja occuper !");
		}
	}
	public void deplacerH() {
		char tmp;

		for(int i=0; i<nbLigne;i++) {
			for(int j=0; j<nbColonne;j++) {
				if (map[i][j] == 'J') {
					if(i-1 >=0 && map[i-1][j] == '-') {
					tmp = map[i][j];
					map[i][j]='-';
					map[i-1][j] = tmp;
					}
				}
		}
		
	}
}
	public void deplacerB() {
		char tmp;

		for(int i=0; i< nbLigne;i++) {
			for(int j=0; j < nbColonne;j++) {
				if (map[i][j] == 'J') {
					if(i+1 <= nbLigne && map[i+1][j] == '-') {
					tmp = map[i][j];
					map[i][j]='-';
					map[i+1][j] = tmp;
					}
				}
		}
		
	}
}
	public void deplacerG() {
		char tmp;

		for(int i=0; i<nbLigne;i++) {
			for(int j=0; j<nbColonne;j++) {
				if (map[i][j] == 'J') {
					if(j-1 >=0 && map[i][j-1] == '-') {
					tmp = map[i][j];
					map[i][j]='-';
					map[i][j-1] = tmp;
			}
		}
		
	}}
}
	public void deplacerD() {
		char tmp;

		for(int i=0; i<nbLigne;i++) {
			for(int j=0; j < nbColonne;j++) {
				if (map[i][j] == 'J') {
					if(j+1 <= nbColonne && map[i][j+1] == '-') {
					tmp = map[i][j];
					map[i][j]='-';
					map[i][j+1] = tmp;
			}
		}
		
	}
}
}}
