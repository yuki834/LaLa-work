package world;

public class Hawk extends Animal {
	
	public void go() {
		System.out.println(this.getName() + "は大空を飛んでいる");
		System.out.println("hpを5使った");
		this.setHp(this.getHp() - 5);
		super.go();
	}
}
