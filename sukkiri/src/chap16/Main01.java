package chap16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import world.DeathBat;
import world.Goblin;
import world.Monster;
import world.WereWolf;

public class Main01 {

	public static void main(String[] args) {
		List<Monster> monsterList = new ArrayList<>();
		
		DeathBat bat = new DeathBat();
		bat.setName("地獄コウモリ");
		monsterList.add(bat);
		
		Goblin goblin = new Goblin();
		goblin.setName("凶悪ゴブリン");
		monsterList.add(goblin);
		
		WereWolf wolf = new WereWolf();
		wolf.setName("噛みつきウルフ");
		monsterList.add(wolf);
		
		// monsterList.remove(1);
		
		for (Monster m : monsterList) {
			System.out.println(m.getName());
		}
		
		System.out.println(monsterList.size());
		
		// イテレ＝タ
		Iterator<Monster> it = monsterList.iterator();
		while (it.hasNext()) {
			Monster m = it.next();
			System.out.println(m.getName());
		}
		
		
		
		

	}

}
