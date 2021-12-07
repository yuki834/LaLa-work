package chap11;

import world.DeathBat;
import world.Goblin;
import world.Hero;
import world.WereWolf;

public class Main03 {

	public static void main(String[] args) {
		
		Hero h = new Hero();
		Goblin g = new Goblin();
		g.attack(h);
		g.run();
		
		WereWolf w = new WereWolf();
		w.attack(h);
		w.run();
		
		DeathBat d = new DeathBat();
		d.attack(h);
		d.run();
	}

}
