package rpg;

public class Destructible {
 protected double life = 100;
 public void hit_me(double damage) { life -= damage;}
}
class Monster extends Destructible{
	
}
class Obstacle extends Destructible{
	
}