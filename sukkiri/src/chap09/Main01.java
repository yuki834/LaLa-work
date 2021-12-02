package chap09;

import world.Hero;

public class Main01 {

	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		
		Hero h2;
		// h2 = new Hero();
		h2 = h1;
		h2.hp = 200;
		
		System.out.println(h1.hp);
		System.out.println(h2.hp);
	}

}
