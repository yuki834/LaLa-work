package ex10;

public class Animal {
	String name;
	
	public Animal() {}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println("とことこ歩く");
	}
	
	public void bark() {
		System.out.println("ほえる");
	}
}
