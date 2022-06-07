package v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNextHand implements NextHand {

	@Override
	public int decideHand() {
		int hand = -1;
		do {
			// 0がグー、1がチョキ、2がパー
			System.out.println("手を選択してください");
			System.out.println("0がグー、1がチョキ、2がパー");
			System.out.print(" > ");
			//エラーの検証
			try {
				hand = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e) {
				//エラーが発生した場合に走る処理
//				e.printStackTrace();
				System.out.println("数字を入力してください");
				hand = -1;
			}
		} while (hand < 0 || hand > 2);
		return hand;
	}

}
