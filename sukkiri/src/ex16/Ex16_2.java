package ex16;

import java.util.ArrayList;
import java.util.List;

public class Ex16_2 {

	public static void main(String[] args) {
		
		Hero h1 = new Hero("あああああ");
		Hero h2 = new Hero("いいいいい");
		Hero h3 = new Hero("ううううう");
		List<Hero> heros = new ArrayList<>();
		heros.add(h1);
		heros.add(h2);
		heros.add(h3);
		
		for(Hero hero : heros ) {
			System.out.println(hero.getName());
		}
	}
}

class Hero{
	private String name;
	public Hero(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
