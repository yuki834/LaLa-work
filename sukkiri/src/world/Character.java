package world;

public abstract class Character {
	String name;
	int hp;
	
	public Character(String name) {
		this.name = name;
		this.hp = 50;
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m);
//	{
//		System.out.println(this.name + "の攻撃！");
//		m.hp = m.hp - ??;
//		System.out.println("敵に??ポイントのダメージを与えた！");
//	}
}
