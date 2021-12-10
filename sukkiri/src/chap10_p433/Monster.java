package chap10_p433;

import world.Hero;

public abstract class Monster {

	int hp = 100;
    int mp = 50;

    public abstract void attack(Hero h);

	public abstract void run();

	
}
