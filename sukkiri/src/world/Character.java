package world;

public abstract class Character {
	public String name;
	public int hp;
	
	public Character() {
		
	}
	
	public Character(String name) {
		this.name = name;
		this.hp = 50;
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Monster m);
}
