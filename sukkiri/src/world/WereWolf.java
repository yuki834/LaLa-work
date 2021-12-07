package world;

import chap11_interface.WalkingMonster;

public class WereWolf extends WalkingMonster {

	public WereWolf() {
		System.out.println("WereWolfだよ");
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println(h.name + "を噛みつく");
		
	}

}
