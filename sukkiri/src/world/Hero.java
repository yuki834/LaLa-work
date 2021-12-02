package world;

public class Hero {
	public String name;  // 名前
	public int hp;       // HP
	public Sword sword;

	public Hero() {
		this.hp = 100;
	}
	
	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "はお化けキノコ" + m.suffix + "を攻撃した！");
		System.out.println(m.suffix + "に5ポイントのダメージを与えた");
		m.hp = m.hp - 5;
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp = this.hp + sec;
		System.out.println
			(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	
	public void slip() {
		this.hp = this.hp - 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
	public void status() {
		System.out.println(this.name + "のhpは" + this.hp);
		if (this.sword != null) {
			System.out.println("使用する武器は" + this.sword.name);
		}
	}
}
