package animals;

import java.util.ArrayList;


public class Aanimals {
    public String Type;
    public String Name;
    public int Date;
    public String Breed;
    public String Sound;
    public String Commands;

    public static ArrayList<Aanimals> anList = new ArrayList<>();

    public Aanimals(String type, String name, int date, String breed, String sound, String commands) {
        Type = type;
        Name = name;
        Date = date;
        Breed = breed;
        Sound = sound;
        Commands = commands;

    }

    public static ArrayList<Aanimals> getAnList() {
        return anList;
    }

    public static void setAnList(ArrayList<Aanimals> anList) {
        Aanimals.anList = anList;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getSound() {
        return Sound;
    }

    public void setSound(String sound) {
        Sound = sound;
    }

    public String getCommands() {
        return Commands;
    }

    public void setCommands(String commands) {
        Commands = commands;
    }

    public static void createAnimal(String t, String n, int d, String b, String c) {
        Aanimals an = new Aanimals(t, n, d, b, "sound", c);
    }

    public void getInfo() {
        System.out.println("вид: " + getType() + " | "
                + "имя: " + getName() + " | "
                + "год рождения: " + getDate() + " | "
                + "порода: " + getBreed() + " | "
                + "звуки: " + getSound() + " | "
                + "команды: " + getCommands());
    }

}
