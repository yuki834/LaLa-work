package chap09;

import world.Hero;
import world.Wizard;

public class Main03 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";

		Hero h2 = new Hero();
		h2.name = "アサカ";

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		h1.status();
		h2.status();
		
		
	}

}
