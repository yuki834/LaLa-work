package chap11_p433;

import world.Hero;

public abstract class Monster {
	public int hp;
	int mp;
	
	public abstract void attack(Hero h);
	
	public abstract void run();
}	
