package world;

public class Item {
	public String name;
	public int price;
	
	public Item() {
		this.name = "ITEM";
		this.price = 0;
	}
	
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

}
