package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main41 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello, World!");
			fw.close();
		} catch (IOException e) {
			System.out.println("エラーです。中断します。");
		}
		

	}

}
