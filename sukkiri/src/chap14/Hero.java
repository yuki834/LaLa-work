package chap14;

public class Hero {
	String name;
	int hp;
	static int money;
	public static final String BIG_BOSS = "新庄";
	
	public String toString() {
		return "name:" + this.name + "/HP:" + this.hp;
	}
	
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
	
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		// System.out.println(name + "たちの所持金を初期化しました");
	}
}
