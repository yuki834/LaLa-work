package chap10;

import world.Hero;
import world.Matango;
import world.SuperHero;

public class Main01 {

	public static void main(String[] args) {
		Matango m = new Matango();
		m.setSuffix('B');
		
		Hero h = new Hero();
		h.attack(m);
		h.run();
		
		SuperHero sh = new SuperHero();
		sh.run();
		sh.attack(m);
		sh.fly();
		sh.land();

	}

}
