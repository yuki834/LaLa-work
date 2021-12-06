package world;

public class Weapon extends Item {
	public Weapon() {
		super("ななしの剣");
	}

	public void useItem() {
		System.out.println(this.name + "をぶっ放す");
	}
}
