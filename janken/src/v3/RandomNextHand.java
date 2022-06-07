package v3;

import java.util.Random;

public class RandomNextHand implements NextHand {

	@Override
	public int decideHand() {
		// 0がグー、1がチョキ、2がパー
		//0~2のランダムな数をhandに代入しreturnで返す
		int hand = new Random().nextInt(3);
		return hand;
	}

	
}
