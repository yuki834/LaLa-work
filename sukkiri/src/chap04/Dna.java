package chap04;

public class Dna {

	public static void main(String[] args) {
		int seq[] = new int[10];
		
		// 塩基配列
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		// 表示
		String enki = null;
		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
			case 0:
				enki = "A "; break;
			case 1:
				enki = "T "; break;
			case 2:
				enki = "G "; break;
			case 3:
				enki = "C "; break;
			}
			System.out.print(enki);
		}

	}

}
