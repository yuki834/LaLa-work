package v3;

public interface NextHand {

	//じゃんけんの手を決めるメソッドを定義する
	int decideHand();
}

	// インターフェースで決めたメソッドを使えない
	// 上記では int型以外で返すことや、引数を付けたりすることは出来ない