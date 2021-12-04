package chap09;

import world.Hero;
import world.Matango;
import world.Sword;

public class Main02 {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("私の名前は" + h.name);
		System.out.println("現在の武器は" + h.sword.name);
		// h.attack();
		Matango m = new Matango();
		m.suffix = 'Z';
		h.attack(m);
	}

}
