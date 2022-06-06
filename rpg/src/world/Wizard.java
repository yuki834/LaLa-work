package world;

public class Wizard{
	
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public Wizard() {}
	
	public Wizard(Wand wand) {
		this.setWand(wand);
		}
	
	void heal(Hero h) {
		
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
//		h.hp += 10;
//		System.out.println(h.getName() + "のHPを10回復した");
	}

	
	public void attack(Matango m) {
		
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		
		if(hp <= 0) {
			this.hp = 0;
		}
		
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		
		if(mp <= 0) {
			String msg = "MPは0以上です";
				throw new IllegalArgumentException(msg);
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		if(name == null) {
			throw new IllegalArgumentException("3文字以上入力してください");
		}
		if(name.length() <= 2) {
			throw new IllegalArgumentException("3文字以上入力してください");
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if(wand == null) {
			String msg = "杖が指定されていません";
			throw new IllegalArgumentException(msg);
		}
		this.wand = wand;
	}


}
