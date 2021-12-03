package chap09;

import world.Thief;

public class Main05 {

	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("Asaka", baseHp);
		System.out.println(baseHp + " : " + t.hp);
		t.hp = heal(baseHp);
		heal(t);
		System.out.println(baseHp + " : " + t.hp);
	}
	
	public static void heal (Thief thief) {
		thief.hp = thief.hp + 10;
	}
	
	public static int heal(int hp) {
		hp = hp + 10;
		return hp;
	}

}
