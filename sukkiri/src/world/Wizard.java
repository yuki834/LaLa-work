package world;

public class Wizard extends Character {
	private int mp = 30;
	
	public Wizard(String name) {
		super(name);
	}
	
	public Wizard() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void heal(Hero h) {
		h.setHp(h.getHp() + 10);
		System.out.println(h.getName() + "のHPを10回復した！");
	}

	@Override
	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ");
		m.setHp(m.getHp() - 3);
	}
	
	public void fireball(Matango m) {
		System.out.println(this.getName() + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.setHp(m.getHp() - 20);
		this.mp = this.mp - 5;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
}
