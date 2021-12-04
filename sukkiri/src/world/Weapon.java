package world;

public class Weapon extends Item {
	public Weapon() {
		super("BaZooka");
	}
	
	public Weapon(String name) {
		super(name);
	}
	public Weapon(String name, int price) {
		super(name, price);
	}
	
	public void use() {
		System.out.println(this.name + "をぶっ放す。");
	}
}
