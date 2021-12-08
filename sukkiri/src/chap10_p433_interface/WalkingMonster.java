package chap10_p433_interface;

import world.Hero;

public abstract class WalkingMonster extends Monster implements WalkingBehavior {

	public abstract void attack(Hero h);

	public void walk() {
		System.out.print("トコトコ走って");
	}
	
	public void run() {
		System.out.println("逃げる");
	}
}
