package chap12;

import world.Character;
import world.Hero;
import world.Thief;
import world.Wizard;

public class Main04 {

	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		for (Character ch : c) {
			ch.setHp(ch.getHp() + 50);
			System.out.println(ch.getName() + ":" + ch.getHp());
		}
	}

}
