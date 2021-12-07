package world;

import chap11_interface.WalkingMonster;

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

}
