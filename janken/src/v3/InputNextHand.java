package v3;

import java.util.Scanner;

public class InputNextHand implements NextHand {

	@Override
	public int decideHand() {
		// 0がグー、1がチョキ、2がパー
		System.out.println("手を選択してください");
		System.out.println("0がグー、1がチョキ、2がパー");
		System.out.print(" > ");
		@SuppressWarnings("resource")
		int hand = new Scanner(System.in).nextInt();
		return hand;
	}


}
