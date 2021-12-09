package world;

public class Dancer extends Character {
	
	public Dancer(String name) {
		super(name);
	}
	
	public void dance() {
		System.out.println(this.getName() + "は情熱的に踊った");
	}

	@Override 
	public void attack(Monster m) {
    	System.out.println(this.getName() + "の攻撃！");
		m.hp = m.hp - 3;
		System.out.println("敵に3ポイントのダメージを与えた！");
		
	}
}
