package world;

import weapon.Sword;

public class Hero {

	private String name = "ミナト";
	private int hp;
	private int mp;
	private Sword sword;
	
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
	
	public void attack(Matango m) {
	
		System.out.println(this.name + "の攻撃");
		m.setHp(m.getHp() - 5);
		System.out.println("敵に5ポイントのダメージを与えた");
		
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	
}
