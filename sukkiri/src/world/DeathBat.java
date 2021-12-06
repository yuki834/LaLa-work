package world;

import chap10_p433_interface.FlyingMonster;

public class DeathBat extends FlyingMonster {

	public DeathBat() {
		System.out.println("デスバットだよ。");
	}

	@Override
	public void attack(Hero hero) {
		System.out.println(hero.name + "を突っつく");
	}


}
