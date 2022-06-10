package chap16;

import java.util.ArrayList;

public class Main612 {

	public static void main(String[] args) {

		// <クラス型>の中に、int型等の基本データ型は使えない
		ArrayList<Integer> points = new ArrayList<>();
		System.out.println("size:" + points.size());
		points.add(10);
		points.add(80);
		points.add(75);
//		System.out.println(points.remove(0));		
		System.out.println("size:" + points.size());
		
		//Integer型からint型に変換(キャスト)している
		for(int i = 0; i < points.size(); i++) {
			System.out.println(points.get(i));
		}

		if(points.contains(80)) {
			System.out.println("ある");
		}
		
		System.out.println(points.indexOf(75));

	}

}
