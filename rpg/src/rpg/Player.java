package rpg;

import java.util.Random;

public class Player {
	
	private int pv;
	private int exp;
	private int mana;
	private int gold;
	private int force;
	private String nom;
	private String classe;
	
	public Player() {
		this.pv=100;
		this.exp=0;
		this.force=10;
		this.mana=100;
		this.gold=0;
		this.nom="";
		this.classe="";
	}
	
	public Player(int v, int x, int g, int m, int f) {
		pv=v;
		exp=x;
		gold=g;
		mana=m;
		force=f;
	}
	public int getPv() {
		return pv;
	}
	public void setPv(int v) {
		pv = v;
		if(pv < 0) {
			pv=0;
		}
	}
	public int getMana() {
		return mana;
	}

	public void setMana(int m) {
		mana = m;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int x) {
		force= x;
	}
	public int getGold() {
		return gold;
	}

	public void setGold(int g) {
		gold = g;
	}

	public int getExp() {
		
		return exp;
	}
	public void setExp(int x) {
		exp=x;
	}
	public int attaquer() {
		Random rand = new Random();
		int d = rand.nextInt(force)+1;
		return d;
	}
	public String toString() {
		return "vie du personnage:"+pv+"\n force:"+force+"\n mana:"+mana+"\n xp:"+exp+"\n gold:"+gold;
	}
}
