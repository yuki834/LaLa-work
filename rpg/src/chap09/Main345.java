package chap09;

import world.Hero;
import world.Wand;
import world.Wizard;

public class Main345 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.setName("ミナト");
		h1.setHp(100);
		Hero h2 = new Hero();
		h2.setName("アサカ");
		h2.setHp(100);
		
		Wand wand = new Wand("ロッド");
		Wizard w = new Wizard();
		w.setName("スガワラ");
		w.setHp(50);
//		w.heal(h1);
//		w.heal(h2);
//		w.heal(h2);
//		System.out.println("h1=" + h1.hp);
//		System.out.println("h2=" + h2.hp);

	}

}
