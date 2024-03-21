package animals.PaclAnimals;

import java.util.ArrayList;

import animals.Aanimals;
import animals.PackAnimals;
import animals.pets.Cat;

public class Camel extends PackAnimals {

    public Camel(String type, String name, int date, String breed, String sound, String commands) {
        super(type, name, date, breed, sound, commands);
        // TODO Auto-generated constructor stub
    }

    public static ArrayList<Aanimals> camelsList = new ArrayList<>();

    public static void createAnimal(String n, int d, String b, String c) {
        Aanimals camel = new Camel("camel", n, d, b, "Я верблюд", c);
        anList.add(camel);
        // System.out.println(camel);
    }

    public static ArrayList<Aanimals> getCamelsList() {
        return camelsList;
    }

    public static void setCamelsList(ArrayList<Aanimals> camelsList) {
        Camel.camelsList = camelsList;
    }

}
