package main;

public class Monster {
    private String type;
    private int health;

    public Monster(String type, int health) {
        this.type = type;
        this.health = health;
    }

    public void printInfo(int i) {
        System.out.println(++i + ": " + type + " / " + health + "HP");
    }
}