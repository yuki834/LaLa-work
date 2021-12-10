package world;

public class PoisonMatango extends Matango {
	private int count = 5;
	
	public PoisonMatango(char suffix) {
		// this.suffix = suffix;
		super(suffix);
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (this.count > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.getHp() / 5;
			h.setHp(h.getHp() - damage);
			System.out.println(damage + "ポイントのダメージ");
			this.count--;
		} else {
			System.out.println("毒攻撃はもうできません");
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
