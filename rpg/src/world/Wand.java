package world;

public class Wand {

	private String name;
	private double power;
	
	public Wand(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		if(name == null) {
			throw new IllegalArgumentException("3文字以上入力してください");
		}
		if(name.length() <= 2) {
			throw new IllegalArgumentException("3文字以上入力してください");
		}
		
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if (0.5 <= power && power <= 100 ) {
			this.power = power;
		}else {
			throw new IllegalArgumentException("0.5以上100以下で入力してください");
		}
		
	}
	

}
