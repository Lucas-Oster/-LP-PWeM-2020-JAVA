package rpg;

import java.util.ArrayList;

abstract class Weapon {
	protected double damage;
	public Weapon( double damage) {
			this .damage = damage;
			}
		abstract public String ascii_art();
	}
	class Axe extends Weapon {
		private static final double DAMAGE = 10;
		public Axe() {
			super (DAMAGE);
		}
			public String ascii_art() {
				return
						"<|>\n" +
						" | \n" +
						" | \n";
}
}
	class Hammer extends Weapon {
		private static final double DAMAGE = 20;
		public Hammer() {
		super (DAMAGE);
		}
		public String ascii_art() {
		return  " _ _ \n" +
		        "|_|_|\n" +
		        "  | \n" +
		        "  | \n";
		}
		}
	

class Bow extends Weapon {

	private static final double DAMAGE = 20;
	public Bow() {	
	super(DAMAGE);
		// TODO Auto-generated constructor stub
	}
	public String ascii_art() {
		return  "    ( \n" +
		        "     \     \n" +
		        "      )	\n" +
		        "##--------> \n" +
		        "      )\n" +
		        "     / \n" +
		        "    ( \n";
      
		}
		}

	

class Sword extends Weapon {

	private static final double DAMAGE = 15;
	public Sword() {	
	super(DAMAGE);
		// TODO Auto-generated constructor stub
	}
	public String ascii_art() {
		return  "  		 \n" +
		        "  ||   \n" +
		        " _||_ \n" +
		        "  ||  \n";
		}
	}
class TestWeapon {
	public static void main (String[] agrs) {
		ArrayList <Weapon> store = new ArrayList<>();
		store.add(new Hammer());
		store.add(new Sword());
		store.add(new Axe());
		store.add(new Bow());
		for (Weapon w : store) {
			System.out.println(w.ascii_art());
		}
	}







}

	
	
	
