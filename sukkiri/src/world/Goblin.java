package world;

import chap10_p433_interface.WalkingMonster;

public class Goblin extends WalkingMonster  {
	
	public Goblin() {
		System.out.println("ゴブリンだよ");
	}

	@Override
	public void attack(Hero h) {
		System.out.println(h.name + "にナイフで斬りつける");
	}


}
