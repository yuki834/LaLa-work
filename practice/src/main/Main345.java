package main;

import world.Hero;
import world.Wizard;

public class Main345 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.setName("ミナト");
		h1.setHp(100);
		Hero h2 = new Hero();
		h2.setName("アサカ");
		h2.setHp(100);
		System.out.println("ミナトのHPは" + h1.getHp());
		
		Wizard w = new Wizard();
		w.setName("スガワラ");
		w.setHp(50);
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.getHp());
		System.out.println(h2.getHp());
	}
}
