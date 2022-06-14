package main;

import world.Hero;

public class Main335 {

	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		h1.setHp(100);
		
		Hero h2 = h1;
		h2.setHp(200);
		System.out.println(h1.getHp());
	}
}
