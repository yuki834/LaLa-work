package chap11_interface;

import world.Hero;

public abstract class Monster {
	public int hp;
	int mp;
	
	public abstract void attack(Hero h);
	
	public abstract void run();
}	
