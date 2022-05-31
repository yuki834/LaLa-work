package world;

public class Animal {
	
	public String name = "アニマル";
	public int hp = 10;
	
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
}
