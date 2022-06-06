package world;

public class Animal {
	
	private String name = "アニマル";
	private int hp = 10;
	private boolean life = true;
	
	public Animal() {
		this.name = "アニマル";
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name + "は食べている");
		System.out.println("hpが10上がった");
		this.hp += 10;
	}
	
	public void go(){
	
		System.out.println(this.name + "は走り回っている");
		System.out.println("hpが5減った");
		this.hp -= 5;
	}
	
	public void dead() {
		System.out.println(this.name + "は死んだ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	//boolean型はis/setで使われるように決まっている
	public boolean isLife() {
		return life;
	}

	public void setLife(boolean life) {
		this.life = life;
	}
}
