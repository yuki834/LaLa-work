package chap10;

import world.Weapon;

public class Main02 {

	public static void main(String[] args) {
		Weapon w = new Weapon();
		System.out.println(w.name + ":" + w.price);
		w.takeItem();
		w.use();
	}

}
