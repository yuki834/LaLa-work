package chap11_interface;

public abstract class WalkingMonster extends Monster implements WalkingBehavior {
	
	public void walk() {
		System.out.print("トコトコ走って");
	}
	
	public void run() {
		this.walk();
		System.out.println("逃げる");
	}

}
