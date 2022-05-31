package world;

public class Matango {
	public int hp = 50;
	public char suffix;

	
	public Matango() {
		this.suffix = 'A';
	}
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("お化けキノコ" + this.suffix + "の攻撃");
		System.out.println("ヒーローに10のダメージ");
		h.hp -= 10;
		System.out.println("ヒーローのHP:" + h.hp);
	}
	
}
