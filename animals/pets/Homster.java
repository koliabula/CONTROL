package animals.pets;

import java.util.ArrayList;

import animals.Aanimals;
import animals.Pets;

/**
 * Homster
 */
public class Homster extends Pets {

    public Homster(String type, String name, int date, String breed, String sound, String commands) {
        super(type, name, date, breed, sound, commands);
        // TODO Auto-generated constructor stub
    }

    public static ArrayList<Aanimals> homstersList = new ArrayList<>();

    public static void createAnimal(String n, int d, String b, String c) {
        Aanimals homster = new Homster("homster", n, d, b, "Я Хомяк", c);
        anList.add(homster);
        // System.out.println(homster);
    }

    public static ArrayList<Aanimals> getHomstersList() {
        return homstersList;
    }

    public static void setHomstersList(ArrayList<Aanimals> homstersList) {
        Homster.homstersList = homstersList;
    }

}