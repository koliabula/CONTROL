package animals.PaclAnimals;

import java.util.ArrayList;

import animals.Aanimals;
import animals.PackAnimals;
import animals.pets.Cat;

public class Hourses extends PackAnimals {

    public Hourses(String type, String name, int date, String breed, String sound, String commands) {
        super(type, name, date, breed, sound, commands);
        // TODO Auto-generated constructor stub
    }

    public static ArrayList<Aanimals> hoursesList = new ArrayList<>();

    public static void createAnimal(String n, int d, String b, String c) {
        Aanimals hourses = new Hourses("hourses", n, d, b, "И-го-го", c);
        anList.add(hourses);
        // System.out.println(hourses);
    }

    public static ArrayList<Aanimals> getHoursesList() {
        return hoursesList;
    }

    public static void setHoursesList(ArrayList<Aanimals> hoursesList) {
        Hourses.hoursesList = hoursesList;
    }

}
