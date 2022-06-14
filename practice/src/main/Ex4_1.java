package main;

public class Ex4_1 {

	public static void main(String[] args) {
//		 int[] points = new int[4];
//		 double[] weight = new double[5];
//		 boolean[] answers = new boolean[3];
//		 String[] names = new String[3];
		 
		 int[] moneyList = {3, 4, 9};
		 System.out.println("1桁の数字を入力してください");
		 int input = new java.util.Scanner(System.in).nextInt();
		 for(int i = 0; i < moneyList.length; i++) {
			 if(input == moneyList[i]) {
				 System.out.println("アタリ");
			 }
		 }
		 System.out.println("お疲れさまでした");
	}
}
