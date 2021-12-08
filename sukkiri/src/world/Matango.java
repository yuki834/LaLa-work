package world;

public class Matango extends Monster {
	public int hp;
	// public final int LEVEL = 10;
	public char suffix;
	
	public Matango() {
		this.hp = 50;
	}
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void run() {
		System.out.println
		  ("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃!");
		System.out.println("10のダメージ");
		int nowHp = h.getHp() - 10;
		h.setHp(nowHp);
		// System.out.println(h.name + "のHPが" + h.hp + "になった。");
	}
	
	public void status() {
		System.out.println(this.suffix + "のHPは" + this.hp);
	}
}
