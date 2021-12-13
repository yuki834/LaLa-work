package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main01 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("Hello! World!");
		} catch (IOException e) {
			System.out.println("エラーです。中断します。");
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("クローズに失敗しました");
					e.printStackTrace();
				}
			}
		}
		System.out.println("終了します。");

	}

}
