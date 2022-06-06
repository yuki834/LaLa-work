package ex13;

import world.Wand;
import world.Wizard;

public class Ex13 {

	public static void main(String[] args) {

		Wizard w = new Wizard();
		w.setName("アカギ");
		System.out.println(w.getName());
		Wand wa = new Wand("麻雀牌");
//		wa.setName("天鳳!");
		System.out.println(wa.getName());
		wa.setPower(0.5);
		System.out.println("増幅率は" + wa.getPower());
	}

}
