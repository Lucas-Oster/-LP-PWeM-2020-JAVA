package rpg;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new Map(15, 10);
		
		m1.placer(15, 1, 'J');
		m1.placer(8, 2, 'O');
		m1.placer(5, 4, 'M');
		m1.placer(3, 6, 'O');
		m1.placer(1, 8, 'M');
		m1.placer(9, 10, 'M');
		System.out.println("Joueur = J\nMonster = M\nObstacle = O");
		m1.afficher();
		
		Player p1 =new Player();
		System.out.println("Caracteristique du personnage : ");
		System.out.println(p1.toString());
		
		Monstre e1 = new Monstre();
		int i=0;
		while(i<10) {
		
		System.out.println("\n vers ou voulez vous vous déplacer?\n 1=haut,2=bas,3=gauche,4=droite");
		Scanner sc1 = new Scanner(System.in);
		int nb = sc1.nextInt();
		switch (nb) {
		case 1:m1.deplacerH();
		break;
		case 2:m1.deplacerB();
		break;
		case 3:m1.deplacerG();
		break;
		case 4:m1.deplacerD();
		break;
		default:System.out.println("Mauvais choix !");
		}
		for(int j=0;j<100;j++) {
			System.out.println();
		}
		m1.afficher();
		i++;
		//System.out.println("Debut d'un combat avec un monstre");
		//System.out.println(e1.toString());
		//System.out.println("Vous attaquez un monstre");
		//System.out.println(p1.attaquer());
		//e1.setPv(e1.getPv()-p1.attaquer());
		//System.out.println(e1.toString());
		}
	}

}
