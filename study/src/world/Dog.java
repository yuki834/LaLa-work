package world;

public class Dog extends Animal {
	
	public void sit() {
		System.out.println(this.getName() + "は座っている");
	}
	
	public void bark() {
		System.out.println(this.getName() + "は吠えた");
		System.out.println("hpが1減った");
		this.setHp(this.getHp() - 1);
	}
}
