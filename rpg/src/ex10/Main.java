package ex10;

import world.Hero;
import world.PoisonMatango;

public class Main {

	public static void main(String[] args) {
		
		PoisonMatango pm = new PoisonMatango('X');
		
		Hero hero = new Hero("ささき");
		pm.attack(hero);
		
//		SuperHero superHero = new SuperHero("アサカ");
//		pm.attack(superHero);
		
		hero.attack(pm);
//		superHero.attack(pm);

	}

}
