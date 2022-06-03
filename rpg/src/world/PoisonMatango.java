package world;

public class PoisonMatango extends Matango {

	public int pcount = 5;
	
	public PoisonMatango(char suffix) {
		
		super(suffix);
	}
	
	public void attack(Hero h) {
		System.out.println("キノコの攻撃");
		super.attack(h);
		
//		if(pcount != 0) {
//			System.out.println("さらに毒の胞子をばら撒いた");
////			int damage = h.hp / 5;
////			h.hp -= damage;
////			System.out.println(h.name + damage + "ポイントのダメージ");
//			pcount--;
//			System.out.println("毒攻撃残り回数:" + pcount);

//		}
	}
}

