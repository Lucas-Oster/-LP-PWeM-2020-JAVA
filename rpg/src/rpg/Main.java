package rpg;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new Map(13, 8);

		m1.placer(13, 1, 'J');
		m1.placer(8, 2, 'O');
		m1.placer(11, 1, 'M');
		m1.placer(3, 6, 'O');
		m1.placer(1, 8, 'M');
		m1.placer(9, 8, 'M');
		System.out.println("Joueur = J\nMonster = M\nObstacle = O");
		m1.afficher();
		
		Player p1 =new Player();
		System.out.println("Bienvenue ");
		System.out.println("Choissisez une classe 1 = barbare, 2 = mage, 3 = archer, 4 = Tank");
		Scanner sc0 = new Scanner(System.in);
		int cp = sc0.nextInt();
		switch (cp) {
		case 1:p1.setForce(12);
				p1.setPv(80);
				p1.setMana(0);
		System.out.println("Caracteristique du personnage : ");
		System.out.println(p1.toString());
		break;

		case 2:p1.setPv(55);
			p1.setForce(16);
			p1.setMana(100);
		System.out.println("Caracteristique du personnage : ");
		System.out.println(p1.toString());
		break;
		case 3:p1.setPv(68);
				p1.setForce(15);
		System.out.println("Caracteristique du personnage : ");
		System.out.println(p1.toString());
		break;
		case 4:p1.setPv(120);
			p1.setForce(8);
		System.out.println("Caracteristique du personnage : ");
		System.out.println(p1.toString());
		break;}
		Monstre e1 = new Monstre();
		int i=0;
		System.out.println("\n bien");
		
		while(i<10) {

			System.out.println("\n vers ou voulez vous vous déplacer?\n 1 = haut, 2 = bas, 3 = gauche, 4 = droite ou 5 = Quitter le jeu");
			Scanner sc1 = new Scanner(System.in);
			int nb = sc1.nextInt();
			switch (nb) {
			case 1:m1.deplacerH();
			m1.afficher();
			System.out.println("debut du combat... ");
			System.out.println("\n fuire ou combattre?\n 1 = fuire , 2 = combattre");
			Scanner sc2 = new Scanner(System.in);
			int cb1 = sc2.nextInt();
			switch (cb1) {
			case 1:m1.deplacerB();
			m1.afficher();
			break;
			case 2:
				while(p1.getPv()>0 && e1.getPv() > 0) {
					
					System.out.println("Caracteristiques adverse : ");
					System.out.println(e1.toString());
					System.out.println("Caracteristique du personnage : ");
					System.out.println(p1.toString());
					System.out.println("vous lancer une attaque : ");
					e1.setPv(e1.getPv()-p1.attaquer());
					System.out.println("vous êtes attaquer : ");
					p1.setPv(p1.getPv()-e1.attaquer());
					
				}
				p1.setGold(+30);
				System.out.println(p1.toString());
				System.out.println("VICTOIRE !");
				m1.afficher();
				break;
			}
			break;
			case 2:m1.deplacerB();
			m1.afficher();
			System.out.println("debut du combat... ");
			System.out.println("\n fuire ou combattre?\n 1 = fuire , 2 = combattre");
			Scanner sc3 = new Scanner(System.in);
			int cb2 = sc3.nextInt();
			switch (cb2) {
			case 1:m1.deplacerH();
			m1.afficher();

			case 2:
				while(p1.getPv()>0 && e1.getPv() > 0) {

					System.out.println("Caracteristiques adverse : ");
					System.out.println(e1.toString());
					System.out.println("Caracteristique du personnage : ");
					System.out.println(p1.toString());
					System.out.println("vous lancer une attaque : ");
					e1.setPv(e1.getPv()-p1.attaquer());
					System.out.println("vous êtes attaquer : ");
					p1.setPv(p1.getPv()-e1.attaquer());
					

				}
				p1.setGold(+30);
				System.out.println("VICTOIRE !");
				m1.afficher();
				break;

			}
			break;



			case 3:m1.deplacerG();
			m1.afficher();
			System.out.println("debut du combat... ");
			System.out.println("\n fuire ou combattre?\n 1 = fuire , 2 = combattre");
			Scanner sc4 = new Scanner(System.in);
			int cb3 = sc4.nextInt();
			switch (cb3) {
			case 1:m1.deplacerD();
			m1.afficher();

			case 2:
				while(p1.getPv()>0 && e1.getPv() > 0) {

					System.out.println("Caracteristiques adverse : ");
					System.out.println(e1.toString());
					System.out.println("Caracteristique du personnage : ");
					System.out.println(p1.toString());
					System.out.println("vous lancer une attaque : ");
					e1.setPv(e1.getPv()-p1.attaquer());
					System.out.println("vous êtes attaquer : ");
					p1.setPv(p1.getPv()-e1.attaquer());
					
				}
				p1.setGold(+30);
				System.out.println("VICTOIRE !");
				m1.afficher();
				break;
			}
			break;

			case 4:m1.deplacerD();
			m1.afficher();
			System.out.println("debut du combat... ");
			System.out.println("\n fuire ou combattre?\n 1 = fuire , 2 = combattre");
			Scanner sc5 = new Scanner(System.in);
			int cb4 = sc5.nextInt();
			switch (cb4) {
			case 1:m1.deplacerG();
			

			case 2:
				while(p1.getPv()>0 && e1.getPv() > 0) {

					System.out.println("Caracteristiques adverse : ");
					System.out.println(e1.toString());
					System.out.println("Caracteristique du personnage : ");
					System.out.println(p1.toString());
					System.out.println("vous lancer une attaque : ");
					e1.setPv(e1.getPv()-p1.attaquer());
					System.out.println("vous êtes attaquer : ");
					p1.setPv(p1.getPv()-e1.attaquer());
					
				}
				p1.setGold(+30);
				System.out.println("VICTOIRE !");
				System.out.println(p1.toString());
				m1.afficher();
				break;
			}
			break;
			case 5:System.exit(0);
			break;
			default:System.out.println("Mauvais choix !");
			}

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
