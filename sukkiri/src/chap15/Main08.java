package chap15;

import world.Hero;

public class Main08 {

	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";

		Hero hero = new Hero();
		hero.setName("ミナト");
		hero.setGold(1000000);
		hero.setJob("勇者");
		
		String s = String.format(
				FORMAT, 
				hero.getName(), 
				hero.getJob(), 
				hero.getGold());
		
		System.out.println(s);

	}

}
