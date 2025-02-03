package main;
import java.util.ArrayList;

public class Cave {
    private ArrayList<Monster> monsters = new ArrayList<>();


    public void addMonster(Monster monster) {
        monsters.add(monster);
    }

    public void listMonsters() {
        int i = 0;
        for (Monster monster : monsters) {
            monster.printInfo(i);
        }
    }
}