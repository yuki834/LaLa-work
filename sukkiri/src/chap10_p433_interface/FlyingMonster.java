package chap10_p433_interface;

import world.Hero;

public abstract class FlyingMonster extends Monster implements FlyingBehavior{

	public void fly() {
		System.out.print("バサバサ飛んで");
	}
	
	public abstract void attack(Hero hero);

	public void run() {
		fly();
		System.out.println("逃げる");
		
	}
}
