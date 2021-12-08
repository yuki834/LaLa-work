package chap12;

import world.Hero;
import world.SuperHero;

public class Main03 {

	public static void main(String[] args) {
		Hero c = new SuperHero();
		
		SuperHero h = null;
		if (c instanceof SuperHero) {
			h = (SuperHero) c;
			h.fly();
		}
	}

}

