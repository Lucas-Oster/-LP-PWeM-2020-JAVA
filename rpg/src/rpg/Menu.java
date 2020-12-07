package rpg;

public class Menu{
	 
     
     while (!arret){
	System.out.println("--Mon menu--");
	System.out.println("Sous menu 1 : tapez 1");
	System.out.println("Sous menu 2 : tapez 2");
	System.out.println("Sous menu 3 : tapez 3");
     System.out.println("quitter : tapez 9");
	
	int sousmenu;
	switch(sousmenu)
	{
		case 1 :{
					int choix = 0;
					System.out.println("---Sous menu 1---");
					System.out.println("Sous menu 1-1 : tapez 1");
					System.out.println("Sous menu 1-2 : tapez 2");
                                     System.out.println("quitter : tapez 9");
					
					switch(choix){
						case 1 : System.out.println("Sous menu 1-1"); break;
						case 2 : System.out.println("Sous menu 1-2"); break;
                                             
                                             default : System.out.println("entrez un choix entre 1 et 2"); break;
					}
				} break;
		case 2 : System.out.println("Sous menu 2"); break;
		case 3 : System.out.println("Sous menu 2"); break;
             
		default : System.out.println("entrez un choix entre 1 et 3"); break;
	}
     }}

