package animals.PaclAnimals;

import java.util.ArrayList;

import animals.Aanimals;
import animals.PackAnimals;
import animals.pets.Cat;

public class Donkey extends PackAnimals {

    public Donkey(String type, String name, int date, String breed, String sound, String commands) {
        super(type, name, date, breed, sound, commands);
        // TODO Auto-generated constructor stub
    }

    public static ArrayList<Aanimals> donkeysList = new ArrayList<>();

    public static void createAnimal(String n, int d, String b, String c) {
        Aanimals donkey = new Donkey("donkey", n, d, b, "И-аааааааааа", c);
        anList.add(donkey);
        // System.out.println(donkey);
    }

    public static ArrayList<Aanimals> getDonkeysList() {
        return donkeysList;
    }

    public static void setDonkeysList(ArrayList<Aanimals> donkeysList) {
        Donkey.donkeysList = donkeysList;
    }

}
