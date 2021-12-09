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
		h.setName("ミナト");
		h.setHp(100);
		h.setSword(s);
		System.out.println("私の名前は" + h.getName());
		System.out.println("現在の武器は" + h.getSword().name);
		// h.attack();
		Matango m = new Matango();
		m.setSuffix('Z');
		h.attack(m);
	}

}
