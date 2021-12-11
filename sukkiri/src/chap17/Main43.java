package chap17;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriterクラスは AutoClosableインターフェースを実装している。
 * https://docs.oracle.com/javase/jp/8/docs/api/java/io/FileWriter.html
 * @author USER
 *
 */

public class Main43 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt")){
			fw.write("hello, World! and Bye!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("エラーです。中断します。");
		}
		System.out.println("処理が終了しました");

	}

}
