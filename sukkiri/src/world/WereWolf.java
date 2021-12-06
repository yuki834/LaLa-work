package world;

import chap10_p433_interface.WalkingMonster;

public class WereWolf extends WalkingMonster {
	
	public WereWolf() {
		System.out.println("ワーウルフだよ");
	}

	public void attack(Hero h ) {
		System.out.println(h.name + "にかみつく");
	}


}
