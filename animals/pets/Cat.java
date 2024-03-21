package animals.pets;

import animals.Aanimals;
import animals.Pets;

public class Cat extends Pets {

    public Cat(String type, String name, int date, String breed, String sound, String commands) {
        super(type, name, date, breed, sound, commands);
        // TODO Auto-generated constructor stub
    }

    // public static ArrayList<Aanimals> catsList = new ArrayList<>();

    public static void createAnimal(String n, int d, String b, String c) {
        Aanimals cat = new Cat("cat", n, d, b, "МЯУ", c);
        anList.add(cat);
        // cat.getInfo("cat");
        // System.out.println(cat);
    }

}
