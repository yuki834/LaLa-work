package main;

import weapon.Sword;
import world.Hero;

public class Main343 {

	public static void main(String[] args) {
		
		Sword s = new Sword();
		s.setName("炎の剣");
		s.setDamage(10);
		Hero h = new Hero();
		h.setName("ミナト");
		h.setHp(100);
		h.setSword(s);
		System.out.println("現在の武器は" + h.getSword().getName());
	}
}
