package ex13;

import world.Hero;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Wizard w = new Wizard();
		Wand wand = new Wand();
		wand.setName("魔法の杖");
		wand.setPower(10.0);
		w.setWand(wand);
		w.heal(h);

	}

}
