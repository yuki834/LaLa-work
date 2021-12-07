package ex11;

public class Main2 {
	public static void main(String[] args) {
		
		// Bookクラスのコンストラクターへ
		// 引き渡すための変数（引数）を定義
		String bookName = "鬼滅の刃10巻";
		int bookPrice = 580;
		String bookColor = "緑";
		String BookIsbn ="12345678";
		
		// コンストラクターを使ってBookクラスの
		// インスタンスを生成
		Book b = new Book(bookName, bookPrice, bookColor, BookIsbn);

		// 生成したBookクラス c の setter を利用して
		// weight フィールドを設定
		b.setWeight(0.2);
		
		// 生成したBookクラス b の getter を利用して
		// 各フィールドの情報を出力
		System.out.println("\n～～ 書籍情報 ～～");
		System.out.println("書籍名: " + b.getName());
		System.out.println("重さ: " + b.getWeight() + "kg");
		System.out.println("価格: " + b.getPrice());
		System.out.println("色: " + b.getColor());
		System.out.println("ISBN: " + b.getIsbn());
		
		// Computerクラスのコンストラクターへ
		// 引き渡すための変数（引数）を定義
		String comName = "Lavie";
		int comPrice = 126980;
		String comColor = "シルバー";
		String comMakerName ="NEC（日本電気株式会社）";

		// コンストラクターを使ってComputerクラスの
		// インスタンスを生成
		Computer c = new Computer(comName, comPrice, comColor, comMakerName);
		
		// 生成したComputerクラス c の setter を利用して
		// weight フィールドを設定
		c.setWeight(1.5);

		// Computerクラス c の getter を利用して
		// 各フィールドの情報を出力
		System.out.println("\n～～ コンピューター情報 ～～");
		System.out.println("製品名: " + c.getName());
		System.out.println("製品重量: " + c.getWeight() + "kg");
		System.out.println("価格: " + c.getPrice());
		System.out.println("カラー: " + c.getColor());
		System.out.println("メーカー: " + c.getMakerName());
		
	}

}
