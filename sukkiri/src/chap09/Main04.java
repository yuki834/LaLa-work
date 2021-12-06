package chap09;

import world.Hero;
import world.Matango;

public class Main04 {

	public static void main(String[] args) {
		Matango m = new Matango();
		m.suffix = 'A';
		
		Hero h = new Hero("タロウ");
		// h.takeWeapon();
		
		m.attack(h);
		h.attack(m);
		h.status();
		m.status();

	}

}
