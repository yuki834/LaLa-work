package world;

public class Item {
	public String name;
	public int price;
	
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void use() {
		System.out.println(this.name + "を使う。");
	}

	public void takeItem() {
		System.out.println(this.name + "を取る");
	}

	public void useItem() {
		System.out.println(this.name + "を使う");
	}
}
