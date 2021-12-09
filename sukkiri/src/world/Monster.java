package world;

public abstract class Monster {
	private int hp;
	private int mp;
	
	public abstract void attack(Hero h);
	
	public void run() {
		System.out.println("モンスターは逃げ出した。");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
}	
