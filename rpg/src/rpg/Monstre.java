package rpg;

import java.util.Random;

public class Monstre {
	
	private int pv;
	private int force;
	
	public Monstre() {
		pv=30;
		force=10;
	}
	
	public Monstre(int v, int x) {
		pv=v;
		force=x;
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
	public int getForce() {
		return force;
	}
	public void setForce(int x) {
		force= x;
	}
	public int attaquer() {
		Random rand = new Random();
		int d = rand.nextInt(force)+1;
		return d;
	}
	public String toString() {
		return "vie du Monstre:"+pv+"\n force:"+force;
	}
}
