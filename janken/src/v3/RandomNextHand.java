package v3;

import java.util.Random;

public class RandomNextHand implements NextHand {

	@Override
	public int decideHand() {
		// 0がグー、1がチョキ、2がパー
		int hand = new Random().nextInt(3);
		return hand;
	}

	
}
