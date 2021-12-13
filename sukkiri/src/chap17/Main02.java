package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main02 {

	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("Hello! World!");
		} catch (IOException e) {
			System.out.println("エラーです。中断します。");
			e.printStackTrace();
		}
		System.out.println("終了します。");

	}

}
