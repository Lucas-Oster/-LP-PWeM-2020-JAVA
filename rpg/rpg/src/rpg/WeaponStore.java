package rpg;

public abstract class WeaponStore extends Weapon {
	
public WeaponStore(double damage) {
		super(damage);
		// TODO Auto-generated constructor stub
	}
Weapon cheater = new Weapon(100 ) ; // Weapon
Weapon axe = new Axe () ; // Axe
Weapon hammer = new Hammer ( ) ; // Hammer
int number_weapons = 3 ; // int
Number extra_damage = new Integer (42) ; // Integer
// The dynamic type o f w can be
// Weapon , Axe o r Hammer.
public int price(Weapon w) {
	return number_weapons;

}
}
