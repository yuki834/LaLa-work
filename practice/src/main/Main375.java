package main;

import world.Hero;
import world.Matango;
import world.SuperHero;

public class Main375 {
	
	public static void main(String[] args) {
		
		Matango das = new Matango();
		Hero h = new Hero();
		h.run();
		
		SuperHero sh = new SuperHero();
		sh.attack(das);
	}

}
