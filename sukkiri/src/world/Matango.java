package world;

public class Matango {
	public int hp;
	public final int LEVEL = 10;
	public char suffix;
	
	public Matango() {
		this.hp = 50;
	}
	
	public void run() {
		System.out.println
		  ("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public void attack(Hero h) {
		System.out.println("マタンゴ" + this.suffix + "の攻撃!");
		h.hp = h.hp - 10;
		System.out.println(h.name + "のHPが" + h.hp + "になった。");
	}
	
	public void status() {
		System.out.println(this.suffix + "のHPは" + this.hp);
	}
}
