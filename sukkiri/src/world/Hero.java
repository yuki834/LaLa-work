package world;

public class Hero extends Character {
	private String name = "ミナト";
	private int hp = 100;       // HP
    private Sword sword;
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	
	public Hero(String name) {
		this.name = name;
	}

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		m.setHp(m.getHp() - 5);
		System.out.println("5ポイントのダメージを与えた");
		
		System.out.println("モンスターから2ポイントの反撃を受けた");
		this.hp = this.hp - 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	
	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVER です");
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	public final void slip() {
		System.out.println(this.name + "転んだ");
		
	}
	

	public void status() {
		System.out.println("名前:" + this.name + " HP:" + this.hp);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
			("名前がnullである。処理を中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException
			("名前が短すぎる。処理を中断");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException
			("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	public String toString() {
	    String text = "名前:" + this.getName() + " HP:" + this.getHp() +
					" アイテム:" + this.getSword().name;
	    return this.getName();
	}
}
