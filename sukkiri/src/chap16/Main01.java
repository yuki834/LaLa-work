package chap16;

import java.util.ArrayList;
import java.util.List;

import world.DeathBat;
import world.Goblin;
import world.Monster;
import world.WereWolf;

public class Main01 {

	public static void main(String[] args) {
		List<Monster> monsterList = new ArrayList<>();
		
		DeathBat deathBat = new DeathBat();
		deathBat.name = "地獄こうもり";
		monsterList.add(deathBat);
		
		Goblin goblin = new Goblin();
		goblin.name = "あくどいゴブリン";
		monsterList.add(goblin);
		
		WereWolf wereWolf = new WereWolf();
		wereWolf.name = "凶悪な狼";
		monsterList.add(wereWolf);
		
		for (Monster m : monsterList) {
			System.out.println(m.name);
		}
		
		monsterList.remove(1);

		for (Monster m : monsterList) {
			System.out.println(m.name);
		}
		
		
	}

}
