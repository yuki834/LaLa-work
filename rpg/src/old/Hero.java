package old;

//import world.Sword;

public class Hero {
	
	public String name;
	public int hp;
//	public Sword sword;
	
	public Hero() {
		this("ダミー");
	}
	public Hero(String name) {
		
		this.name = name;
		this.hp = 100;
	}
	
//	public void attack() {
//		
////		System.out.println(this.name + "は" + this.sword.name + "攻撃した");
//		System.out.println("敵に5ポイントのダメージを与えた！");
//	}
	public void sleep() {
		
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	}
	public void sit(int sec) {
		
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println("5のダメージ");
	}
	public void run() {
		
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
}
