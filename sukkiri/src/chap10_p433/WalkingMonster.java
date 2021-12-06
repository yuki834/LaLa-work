package chap10_p433;

import world.Hero;

public abstract class WalkingMonster extends Monster {

	public abstract void attack(Hero h);

	public void run() {
		System.out.println("トコトコ走って逃げる");
	}
}
