package world;

public abstract class Character {
	
	public String name;
	public int hp;
	
	public Character() {}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m);
	
	public void sleep() {
		System.out.println(this.name + "は眠った");
		System.out.println("hpは10ポイント回復した");
	}

}
