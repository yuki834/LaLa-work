package ex11;

public class Main {

	public static void main(String[] args) {
		double bookW = 1.2;
		double comW = 25.6;
		
		Book b = new Book(
				"吾輩は猫である",
				2500,
				"黒",
				"0397-1259"
				);
		Computer c = new Computer(
				"Windows15",
				58900,
				"Red",
				"Microsoft"
				);
		
		b.setWeight(bookW);
		c.setWeight(comW);
		
		System.out.println("【選ばれた資産】");
		System.out.println("書籍");
		System.out.println("タイトル：" + b.name);
		System.out.println("価格：" + b.price + "円");
		System.out.println("色：" + b.color);
		System.out.println("ISBNコード：" + b.isbn);
		System.out.println("重さ：" + b.weight);
		
		System.out.println();
		System.out.println("電子機器");
		System.out.println("タイトル：" + c.name);
		System.out.println("価格：" + c.price + "円");
		System.out.println("色：" + c.color);
		System.out.println("メーカー：" + c.makerName);
		System.out.println("重さ：" + c.weight);
	}

}
