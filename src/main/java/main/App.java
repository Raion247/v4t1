package main;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Monster newMonster = null;
        Cave newCave = new Cave();
        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä pelaajan nimi:");
        String name = sc.nextLine();
        Player newPlayer = new Player(name);
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää luolaan hirviö");
            System.out.println("2) Listaa hirviöt");
            System.out.println("3) Hyökkää hirviöön");
            System.out.println("4) Tallenna peli");
            System.out.println("5) Lataa peli");
            System.out.println("0) Lopeta peli");

            if (sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("Anna hirviön tyyppi:");
                        String type = sc.nextLine();
                        System.out.println("Anna hirviön elämän määrä numeroina");
                        String stringHealth = sc.nextLine();
                        int health = Integer.parseInt(stringHealth);
                        newMonster = new Monster(type, health);
                        newCave.addMonster(newMonster);
                        break;
                    case 2:
                        System.out.println("Luolan hirviöt:");
                        newCave.listMonsters();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
    }
}
