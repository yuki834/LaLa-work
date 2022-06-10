package chap16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main620 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		Iterator<String> it = names.iterator();
			
		while(it.hasNext()) { // 次のデータがあればの意味
			String e = it.next(); // データの取得
			System.out.println(e);
		}
	}

}
