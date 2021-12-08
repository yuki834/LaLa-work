package world;

public class DeathBat extends FlyingMonster {

	public DeathBat() {
		System.out.println("デスバットだよ");
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println(h.name + "を突っつく");
		
	}

}
