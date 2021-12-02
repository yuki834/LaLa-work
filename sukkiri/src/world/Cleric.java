package world;

import java.util.Random;

public class Cleric {
	public String name;
	int hp = 50;
	final int HP_MAX = 50;
	int mp = 10;
	final int MP_MAX = 10;
	
	public void selfAid() {
		this.mp = this.mp - 5;
		this.hp = this.HP_MAX;
		System.out.println
			(this.name + "は セルフエイド という魔法を使った。");
		System.out.println(this.name + "のMPを5使った。");
		System.out.println(this.name + "のHPが" + this.hp + "に回復した。");
	}
	
	public int pray(int sec) {
		Random random = new Random();
		int rMp = sec + random.nextInt(3);
		this.mp = this.mp + rMp;
		if (this.mp > MP_MAX) {
			this.mp = MP_MAX;
		}
		System.out.println(this.name + "は" + sec + "秒祈った。");
		System.out.println(this.name + "のMPが" + this.mp + "に回復した。");
		return this.mp;
	}
}
