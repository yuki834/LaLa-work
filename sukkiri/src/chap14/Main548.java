package chap14;

public class Main548 {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		System.out.println(h1.money);
	}

}
