package world;

import java.util.Random;

public class Cleric {

	private String name;
	private int hp = 50;
	public final int HP_MAX = 50;
	private int mp = 10;
	public final int MP_MAX = 10;
	
	public void selfAid() {
		this.mp = this.mp - 5;
		this.hp = HP_MAX;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
}
