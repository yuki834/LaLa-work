package ex11;

public abstract class Asset {

	String name;
	int price;
	
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
}
