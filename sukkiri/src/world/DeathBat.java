package world;

public class DeathBat extends FlyingMonster {

	public DeathBat() {
		System.out.println("デスバットだよ");
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println(h.getName() + "を突っつく");
		
	}

	public void run() {
		System.out.println("地獄コウモリは、羽ばたいて逃げ出した。");
	}
}
