package world;

public abstract class Monster {
	public int hp;
	int mp;
	
	public abstract void attack(Hero h);
	
	public void run() {
		System.out.println("モンスターは逃げ出した。");
	}
}	
