package chap12;

import world.Character;
import world.Matango;
import world.Wizard;

public class Main {

	public static void main(String[] args) {
		Character c = new Wizard();
		Wizard w = (Wizard) c;
		Matango m = new Matango();		
		c.name = "アサカ";
		c.attack(m);
		// c.fireball(m);
	}

}
