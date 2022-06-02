package ex11;

public class Main {

	public static void main(String[] args) {
		Book b = new Book("あああ",1111,"青","いいい",123);
		Computer c = new Computer("ううう",2222,"赤","fjda",154);
		
		System.out.println(b.name);
		System.out.println(b.price);
		System.out.println(b.color);
		System.out.println(b.isbn);
//		System.out.println(c.name, c.price, c.color, c.makerName);
		
	}

}
