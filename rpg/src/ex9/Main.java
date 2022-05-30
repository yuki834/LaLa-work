package ex9;

import world.Thief;

public class Main {

	public static void heal(int hp) {
		hp += 10;

	}
	
	public static void heal(Thief theif) {
		theif.hp += 10;
	}

	public static void main(String[] args) {
		
		int baseHp = 25;
		Thief t = new Thief("アサカ",baseHp);
		System.out.println(baseHp + ":" +t.hp);
		heal(baseHp);
		heal(t);
		System.out.println(baseHp + ":" +t.hp);
	
		Thief t2 = new Thief("ここも");
		System.out.println(t2.mp);
	}

/*
 * baseHpはmainメソッド内のbaseHpを参照している。
 * t.hpはインスタンスを生成したときに、コンストラクタでbaseHpを参照しており、
 * heal(Thief thief)メソッド内にて、hpを回復しているため
 */

}


