package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main42 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello, World!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("エラーです。中断します。");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
