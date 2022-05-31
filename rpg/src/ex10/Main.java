package ex10;

import world.Hero;
import world.PoisonMatango;
import world.SuperHero;

public class Main {

	public static void main(String[] args) {
		
		PoisonMatango pm = new PoisonMatango('B');
		
		Hero hero = new Hero();
		pm.attack(hero);
		
		SuperHero superHero = new SuperHero("アサカ");
		pm.attack(superHero);
		
		hero.attack(pm);
		superHero.attack(pm);

	}

}
