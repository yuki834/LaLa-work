package chap04;

public class Main03 {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			if(scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の数は" + count);
	}

}
