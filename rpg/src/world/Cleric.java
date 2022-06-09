package world;

import java.util.Random;

public class Cleric {
	
	private String name;
	private int hp = 50;
	public static final int MAX_HP = 50;
	private int mp = 10;
	public static final int MAX_MP = 10;

	public void selfAid(){
	
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("聖職者は「セルフエイド」という魔法を使った");
		System.out.println("HPが最大値まで回復した");
		System.out.println("mpを5使った");
	}
	
	/**
	 * 聖職者が祈ることで自分のMPを回復出来る。
	 * 回復量は祈る秒数+ランダム(3未満)
	 * ただし、最大MPを超えることはない
	 * @param sec int 祈る秒数
	 * @return int 回復量
	 */
	public int pray(int sec) {
		
		int hosei = new Random().nextInt(3);
		int kaihuku = sec + hosei;
		
		if((this.mp + kaihuku) > MAX_MP) {
			kaihuku = MAX_HP - this.mp;
		}
		
		this.mp += kaihuku;
		System.out.println("聖職者は" + sec + "秒祈った" );
		System.out.println("MPが" + kaihuku + "回復した" );
		return kaihuku;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public static int getMaxHp() {
		return MAX_HP;
	}

	public int getMp() {
		return mp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public String toString() {
		return "Cleric [name=" + name + ", hp=" + hp + ", mp=" + mp + "]";
	}
	
}


