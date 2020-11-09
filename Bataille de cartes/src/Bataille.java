
public class Bataille {
		
	public static void main(String[] args) {
		//creation des joueurs
		Joueur j1 = new Joueur();
		Joueur j2 = new Joueur();
		//creation du paquets de 52 cartes
		Carte[] paquet = new Carte[52];
		for(int i =0; i<13;i++) {
			for(int j=0;j<4;j++) {
				paquet[i*4+j]= new Carte(Carte.tabCouleur[j], i);
			}
		}
		//melange du paquet
		for (int i = 0;i<paquet.length;i++) {
			int ir =(int) ( 52*Math.random());
			Carte aux = paquet[i];
			paquet[i]=paquet[ir];
			paquet[ir]=aux;
		}
		//Distribution des cartes
		int ip=0;
		for (int i =0;i<26;i++) {
			j1.addUneCarte(paquet[ip], i);ip++;
			j2.addUneCarte(paquet[ip], i);ip++;//!!!!!
		}
		//boucle de jeu
		int gain = 1;
		for (int i = 0;i<26;i++) {
			Carte c1 = j1.tireUneCarte(i);
			Carte c2 = j2.tireUneCarte(i);
			if (c1.compareTo(c2)>0) {
				j1.setComptePoints(j1.getComptePoints()+gain);
				gain=1;
			}
			if (c1.compareTo(c2)<0) {
				j2.setComptePoints(j2.getComptePoints()+1);
				gain=1;
			}
			//bataille !
			if (c1.compareTo(c2)==0) {
			gain=gain+1;
			}
			System.out.println(""+c1+" vs "+c2);
			System.out.println("score joueur1 "+j1.getComptePoints()+" score joueur2 "+j2.getComptePoints());
		}
		if(j1.getComptePoints()>j2.getComptePoints()) {
			System.out.println("joueur1 remporte la partie");
		}
		if(j1.getComptePoints()<j2.getComptePoints()) {
			System.out.println("joueur2 remporte la partie");
		}
		if(j1.getComptePoints()==j2.getComptePoints()) {
			System.out.println("Egalité");
		}
	}
	
}
