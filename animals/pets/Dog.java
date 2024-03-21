package animals.pets;

import java.util.ArrayList;

import animals.Aanimals;
import animals.Pets;

public class Dog extends Pets {

    public Dog(String type, String name, int date, String breed, String sound, String commands) {
        super(type, name, date, breed, sound, commands);
        // TODO Auto-generated constructor stub
    }

    public static ArrayList<Aanimals> dogsList = new ArrayList<>();

    public static void createAnimal(String n, int d, String b, String c) {
        Aanimals dog = new Dog("dog", n, d, b, "ГАВ", c);
        anList.add(dog);
        // System.out.println(dog);
    }

    public static ArrayList<Aanimals> getDogsList() {
        return dogsList;
    }

    public static void setDogsList(ArrayList<Aanimals> dogsList) {
        Dog.dogsList = dogsList;
    }
}
