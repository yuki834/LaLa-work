package world;

/**
 * 練習問題 9.4  p.364
 * @author Seiichi Nukayama
 * Thief -- 泥棒
 */
public class Thief extends Character {
	String name;
	public int hp;
	int mp;
	
	public Thief () {
		this("五右衛門", 40, 5);
	} 
	
	public Thief (String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Thief (String name, int hp) {
		this(name, hp, 5);
	}
	
	public Thief(String name) {
		this(name, 40, 5);
	}

	@Override
	public void attack(Monster m) {
		System.out.println("5ポイントの攻撃");
	}

}
