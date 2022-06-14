package world;

public class Cleric02 {

	String name;
	int hp = 50;
	final int maxHp = 50;
	int mp = 10;
	final int maxMp = 10;
	int sec = new java.util.Random().nextInt(3);
	
	public void selfAid(){
		
		System.out.println(name + "はセルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.maxHp;
		System.out.println("HPを全回復した");
	}
	
	public int pray(int sec) {
		
		System.out.println(this.name + "は" + sec + "秒祈った");
		int kaihuku = 3 + sec;
		this.mp += kaihuku;
		System.out.println("MPが" +kaihuku + "回復した");
		return kaihuku;
	}
}
