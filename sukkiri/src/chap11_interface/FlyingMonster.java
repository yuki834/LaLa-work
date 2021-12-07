package chap11_interface;

public abstract class FlyingMonster extends Monster 
                                      implements FlyingBehavior {
	
	public void fly() {
		System.out.print("バサバサ飛んで");
	}
	
	public void run() {
		this.fly();
		System.out.println("逃げる");
	}
}
