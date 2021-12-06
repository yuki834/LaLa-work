package chap11;

import world.Dancer;
import world.Matango;

public class Main01 {

	public static void main(String[] args) {
		Matango m = new Matango();
		Dancer dancer = new Dancer("めぐみん");
		dancer.attack(m);
	}

}
