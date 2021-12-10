package chap10_p433;

import world.Hero;

public abstract class FlyingMonster extends Monster {

	
	public abstract void attack(Hero hero);

	public void run() {
		System.out.println("バサバサ飛んで逃げる");
	}
}
