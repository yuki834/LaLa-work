package world;

public class Wizard {

	private String name;
	private int hp;
	
	public void heal(Hero h) {
		
		h.setHp(h.getHp() + 10);
		System.out.println(h.getName() + "のHPを10回復した");
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
