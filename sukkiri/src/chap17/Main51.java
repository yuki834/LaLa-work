package chap17;

import java.util.Scanner;

public class Main51 {

	public static void main(String[] args) {
		int[] array = new int[3];
		array[0] = 3;
		array[1] = 5;
		array[2] = 6;

		System.out.print("何番目？> ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		try {
			System.out.println(num + "番目:" + array[num]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("0～2でお願いします");
		} finally {
			scan.close();
		}
		
	}

}
