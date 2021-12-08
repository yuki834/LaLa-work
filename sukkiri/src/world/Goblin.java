package world;

public class Goblin extends WalkingMonster {
	
	public Goblin() {
		System.out.println("ゴブリンだよ～");
		this.hp = 70;
	}

	@Override
	public void attack(Hero h) {
		System.out.println("ナイフで斬りつける");
	}
	
	public void attack() {
		System.out.println("だれかれかまわず斬りつける");
	}
	
	public void run() {
		System.out.println("ゴブリンは、腕をふって逃げ出した。");
	}
}
